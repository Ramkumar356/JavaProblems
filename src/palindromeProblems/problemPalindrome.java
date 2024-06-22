package palindromeProblems;

public class problemPalindrome {
    public static void main (String[] args){
//        boolean output = palindrome("ba");
//        System.out.println(output);
        boolean output2 = palindromeCheck("acba");
        System.out.println(output2);
    }
    public static boolean palindrome(String input){
        int inputvalue = input.length()/2;
        int j = input.length()-1;
        int number = 0;
        for(int i = 0; i < inputvalue ; i++){
            if(input.charAt(i) == input.charAt(j)){
                number += 1;
            }
            j--;
        }
        if(number == inputvalue){
            return true;
        }else{
            return false;
        }
    }

    public static boolean palindromeCheck(String palindromeName){
        int startIndex = 0;
        int lastIndex = palindromeName.length()-1;
        while(startIndex != lastIndex){
            if(palindromeName.charAt(startIndex) != palindromeName.charAt(lastIndex)){
                 return false;
            }
            startIndex++;
            lastIndex--;
        }
        return true;
    }


    // input - 1234321    ,  12345
    // output - true      ,  false
    //input reverse
    // input reverseVariable = 1 2 3 4 3 2 1
    //    indexvalue           6 5 4 3 2 1 0
    // input == reverseVariable
    // 1 == 1
    // 2 == 2
    // 3 == 3
    // 4 == 4
    // 3 == 3
    // 2 == 2
    // 1 == 1
    // retuern true
    //else return false


    // input - 12321
    // output - true

    //

    // input - abcba
    // output -true

    //input - a == a - true
    // input - b 1 == b 3 - true
    //
}
