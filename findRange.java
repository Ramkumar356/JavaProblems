package binarySearchProblems;

import java.util.Arrays;

public class findRange {
    public static void main(String[] args){
        int[] output = findRangeBetweenTargetNumber(new int[]{1,2,3,4,5,5,5,5,6,7,8},5);
        System.out.println(Arrays.toString(output));
        int[] output1 = findRangeBetweenTargetNumber(new int[]{1,1,1,1,3,6,7,8},1);
        System.out.println(Arrays.toString(output1));
        int[] output2 = findRangeBetweenTargetNumber(new int[]{5, 7, 7, 8, 8, 10},7);
        System.out.println(Arrays.toString(output2));
        int[] output3 = findRangeBetweenTargetNumber(new int[]{5, 7, 7, 8, 8, 10},77);
        System.out.println(Arrays.toString(output3));
        int[] output4 = findRangeBetweenTargetNumber(new int[]{5, 7, 7, 8, 8, 8},8);
        System.out.println(Arrays.toString(output4));
    }

    public static int[] findRangeBetweenTargetNumber(int[] input,int targetNum){
        int startIndex = 0;
        int endIndex = input.length-1;
        int[] outputRange = new int[]{-1,-1};
        int midIndex = (startIndex + endIndex) / 2;
        while (endIndex - startIndex != 1){
            if (input[midIndex] == targetNum){
                int startRange = midIndex;
                int endRange = midIndex;
                while (outputRange[0] == -1 || outputRange[1] == -1){
                    if (startRange == -1){
                        outputRange[0] = 0;
                    }
                    if (endRange == input.length){
                        outputRange[1] = input.length-1;
                    }
                    if (outputRange[0] == -1) {
                        if (input[startRange] != targetNum) {
                            outputRange[0] = startRange+1;
                        }
                    }
                    if (outputRange[1] == -1) {
                        if (input[endRange] != targetNum) {
                            outputRange[1] = endRange-1;
                        }
                    }
                    startRange--;
                    endRange++;
                }
                break;
            }
            if (input[midIndex] > targetNum){
                endIndex = midIndex;
                midIndex = (startIndex + midIndex) / 2;
            }
            if (input[midIndex] < targetNum){
                startIndex = midIndex;
                midIndex = (startIndex + endIndex) / 2;
            }
        }
        return outputRange;
    }
}

// finding range for target number using binary search
// input = [1,2,3,4,5,5,5,5,6,7]  targetnumber = 5
// range =  0,1,2,3,4,5,6,7,8,9
// output = [4,7]
// midIndex = input.length / 2
// while(endindex-startindex == 1)
// if midindex == targetNumber
// startrande = midindex
// endRange = midindex
// while(output[0] & output[1] != null)
// if(output[0] != null)
// if(input[startrange-1] != targetNumber)
// output[0] = startrange
// if(input[endfRange+1] != targetNumnber)
// output[1] = endRange
//
