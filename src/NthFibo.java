 class Fibo
 {
     public int fibon(int n)
     {
         if (n == 2)
         {
             System.out.println(1);

         } else if (n == 1) {
             System.out.println(0);

         }
         else
         {
             return fibon(n -1) + fibon(n - 2);

         }
         return 0;
     }


}
public class NthFibo {
    public static void main(String args[])
    {
       Fibo f = new Fibo();
       f.fibon(4);


    }
}
