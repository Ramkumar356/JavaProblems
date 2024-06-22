import java.util.Arrays;
public class roughwork {
    public static void main(String[] args){
//        boolean output = StringReverse("abccba");
//        System.out.println(output);
//
//        boolean output1 = numberRev(121);
//        System.out.println(output1);

        boolean output2 = palindrome("abbbbbbbbbna");
        System.out.println(output2);

        int[] output3 = number(new int[]{1,2,3,4,5,6,7,8},4);
        System.out.println(Arrays.toString(output3));
    }

    public static boolean StringReverse(String reverseString){
        String reversedString = " ";
        int reverseStringIndex = 0;
        for (int i = reverseString.length()-1; i >= 0;i--){
            reversedString += reverseString.charAt(i);
            if (reversedString.charAt(reverseStringIndex) != reverseString.charAt(reverseStringIndex)){
                return false;
            }
        }
       return true;
    }

    public static boolean numberRev(int number){
        int reverseNumber = 0;
        while(number != 0){
            int remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number / 10;
        }
       if (reverseNumber == number){
           return true;
       }
       return false;
    }

    public static boolean palindrome(String input){
        int startIndex = 0;
        int endIndex = input.length()-1;
        while(startIndex != endIndex){
            if (input.charAt(startIndex) != input.charAt(endIndex)){
                return false;
            }
            startIndex++;
            endIndex--;
        }
        return true;
    }

    public static int[] number(int[] number,int target){

        for (int i = 0; i < number.length;i++){
            for (int j = i+1;j < number.length;j++){
                if (number[i]+number[j] == target){
                    int[] output = new int[2];
                    output[0] = i;
                    output[1] = j;
                    return output;

                }
            }
        }
        return new int[]{0};
    }
}
