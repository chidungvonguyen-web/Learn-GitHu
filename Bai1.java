import java.util.*;
public class Bai1
{
    public static double average(int[] a)
    {
        int sum =0;
        for(int x:a)
            sum +=x;
        return (double) sum / a.length;
    }
    public static double median(int[] a)
    {
        Arrays.sort(a);
        int n = a.length;
        if(n%2 == 1)
            return a[n/2];
        else
            return (a[n/2 -1] + a[n/2]) /2.0;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Average:"+ average(arr));
        System.out.print("Median:"+ median(arr));
    }
}