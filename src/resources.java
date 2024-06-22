import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.*;
import  java.util.*;

public class resources {
    static FileInputStream fi;
    static Scanner sc;

    static void divide() throws Exception {
        try {


            fi = new FileInputStream("/Users/91950/Documents/test.txt");
            sc = new Scanner(fi);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(a / b);
        }
        finally
        {

            fi.close();
            sc.close();
        }
    }
    public static  void main(String args[]) throws Exception
    {
        try {


            divide();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        int x= sc.nextInt();
        System.out.println(x);



    }
}
