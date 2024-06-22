package matrixProblem;

public class goodMatrix {
    public static void main(String[] args){
        boolean output = goodMatrix();
        System.out.println(output);
    }
    public static boolean goodMatrix(){
        int[][] matrix = new int[4][4];
        matrix[0] = new int[]{1,1,1,1};
        matrix[1] = new int[]{1,1,1,0};
        matrix[2] = new int[]{0,1,1,0};
        matrix[3] = new int[]{1,0,0,0};

        for (int i = 0; i < matrix.length / 2;i++){
           int endRowColumn = matrix[0].length-(1+i);
           // lastRowColumn = (matrix[0].length -1) - i ;
            //
            for (int j = i;j < matrix[0].length-i;j++){
                if (matrix[i][j] != 1){
                   break;
                } else if (matrix[j][i] != 1){
                    break;
                } else if (matrix[endRowColumn][j] != 1){
                    break;
                } else if (matrix[j][endRowColumn] != 1) {
                    break;
                }
                if (j == (matrix[0].length-1) - i){  // opposite pair method used
                    return true;
                }
            }
        }
        return false;
   }
}
// input - 1111
//         1101
//         1001
//         1111
// output - true
// for loop i=0; ;i++
// for in loop j = i
// input[i][j] == 1  - 1 == 1
// input[i][j] == 1  - 1 == 1
// checking 0th row oth column and last row last column
// input[i][j] == 1 row traverse
// input[j][i] == 1 column traverse
// i = input[i].length-i+1
//