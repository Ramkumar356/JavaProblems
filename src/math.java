import java.util.Scanner;

public class math {
    public static void main (String [] args){

        byte number = 100;
        float number1= 10394.12f;

        System.out.println(Math.max(number,number1));
        System.out.println(Math.ceil(number1));

        String name;
        int number3;
        int number2;
        Scanner input = new Scanner(System.in);
        name = input.next();
        number3 = input.nextInt();
        number2 = input.nextInt();


        System.out.println("HI " + name.toUpperCase() + " "+"welcome to java" );
        System.out.println(number3+number2 +" " + "is your answer");
    }
}
