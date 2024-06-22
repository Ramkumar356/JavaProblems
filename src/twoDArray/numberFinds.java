package twoDArray;

public class numberFinds {
    public static void main(String[] args){
//        boolean output = findNumber(24);
//        System.out.println(output);
//
//        boolean output1 = findNumber1(5);
//        System.out.println(output1);

        boolean output2 = binarySearchMatrix(5);
        System.out.println(output2);
    }

    public static boolean findNumber(int k){
        int[][] matrix = new int[3][4];
        matrix[0] = new int[]{1,2,3,4};
        matrix[1] = new int[]{5,7,8,9};
        matrix[2] = new int[]{3,4,5,6};

        for (int i = 0; i < matrix.length;i++){
            int[] firstIndexArrayValue = matrix[i];
            for (int j = 0; j < firstIndexArrayValue.length;j++){
                if (firstIndexArrayValue[j] == k){
                    return true;
                }
            }
        }
        return false;
    }



    public static boolean findNumber1(int k){
        int[][] matrix = new int[3][4];
        matrix[0] = new int[]{1,2,3,4};
        matrix[1] = new int[]{6,7,8,9};
        matrix[2] = new int[]{3,4,5,6};

        for (int i = 0; i < matrix.length;i++){
//            int[] firstIndexArrayValue = matrix[i];
            for (int j = 0; j < matrix[0].length;j++){
                if (matrix[i][j] == k){
                    return true;
                }
            }
        }
        return false;
    }


    public static boolean binarySearchMatrix(int k){
        int[][] matrix = new int[3][4];
        matrix[0] = new int[]{1,2,3,4};
        matrix[1] = new int[]{6,7,8,9};
        matrix[2] = new int[]{3,4,5,6};

        for (int i = 0; i < matrix.length;i++){
            int[] currentIndexArrayValue = matrix[i];
            int startIndex = 0;
            int endIndex = currentIndexArrayValue.length-1;
            int currentIndexValue = (startIndex+endIndex) / 2;
           while(endIndex - startIndex != 1){
               if (currentIndexArrayValue[currentIndexValue] > k){
                   endIndex = currentIndexValue;
                   currentIndexValue = (startIndex + endIndex) / 2;

               }else if (currentIndexArrayValue[currentIndexValue] < k){
                   startIndex = currentIndexValue;
                   currentIndexValue = (startIndex + endIndex) / 2;
               }
               if (currentIndexArrayValue[currentIndexValue] == k || currentIndexArrayValue[currentIndexValue+1] == k){
                   return true;
               }
           }
        }
        return false;
    }
}


// input = 1 2 3 4  target = 5
//         6 7 8 9
//         3 4 5 6
// output = true
// for loop i = 0, i < input.length
//   array1[i] == k
//     return true
//