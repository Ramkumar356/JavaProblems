package palindromeProblems;

public class PalindromNumber {
    public static void main(String[] args){
//        boolean output = PalindromeNum(new int[]{18});
//        System.out.println(output);
        boolean output1 = PalindromeNum(12321);
        System.out.println(output1);

    }
        public static boolean palindromeNumbers(String palindrome){
        int palindromeIndex = palindrome.length()-1;
        for (int i = 0 ; i < palindrome.length(); i++){
            if (palindrome.charAt(i) == palindrome.charAt(palindromeIndex)){

            }else{
                return false;
            }
            palindromeIndex--;
        }
        return true;
    }


   public static boolean pal(int palindrome){
        int reversePalindrome = 0;
        for (int i = 0;i <= palindrome;i++){
            int remainder = palindrome % 10;
            reversePalindrome = reversePalindrome * 10 + remainder;
            palindrome = palindrome / 10;
        }
        if (palindrome == reversePalindrome){
            return true;
        }
        return false;
   }

    public static boolean PalindromeNum(int PalindromeNum){
        int reverse = 0;
        int Pal = PalindromeNum;
        for (int i = 0;i < PalindromeNum;i++){
            int remainder = Pal % 10 ;
            reverse = reverse * 10 + remainder;
            Pal = Pal / 10;
        }
        if (reverse == PalindromeNum){
            return true;
        }
        return false;
    }

}
