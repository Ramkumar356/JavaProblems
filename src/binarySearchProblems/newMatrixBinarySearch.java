package binarySearchProblems;

public class
newMatrixBinarySearch {
    public static void main(String[] args){
       boolean output1 = matrix();
       System.out.println(output1);

    }

    public static boolean binarySearch(int[] input,int k){
        int startIndex = 0;
        int endIndex = input.length-1;
        int currentIndex = (startIndex + endIndex) / 2;
        while(endIndex - startIndex != 1){
            if (input[currentIndex] > k){
                endIndex = currentIndex;
                currentIndex = (startIndex + endIndex) / 2;
            }else if (input[currentIndex] < k){
                startIndex = currentIndex;
                currentIndex = (startIndex + endIndex) / 2;
            }
            if (input[currentIndex] == k || input[currentIndex+1] == k){
                return true;
            }
        }
        return false;
    }
    public static boolean matrix(){
        int[][] matrix = new int[3][5];
        matrix[0] = new int[]{1,2,3,4,5};
        matrix[1] = new int[]{4,5,6,7,8};
        matrix[2] = new int[]{9,10,11,12,13};

        for (int i = 0; i < matrix.length;i++){
            int[] matrixRowValues = matrix[i];
            boolean output = binarySearch(matrixRowValues,20);
            if (output == true){
                return true;
            }

        }
        return false;
    }
}
