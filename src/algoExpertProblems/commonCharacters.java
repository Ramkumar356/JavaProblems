package algoExpertProblems;

import java.util.Set;
import java.util.HashSet;
public class commonCharacters {
    public static void main(String[] args){
      //  char[] output = algoExpertProblems.commonCharacters(new String[]{"abcdef","fedcba","abcefd","aefbcd","efadbc","effffffffbcda","eeeefffffcccccbbbbbdddddaaa","*******abcdef*******"});
//        System.out.println(output);
        char[] output1 = commonCharacter(new String[]{"ab","ba"});
        System.out.println(output1);
    }
    public static char[] commonCharacters(String[] input){
        char[] commonCharacters = new char[]{};
        Set set = new HashSet();
        String firstString = input[0];
        for (int i = 0; i < input.length; i++){
            int startIndex = 0;
            set.remove(input[i]);
            set.add(input[i+1]);
            while (startIndex < input.length) {
                if (!set.contains(firstString.charAt(startIndex))) {
                    break;
                }
                startIndex++;
            }
            if (startIndex == input.length){
                commonCharacters[i] = firstString.charAt(i);
            }
        }
        return commonCharacters;

    }

    public static char[] commonCharacter(String[] input){
        int index = 0;
        String firstString = input[0];
        char[] commonCharacters = new char[firstString.length()];
        boolean isStringContainChar = true;
        for (int i = 0; i < input.length; i++){
            int count = 0;
            for (int j = 1; j < input.length; j++){
                for (int k = 0; k < input[j].length(); k++){
                    if (k >= input[j].length()){
                        break;
                    }
                    if (firstString.charAt(i) == input[j].charAt(k)){
                       isStringContainChar = true;
                       break;
                    }
                    if (j < input.length){
                       isStringContainChar = false;
                    }
                }
                if (isStringContainChar == true){
                    count++;
                }
                }
            if (count == input.length-1){
                commonCharacters[index] = firstString.charAt(i);
                index++;
            }
        }
        return commonCharacters;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
// input = ["abcdef","fedcba","abcefd","aefbcd","efadbc","effffffffbcda","eeeefffffcccccbbbbbdddddaaa","*******abcdef*******"];
// output = "abcdef";  input[1].contains (input[0].charAt(1))
// input[0] contains (a) input[1] contains (a) input[2] contains (a) input[3] contains (a) input[4] contains (a) input[5] contains (a)
// input[6] contains (6) input[7] contains (a)
// String firstString = input[0];
// firstString.charAt(0) == input[1].charAt(0) false
// firstString.charAt(0) == input[1].charAt(1) false
// firstString.charAt(0) == input[1].charAt(2) false
// firstString.charAt(0) == input[1].charAt(3) false
// firstString.charAt(0) == input[1].charAt(4) false
// firstString.charAt(0) == input[1].charAt(5) true
// for i = 0;
// for j = 0;
// for k = 0;

// set set = new HashSet();
// for loop
// i = 0; i < input.length
// set.add(input[i+1])
// j = 0; j < input.length; j++
// if(!set.contains(firstString.charAt(0)))
//   break;
//  set.remove(firstString.charAt(0))
// if (j == input.length-1)
//  String[0] = firstString.charAt(0)
//
