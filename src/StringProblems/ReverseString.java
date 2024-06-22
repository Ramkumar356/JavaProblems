package StringProblems;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
         int[] output = new int[2];

        Reverse r = new Reverse();
       /* System.out.println(output[0]+ " " + output[1]);
        output= r.sum(new int[]{1, 2, 3, 4}, 3);
        System.out.println(output[0]+ " " + output[1]);
        int input = 123;
        System.out.println(input);
        int temp;
        temp = input % 10;
        System.out.println(input);
        System.out.println(temp);
        System.out.println(input/10);
        float temp1 = input/10;
        System.out.println(temp1);
        int output2 = r.reverseNumber(123);
        System.out.println(output2);
        r.reverse("Gokul");
        String output3 =  r.reverse("Gobi");
        System.out.println(output3);
        r.reverseNumber(987654321);
        int output4 = r.reverseNumber(987654321);
        System.out.println(output4); */
        int[] output5 =  r.twoNumberSum(new int[]{3, 5, -4, 8, 11, 1, -1, 6},10);
        System.out.println(Arrays.toString(output5));
        r.numbers();
//        int output6 = r.numbersAdding(123);
//        System.out.println(output6);





    }

    static class Reverse {
    public String reverse(String input)
    {

        String Reverse = " ";
        int num = input.length()-1;
        for (int i = num; i >= 0; i--)
        {

            Reverse = Reverse+input.charAt(i);
        }
        return Reverse;
    }

         public int[] twoNumberSum(int[] array, int targetSum) {
            for(int i = 0;i < array.length;i++)
            {

                    for(int j = i+1; j < array.length; j++)
                    {
                        if (array[i] + array[j] == targetSum)
                        {
                            int[] arrays = new int[]{array[i],array[j]};
                            return arrays;
                        }
                    }

            }
            return new int[]{0};
        }

        public int[] sum(int[] num, int target) {
            for (int i = 0; i < num.length; i++) { //i = 0
                if (num[i] < target) { // 1 < 3 = true
                    for (int j = i + 1; j < num.length; j++) { // j = 1 ;
                        if (num[i] + num[j] == target) { // 1 + 2 = 3 == 3 true

                            int[] number = new int[2];
                            number[0] = i;
                            number[1] =j;
                            return number;
                            // return array data type

                        }
                    }
                }
            }
            return new int[]{0};
        }

        public int reverseNumber(int input){

         int reverseNumber = 0;
         for(int i = 0;i < 9; i++)
         {
             int remainder = input % 10;
             reverseNumber = reverseNumber * 10 + remainder;
             input = input / 10;
         }
         return reverseNumber;
        }

        public void numbers()     // 3 - gobi , 5 - gokul , 7 - dhaksith , 3 and 5 - gobigokul ,
        // 5 and 7 - gokuldhaksith , 3 and 7 - gobidhaksith , 3 and 5 and 7 -  gobigokuldhaksith
        {
            for(int i = 1; i <= 200;i++)
            {
                if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0) // 3 - T , 5 - F , 7 - F
                {
                    System.out.println("Gobi");
                }
                else if (i % 5 == 0 && i % 3 != 0 && i % 7 != 0) // 3 - F , 5 - T , 7 - F
                {
                    System.out.println("Gokul");
                }
                else if (i % 7 == 0 && i % 3 != 0 && i % 5 != 0){
                    System.out.println("Dhaksith"); // 3 - F , 5 - F , 7 - T

                }else if (i % 3 == 0 && i % 5 == 0 && i % 7 != 0) {   // 3 - T , 5 - T , 7 - F
                    System.out.println("GobiGokul");

                }
                else if (i % 5 == 0 && i % 7 == 0 && i % 3 != 0)    // 3 - F , 5 - T, 7 - T
                {
                    System.out.println("GokulDhaksith");
                }
                else if (i % 3 == 0 && i % 7 == 0 && i % 5 != 0)    // 3 - T , 5 - F , 7 - T
                {
                    System.out.println("GobiDhaksith");
                }
                else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0)    // 3 - T , 5 - T , 7 - T
                {
                    System.out.println("GobiGokulDhaksith");
                }
                else {
                    System.out.println(i);
                }
            }
        }

        public void numbers1()     // 3 - gobi , 5 - gokul , 7 - dhaksith , 3 and 5 - gobigokul ,
        // 5 and 7 - gokuldhaksith , 3 and 7 - gobidhaksith , 3 and 5 and 7 -  gobigokuldhaksith
        {
            for(int i = 1; i <= 200;i++)
            {
                if (i % 3 == 0 && i % 5 == 0) // 3 - T , 5 - F , 7 - F
                {
                    System.out.println("Gobi");
                }
                else if (i % 3 == 0 ) // 3 - F , 5 - T , 7 - F
                {
                    System.out.println("Gokul");
                }
                else if (i % 5 == 0 ){   // 3 - F , 5 - F , 7 - T

                }else if (i % 7 == 0) {   // 3 - T , 5 - T , 7 - F
                    System.out.println("GobiGokul");


                }else {
                    System.out.println(i);
                }
            }
        }

        public int numbersAdding(int number)
        {
            int value = 0;
            for(int i = 0;i < 3 ;i++)
            {
                int remainder = number % 10;
                value = value + remainder;
                number = number / 10;
            }
            return value;

        }
        //input = 123
        //output = 6 - 1 + 2 + 3

        // input = 123
        // 123 % 10 - 3
        // remainder = 3
        // value 3
        // input = 123 / 10 = 12
        // 12 % 10 - 2
        // remainder = 2
        // value = 3 + 2 - 5
        // input = 1 % 10 - 1
        // remainder = 1
        // value = 5 +1




        // input = 123
        // output = 321
        // reversenumber = 3
        // reversenumber * 10 = 30 + 2 = 32
        // reversenumber * 10 = 320+ 1 =321
        // 123 % 10 = 3
        // 123 / 10 = 12
        // input 12 % 10 = 2
        // input 12 /10 =1
        // input 1 % 10 =1
        //

        // input = 1,2,3,4,5,6,15
        // output = 1,2,"gobi",4,"gokul","gobi","gobigokul"

        // input i / 3 = 1 % 3 == 0 && 1 % 5 != 0
        // gobi
        // else if 1 % 5 == 0 && 1 % 3 != 0
        // gokul
        //else if 1 % 3 == 0 && 1 % 5 == 0
        // gobigokul
        // else input
        // input 2 /


    }

}
