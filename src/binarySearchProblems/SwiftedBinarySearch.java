package binarySearchProblems;

public class SwiftedBinarySearch {
    public static void main(String[] args){
        int output = shiftedBinarySearch(new int[]{45, 61, 71, 72, 73, 0, 1, 21, 33},0);
        System.out.println(output);
    }

    public static int shiftedBinarySearch(int[] input, int targetNum){
        int startIndex = 0;
        int endIndex = input.length-1;
        int middleIndex = (startIndex + endIndex) / 2;
        if (input[startIndex] > targetNum && input[middleIndex] > targetNum){
            startIndex = middleIndex;
        }else{
            startIndex = 0;
        }
        middleIndex = (startIndex + endIndex) / 2;
        while(endIndex - startIndex != 1){
            if (input[middleIndex] == targetNum){
                return middleIndex;
            }
            if (input[middleIndex] > targetNum){
                endIndex = middleIndex;
                middleIndex = (startIndex + endIndex) / 2;
            }else if (input[middleIndex] < targetNum){
                startIndex = middleIndex;
                middleIndex = (startIndex + endIndex) / 2;
            }
        }
        return 0;
    }
}
// shifted array
// input = [45, 61, 71, 72, 73, 0, 1, 21, 33, 37]
//          0,   1   2   3   4  5  6   7   8   9
// target num = 33
// output = 8
// while loop
// startindex = 0;
// endIndex = 10
// midindex = 0 + 10 / 2;  = 5
// if (startindex < target && midindex > target) 45 < 33 && 0 < 33
// midindex = 3
// else if (midindex < target && endIndex > target)
// startIndex = midIndex;
// midINdex = startIndex + endIndex / 2;
