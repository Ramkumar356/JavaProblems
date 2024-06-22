package StringProblems;

import java.util.Arrays;

public class Problem {
    public static void main(String[] args){
//        int[] output = twoNumberSum(new int[]{2,3,4,5},9);
//        System.out.println(Arrays.toString(output));
//        int[] output2 = names("gobi   gokulugiudguiegeu dhaksith");
//        System.out.println(Arrays.toString(output2));
//        int[] output3 = names1("gobi    gokulugiudguiegeu               3 dhaksith");
//        System.out.println(Arrays.toString(output3));
        int[] output4 = name2("gobi  gokul        dhaksith");
        System.out.println(Arrays.toString(output4));
    }

    public static int[] twoNumberSum(int[] input,int target){
        for ( int i = 0 ; i < input.length;i++){
            for(int j = i + 1; j < input.length;j++){
                if (input[i] + input[j] == target){
                    int[] indexValue = new int[2];
                    indexValue[0] = i;
                    indexValue[1] = j;
                    return indexValue;
                }
            }
        }
        return new int[0];
    }



    // input = {2,3,4,5} target = 9
    // output = 2,3
    // 2 + 3 = 5 == target - f
    // 2 + 4 = 6 == target - f
    // 2 + 5 == 7 == target - f
    // 3 + 4 = 7 == target - f
    // 3 + 5 = 8 == target - f
    // 4 + 5 = 9 == target - t



    public static int[] names(String name){
        int[] output = new int[2];
        for (int i = 0; i < name.length();i++){
            if (name.charAt(i) == ' '){
                if (output[0] != 0){
                    output[1] = i - 1;
                    return output;
                }
                output[0] = i + 1;
            }
        }
        return output;
    }


    public static int[] names1(String name){
        int[] output = new int[2];
        for (int i = 0; i < name.length();i++){
            if (name.charAt(i) == ' '){
                if (output[0] != 0){
                    output[1] = i - 1;
                    return output;
                }
                if (name.charAt(i+1) != ' '){
                    output[0] = i + 1;
                }

            }
        }
        return output;
    }

    public static int[] name2(String name){
        int[] output = new int[2];
        for (int i = 0; i < name.length();i++){
            if (name.charAt(i) == ' '){
                if (output[0] != 0){
                    output[1] = i-1;
                    return output;
                }
                if (name.charAt(i+1) != ' '){
                    output[0] = i + 1;
                }

            }
        }
        return output;
    }


    // input = gobi gokul dhaksith
    // output = 5,9
    // g == " "
    // o == " "
    // b == " "
    // i == " "
    // " " == " "
    // output[0] = currentindexvalue + 1
    // g == " "
    // o == " "
    // k == " "
    // u == " "
    // l == " "
    // " " == " "
    // output[1] = currentindexvalue - 1



}
