import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    public static void main(String args[])
    {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("Enter the fibonacci series");
        System.out.println("enter the terms");
        int n=scan.nextInt();
        int a=0,b=1,c;
        System.out.print(a+","+b+",");

        for (int i=0;i<n-2;i++)
        {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }*/
        int arr[]=new int[5];
        int arr1[]=new int[5];
        for (int i=0;i<arr.length-1;i++){
            int a1=arr[i];

            arr1[i]=a1*a1;

        }

        System.out.println(Arrays.toString(arr1));
    }
}
