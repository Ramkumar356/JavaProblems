import java.util.Scanner;

public class firstjava {

    public static void main(String[] args){
        byte numbers = (byte) 256 ;
        short numbers1 = (short) 32768;
        double numbers5 = 9888889998883480527980574d;
        int doubleToint = (int) numbers5 ;
        int numbers2 = 25709524 ;
         numbers2 %= 2;
        long numbers3 = 458468465848884L;
        float convertlongTofloat = (float) numbers3;
        boolean bool = false;
        float number4 = 11.45F ;
        int convertFloatToInteger = (int) number4;
        char alpha ='a';
        /*System.out.println(alpha);
        System.out.println(numbers5);
        System.out.println(numbers);
        System.out.println(numbers1);
        System.out.println(numbers2);
        System.out.println("Hi");
        System.out.println("John wick");
        System.out.println(convertFloatToInteger);
        System.out.println(convertlongTofloat);?

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number :");
        int number1 = scanner.nextInt();


        System.out.print("enter the second number : ");
        int number2 = scanner.nextInt();

        System.out.println("which operation do you want ?");

        String  operation = scanner.next();


        if (operation.equals("sum")) {

            System.out.printf("%d + %d = %d", number1, number2, number1 + number2);
        }


           else if (operation.equals("sub")){
                System.out.printf("%d - %d = %d", number1,number2,number1 - number2);
            }
            else {
                System.out.printf("%s is not a operand",operation);
            }


        }






    }

