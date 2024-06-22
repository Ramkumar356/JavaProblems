import java.util.Scanner;

public class gokul {
    public static void main(String[] args){

        int number ;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();


        switch (number){
            case 53 :
                System.out.println("this is your number" + number);


            case 24 :
                System.out.println("this is your number" + number);
                break;

            case 48 :
                System.out.println("this is your number" + number);



            case 68 :
                System.out.println("this is your number" + number);
                break;
            default:
                System.out.println("this number is not in the list");
        }
    }
}
