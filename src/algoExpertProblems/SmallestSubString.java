package algoExpertProblems;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class SmallestSubString {
    public static void main(String[] args){
       String output =  findingSmallestSubString("##*","#*");
       System.out.println(output);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static String findingSmallestSubString(String bigString, String smallString){
        HashMap<Character,Boolean> map = new HashMap();
        int startIndex = 0;
        int endIndex = bigString.length();
        Set set = new HashSet();
        for (int i = 0; i < smallString.length();i++){
            map.put(smallString.charAt(i),true);
            set.add(smallString.charAt(i));
        }
        String currentBigString = bigString;

        int swappingVariable = 0;
        if (smallString.length() == 1){
            return smallString;
        }
        for(int i = 0; i <= bigString.length()-smallString.length();i++){
            int currentIndex = i;
            int noOfSmallStringFound = 0;
            int startingIndex = -1;
            while (currentIndex < bigString.length()){
                if (set.contains(currentBigString.charAt(currentIndex))){
                    if (startingIndex != -1){
                        swappingVariable = startingIndex + currentIndex;
                        startingIndex = swappingVariable - currentIndex;
                    }else{
                        startingIndex = currentIndex;
                    }
                    noOfSmallStringFound += 1;
                }
                if (noOfSmallStringFound >= smallString.length()){
                    break;
                }
                currentIndex++;
            }
            if (currentIndex - startingIndex < endIndex - startIndex) {
                startIndex = startingIndex;
                endIndex = currentIndex;
            }
            if (noOfSmallStringFound < smallString.length()){
                return smallestSubStringPrinting(bigString,startIndex,endIndex);
            }
        }
        return smallestSubStringPrinting(bigString,startIndex,endIndex);

    }
    public static String smallestSubStringPrinting(String bigString,int startIndex, int endIndex){
        String output = "";
        for (int i = startIndex; i <= endIndex; i++){
            output += bigString.charAt(i);
        }
        return output;
    }
}

// bigString = "avbgrthdef$c"
// smallString = "tf"
// output = "thdef"
// subString1 = avbgrthdef$c
// subString2 = vbgrthdef$c
// subString3 = bgrthdef$c
// subString4 = grthdef$c
// subString5 = rthdef$c
// subString6 = thdef$c
// String currentSubString = input.length
//
// for loop i = 0; i < input.length-output.length
// int noOfSmallStringsFounds = 0;
// int endindex = i;
// while(noOfSmallStringsFounds <= smallString.length)
// using haspmap
// if (map.get(curentString(endINedx)))
// noOfString += 1;
// if( noOfSmallStringsFound == smallString)
// if i-endindex < startIndex - endindex
// int startINdex = i
// int endINdex = endINdex
// if noOfString < smallString
// return
// for loop i = startindex; i <= endindex
// return output