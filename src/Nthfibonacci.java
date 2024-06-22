import java.util.Arrays;
import java.util.Scanner;

class fibo
{
    public int Nthfibo(int Seq)
    {
        int a = 0;
        int b = 1;
        int[] c = new int[Seq];
        c[0]=a;
        c[1]=b;

        for (int i = 2;i < Seq;i++)
        {
            int d = a+b;
            a = b;
            b = d;
            c[i] = d;

        }

        System.out.println(Arrays.toString(c));


        System.out.println(c[Seq-1]);

        return 0;
    }
}
public class Nthfibonacci {
    public static void main(String args[])
    {
        fibo F = new fibo();
        F.Nthfibo(6);

    }
}
