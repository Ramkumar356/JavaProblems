import java.util.Scanner;

public class loop {
    public static void main(String[] args){

        for (int intitial = 0; intitial < 5 ; intitial ++ ){
            System.out.println("dhakshubhai");
        }

        int number ;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        while (number > 10){

            System.out.println("Dhakshubhai");
            number --;

        }
        int numbers = 0;
        do {
            System.out.println("DHAKSHUBHAI");
            numbers ++;
        }while (numbers < 5);

        String fruits[] = {"apple","mango","orange"};
        for (int i = 3 ; i > fruits.length ; i--){
            //             <                  i++
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits){


            System.out.println(fruit);
        }



    }
}
