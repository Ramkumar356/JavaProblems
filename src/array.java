import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main (String[] args ){
        int a[] ={15,68,545,48,684,84,834};
        //a[1] = 59;
        //a[4] = 48;
        char b[] = new char[]{'a','b','c','d'};
        //b[0] = 'a';
        //b[3] = 'b';

        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.toString(a));
        byte number = 10;
        byte number1 = 30;

        int number2 = number1 + 10;

        System.out.println(number2);

        int name[] ={43,65,565};
       // int name1 = 65;

        System.out.println(name[2]);


        int num = 56;
        int num1 = 67;

        if (num > num1){
            System.out.println("hi");
        }
        else
            System.out.println("bye");



            for (int intitial = 0; intitial < 5 ; intitial ++ ){
                System.out.println("dhakshubhai");
            }




            Scanner scanner = new Scanner(System.in);
            String  name1 = scanner.next();

            String name2 = scanner.next();

            if (name1.equals(name2)){
                System.out.println("correct");
            }







    }
}
