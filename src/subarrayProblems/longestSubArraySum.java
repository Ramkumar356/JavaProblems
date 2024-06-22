package subarrayProblems;

import java.util.Arrays;

public class longestSubArraySum {
    public static void main(String[] args){
        int[] output = largestSubArraySum(new int[]{1,2},0);
        System.out.println(Arrays.toString(output));
        int[] output1 = largestSubArraySums(new int[]{1,2,3,4,3,3,1,2,1,2},0);
        System.out.println(Arrays.toString(output1));
    }
    public static int[] largestSubArraySum(int[] input, int targetSum){
        int[][] indexValue = new int[1][2];
        for (int i = 0; i < input.length; i++){
            int endIndex = input.length-1;
            int sumValue = 0;
            for (int j = i; j < input.length; j++){
                sumValue += input[j];
                }
            if (sumValue == targetSum){
                indexValue[0] = new int[]{i,endIndex};
                return indexValue[0];
            }
            while(endIndex >= i){
            if (sumValue == targetSum) {
                int indexSumValue = endIndex - i;
                int indexArraySumValue = indexValue[0][1] - indexValue[0][0];
                if (indexSumValue > indexArraySumValue) {
                    indexValue[0][0] = i;
                    indexValue[0][1] = endIndex;
//                    indexValue[0] = new int[]{i,endIndex};
                }

            }
                sumValue -= input[endIndex];
                endIndex--;
            }
        }
        return indexValue[0];
    }


    public static int[] largestSubArraySums(int[] array, int targetSum){
        int sumValues = 0;
        int[][] indexValues = new int[1][2];
        for(int i = 0; i < array.length; i++){
            int currentEndIndex = array.length-1;
            int currentStartIndex = i;
            for(int j = currentStartIndex; j < array.length; j++){
                sumValues += array[j];
            }
            if (sumValues == targetSum){
                return indexValues[0] = new int[]{currentStartIndex,currentEndIndex};
            }
            while(currentEndIndex >= currentStartIndex){
                if (sumValues == targetSum){
                    int currentIndexSumValue = currentEndIndex - currentStartIndex;
                    int indexSumValue = indexValues[0][1] - indexValues[0][0];
                    if (currentIndexSumValue > indexSumValue){
                        indexValues[0] = new int[]{currentStartIndex,currentEndIndex};
                    }
                }
                sumValues -= array[currentEndIndex];
                currentEndIndex--;
            }
        }
        return indexValues[0];
    }
}

//
//    Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".

// input[] = {"gobi","gokul"}




// input = 1,2,5,5,6,2,2,1   targetsum = 10
//         0 1 2 3 4 5 6 7
// [6,2,2] 3 index
// [5,5] 2 index
// question * what will do if we find the two same length largest subarray
// output = 6,2,2
// arraylist value
// for loop i = 0
// for loop j = input.lenth-1
// subArraySumValue == 0
// i-j > input[]value
// input1[][] = i and j
// arraylist.add i and j
//
//