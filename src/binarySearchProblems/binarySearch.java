package binarySearchProblems;

public class binarySearch {
    public static void main(String[] args){
        boolean output = binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,50},1);
        System.out.println(output);
//          boolean output1 = matrix();
//          System.out.println(output1);
    }

    public static boolean binarySearch(int[] numbers,int k){

        int startIndexValue = 0;
        int endIndexValue = numbers.length-1;
        int currentIndexValue = (startIndexValue + endIndexValue) / 2;
        while(currentIndexValue - startIndexValue != 1){
            if (numbers[currentIndexValue] > k){
                endIndexValue = currentIndexValue;   // 15
                currentIndexValue = (startIndexValue + endIndexValue) / 2; // 10 + 15 / 2 = 13
            }else if(numbers[currentIndexValue] < k){
                startIndexValue = currentIndexValue;  // 10,
                currentIndexValue = (startIndexValue + endIndexValue) / 2;   // 10 + 20 / 2 = 15,
            }
            if (numbers[currentIndexValue] == k || numbers[currentIndexValue+1] == k){  // checking last character value equal to target
                                                                                        // using currentindex+1 == k
                return true; // current index value is lastIndexValue-1 this is last value so we using currentIdexValue+1 to check last index value0
            }
        }
        return false;
    }


//    public static boolean matrix(){
//        int[][] matrix = new int[4][4];
//        matrix[0] = new int[]{1,2,3,4};
//        matrix[1] = new int[]{4,5,6,7};
//        matrix[2] = new int[]{9,10,11,12};
//
//        for (int i = 0; i < matrix.length;i++){
//            int[] matrixRowValues = matrix[i];
//            boolean output = binarySearchProblems.binarySearch(matrixRowValues,5);
//            if (output == true){
//                return true;
//            }
//
//        }
//        return false;
//    }

}


// input = 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  k = 19
// output = true
// int startindex = 0;
// int endindex = input.length;
// int currentindexvalue = input.length / 2
// while loop -
// for loop - start i = 0; endcondition i < input.length
//
// if input[currentindexvalue] > k          11 > 14 - f
// endindex = currentindexvalue   10
//  currentindexvalue = startindex + endindex / 2  - 5
//
//
//  else input[currentindexvalue] < k   11 < 14 - t
//     startindex = currentindexvalue
//     currentindexvalue = startindex + endindex / 2  = 15
//  if input[currentindexvalue] == k
//   return true
// 1 2 3 4 5 6 7 8 9 10