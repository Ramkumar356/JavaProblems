import java.util.Scanner;

public class ifcondition {
    public static void main (String args[])
    {
        Scanner scr=new Scanner(System.in);
        /*int a=scr.nextInt();
        int b=scr.nextInt();
        int c=scr.nextInt();
        int d=scr.nextInt();*/
        int year=scr.nextInt();
       /* if(a>b&&a>c)
        {
            System.out.println(a);
        }
        else if (b>c)
        {
            System.out.println(b);
        }
        else{
            System.out.println();

        }




       if (d%2==0){
            System.out.println("the number is even ");

        }
        else {
            System.out.println("the number is odd");



        }

     /*   if(num.matches("[01]+")){
            System.out.println("the number is binary number");
        }*/
        if(year==1){
            System.out.println("monday");

        }else if(year==2){
            System.out.println("tuesday");

        }else if(year==3){
            System.out.println("wednesday");
        } else if (year==4) {
            System.out.println("thursday");

        } else if (year==5) {
            System.out.println("friday");

        }
    }
}
