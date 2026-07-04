import java.util.*;
public class Bai3
{
    public static int[] processArray(int[] list) 
    {
        int[] result = new int[list.length];
        for (int i = 0; i < list.length; i++) 
        {
            int x = Math.abs(list[i]);
            if (x % 2 == 0)
                x *= 2;
            result[i] = x;
        }
        return result;
    }
    public static void main(String[] args) 
    {
        int[] a = {-3, 4, -6, 5};
        int[] b = processArray(a);

        for (int x : b)
            System.out.print(x + " ");
    }
}

