package StringProblems;

public class longestCommonPrefix {
    public static void main(String[] args){
        String output = longestCommonPrefix(new String[]{"gobi","gokul","goaksith"});
        System.out.println(output);
    }
   public static String longestCommonPrefix(String[] array){
        String commonPrefix = "";
        String firstPrefixString = array[0];
        if (array.length < 2){
            return "One String in Array";
        }
        for (int i = 0; i < firstPrefixString.length(); i++){
            int currentIndex = i;
            for (int j = 1; j < array.length; j++) {
                if (currentIndex < array[j].length()) {
                    if (firstPrefixString.charAt(i) != array[j].charAt(i)) {
                        return commonPrefix;
                    }
                } else {
                    return commonPrefix;
                }

            }
            commonPrefix += firstPrefixString.charAt(i);
        }
        return commonPrefix;
    }
}


// input = {"gobi","gobi"}
// output = "go"
// gobi - g
// gokul - g  - true
// o == o - true
// b == k
// String firstStringValue = input[0];
// String string = "";
// for loop i =0; i < input[0].length; i++
// for int j= 1 ; j < input.length; j++
//  firstStringValue.charAt(i) != input[j].charAt(i);
// return string;
//  g == g   g == g   g == g
//  g == v   o == o   o == o
//  o == o   b == k   b == k
//  o == i
// String += input[i];
//
//  return string;
// firstString.