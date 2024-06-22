package arrayProblems;

public class MergeSortedArrays {
    public static void main(String[] args){
        int[][] input = new int[2][4];
        input[0] = new int[]{1,2,3,4};
        input[1] = new int[]{3,5,-1,4};
        //mergeSortedArray(input);
        int[] sortedArray = new int[]{};
        sortedArray = input[0];
        sortedArray = input[1];

    }

    public static int[] mergeSortedArray(int[][] input){
        for (int i = 0; i < input.length; i++){
            int[] currentArray = input[i];
            int[] sortedArray = new int[]{};
            for (int j = i+1; j < input[i].length; j++){
                int secondIndex = input[j].length-1;
               if (currentArray[0] > input[j][secondIndex]){
                   sortedArray = currentArray;
                   sortedArray = input[0];
               }
           }
        }
        return new int[5];
   }
}
// -1,0,1,5,9,21,-124,81,121
// input =  [[1, 5, 9, 21],
//    [-1, 0],
//    [-124, 81, 121],
//    [3, 6, 12, 20, 150]]
// output = [-124,-1,0,1,3,5,6,9,20,21,81,121,150]
// 0th index = [1,5,9,21], 1st index = [-1,0]
// 1st index[endIndex] < 0th index[0]
// sortedAray = -1,0,1,5,9,21
// sortedArray , 2nd index
// 2nd index[endIndex] < sortedINdex[0]  121 < -1  false
// else
// sortedIndex[endIndex] < 2ndIndex[0]
// else
// sortedIndex[0] < 2ndIndex[midIndex] && 2ndINdex[midIndex+1] >= sortedIndex[0] [-1,0,1,5,9,21] [-124,81,121]
// startIndex = currentIndex+1