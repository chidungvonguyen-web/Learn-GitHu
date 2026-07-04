import java.util.*;
public class Bai2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap cau: ");
        String sentence = sc.nextLine().toLowerCase();
        String token = sc.nextLine().toLowerCase();
        StringTokenizer st = new StringTokenizer(sentence, " ");
        int count = 0;

        while (st.hasMoreTokens()) 
        {
            if (st.nextToken().equals(token))
                count++;
        }
        System.out.println("So lan xuat hien: " + count);
    }
}
