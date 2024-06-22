import java.util.Scanner;

public class condition {
    public  static  void  main (String[] args){

        int oneplus = 50000;
        int samsung = 80000;
        int apple = 100000;
        int cusAmount ;
        Scanner input = new Scanner(System.in);
        cusAmount = input.nextInt();

        if (cusAmount > apple){
            System.out.println("you can buy apple");
        }
        else if (cusAmount > samsung) {
            System.out.println("you can buy samsung");

        }
        else if (cusAmount > oneplus){
            System.out.println("you can buy oneplus");
        }
        else {
            System.out.println("this money is not enough to buy a phone");
        }
        System.out.println(5*oneplus);
    }
}
