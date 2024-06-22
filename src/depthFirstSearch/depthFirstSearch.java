package depthFirstSearch;

import java.util.*;

public class depthFirstSearch {
    public static void main(String[] args){
        depthFristSearch1();
        Queue queue = new LinkedList<>();
//        Position position1 = new Position(0,0);
//        Position position2 = new Position(1,2);
//        Position position3 = new Position(2,2);
//        queue.add(position1);
//        queue.add(position2);
//        queue.add(position3);

    }
    public static void depthFristSearch1(){
        Queue queue = new LinkedList<>();
        ArrayList output = new ArrayList();
        Set output1 = new HashSet();

        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{1,3,6};
        matrix[1] = new int[]{2,5,8};
        matrix[2] = new int[]{4,7,9};
        Position position1 = new Position(0,0);
        queue.add(position1);
        int i = 0;
        while(!queue.isEmpty()){
            try {
                Position positionValue = (Position) queue.remove();
                        int outputValues = (matrix[positionValue.rowIndex][positionValue.columnIndex]);
                        if (!output1.contains(outputValues)) {
                            output1.add(outputValues);
                        System.out.println(matrix[positionValue.rowIndex][positionValue.columnIndex]);
                }
                if (positionValue.rowIndex+1 < matrix.length) {    // increasing row value to find next number
                    queue.add(new Position(positionValue.rowIndex + 1, positionValue.columnIndex));
                }                                      // row index value increasing + 1  , column index value same
                    if (positionValue.columnIndex+1 < matrix.length) { // increasing column value to find next number column
                        queue.add(new Position(positionValue.rowIndex, positionValue.columnIndex + 1));
                    }                                      // row index value same     , column index value increasing + 1


                i++;
            }catch(Exception e){
                System.out.println(e);
            }



        }
//        for (int j = 0;j < output.size();j++) {
//            System.out.print(output1.remove(j) + " ");
//        }

    }
    public static class Position{
          int rowIndex;
          int columnIndex;

          public Position(int rowIndex,int columnIndex){  // constructor no return
              this.rowIndex = rowIndex;
              this.columnIndex = columnIndex;
          }
    }

}
// input - 1 3 6
//         2 5 8
//         4 7 9
// output - 1 2 3 4 5 6 7 8 9
// for loop i = 0
// position(int rowIndex,int columnIndex)
//
// queue.add(postion(0,0))    queue = 1
// Position postionValue = queue.remove()
// int rowIndex = positionValue.rowIndex;
// int columnIndex = positionValue.columnIndex;
// s.o.p(input[rowIndex][columnIndex])  (0,0),(1,0),(0,1),(2,0),(1,1),(0,2), (2,1)
// position(rowIndex+1,columnIndex)  (0+1 = 1, 0 = 2), (2,0 = 4),(1,1 = 5),(3,0 = ),(2,1 = 7), (1,2 = 8),
// position(rowIndex,columnIndex+1)   (0 , 0+1 = 1 = 3), (1,1 = 5), (0,2 = 6),(2,1 = 7), (1,2 =8), (0,3 = ), (2,2 = 9)
// return 1
// 1 [i+1][1]
// input [i][i]
// input[i]
// queue.add(0) - remove = 0, [0+1][0],[0][0+1]


