package depthFirstSearch;

import java.util.*;

public class problemTwoDepthFirstSearch {
    public static void main(String[] args){
       // secomdDepthFirstSearch();
        thirdDepthFirstSearch();

    }

    public static void secomdDepthFirstSearch() {
        Queue queue = new LinkedList();
        Set outputValues = new HashSet();
        int[][] matrix = new int[5][5];
        matrix[0] = new int[]{1, 2, 3, 4, 5};
        matrix[1] = new int[]{5, 6, 7, 8, 6};
        matrix[2] = new int[]{9, 8, 7, 6, 7};
        matrix[3] = new int[]{5, 4, 3, 2, 8};
        matrix[4] = new int[]{9, 1, 2, 3, 4};

        Position  position = new Position(matrix.length / 2, matrix[0].length / 2);
        queue.add(position);
        int i = 0;

        while(!queue.isEmpty()){
            Position output = (Position) queue.remove();
            if (!outputValues.contains(position = new Position(output.rowIndex,output.columnIndex))) {
                System.out.print(matrix[output.rowIndex][output.columnIndex] + " ");
            }
            if (output.rowIndex+1 < matrix.length) {
                if (!outputValues.contains(position = new Position(output.rowIndex+1, output.columnIndex))) {
                    outputValues.add(position = new Position(output.rowIndex + 1, output.columnIndex));
                }
                queue.add(position = new Position(output.rowIndex + 1, output.columnIndex));
            }
            if (output.columnIndex+1 < matrix.length) {
                if (!outputValues.contains(position = new Position(output.rowIndex, output.columnIndex+1))) {
                    outputValues.add(position = new Position(output.rowIndex, output.columnIndex + 1));
                }
                queue.add(position = new Position(output.rowIndex, output.columnIndex + 1));
            }
            if (output.columnIndex-1 < matrix.length) {
                if (!outputValues.contains(position = new Position(output.rowIndex, output.columnIndex-1))) {
                    outputValues.add(position = new Position(output.rowIndex, output.columnIndex - 1));
                }
                queue.add(position = new Position(output.rowIndex, output.columnIndex - 1));
            }
            if (output.rowIndex-1 < matrix.length ) {
                if (!outputValues.contains(position = new Position(output.rowIndex-1, output.columnIndex))) {
                    outputValues.add(position = new Position(output.rowIndex - 1, output.columnIndex));
                }
                queue.add(position = new Position(output.rowIndex - 1, output.columnIndex));
            }
            i++;


        }


    }
    public static class Position{
         int rowIndex;
         int columnIndex;
        public Position(int rowIndex,int columnIndex){
            this.rowIndex = rowIndex;
            this.columnIndex = columnIndex;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Position position = (Position) o;
            return rowIndex == position.rowIndex && columnIndex == position.columnIndex;
        }

//        @Override
//        public boolean equals(Object obj) {
//            if (this == obj){
//                return true;
//            }
//            return rowIndex == ((Position)obj).rowIndex && columnIndex == ((Position)obj).columnIndex;
//        }


        @Override
        public int hashCode() {
            return Objects.hash(rowIndex, columnIndex);
        }
    }



    public static void thirdDepthFirstSearch() {
        Queue queue1 = new LinkedList();
        Set outputValuesSet = new HashSet();
        int[][] matrix = new int[5][5];
        matrix[0] = new int[]{1, 2, 3, 4, 5};
        matrix[1] = new int[]{5, 6, 7, 8, 6};
        matrix[2] = new int[]{9, 8, 7, 6, 7};
        matrix[3] = new int[]{5, 4, 3, 2, 8};
        matrix[4] = new int[]{9, 1, 2, 3, 4};

        Position position1 = new Position(matrix.length / 2, matrix.length / 2);
        queue1.add(position1);
        outputValuesSet.add(position1);
        int rowIndex = matrix.length/2;
        int columnIndex = matrix.length/2;
        int rowLength = matrix.length-1;
        int columnLength = matrix[0].length-1;
        while (!queue1.isEmpty()){
            try {
                Position outputValues = (Position) queue1.remove();
                System.out.print(matrix[outputValues.rowIndex][outputValues.columnIndex] + " ");
                if (outputValues.columnIndex-1 >= 0) {
                    if (!outputValuesSet.contains(new Position(outputValues.rowIndex, outputValues.columnIndex - 1))) {
                        outputValuesSet.add(new Position(outputValues.rowIndex, outputValues.columnIndex-1));
                        queue1.add(new Position(outputValues.rowIndex, outputValues.columnIndex - 1));
                    }
                }
                if (outputValues.rowIndex-1 >= 0) {
                    if (!outputValuesSet.contains(new Position(outputValues.rowIndex-1, outputValues.columnIndex))) {
                        outputValuesSet.add(new Position(outputValues.rowIndex - 1, outputValues.columnIndex));
                        queue1.add(new Position(outputValues.rowIndex - 1, outputValues.columnIndex));
                    }
                }
                if (outputValues.columnIndex+1 < matrix.length) {
                    if (!outputValuesSet.contains(new Position(outputValues.rowIndex, outputValues.columnIndex +1))) {
                        outputValuesSet.add(new Position(outputValues.rowIndex, outputValues.columnIndex+1));
                        queue1.add(new Position(outputValues.rowIndex, outputValues.columnIndex + 1));
                    }
                }
                if (outputValues.rowIndex+1 < matrix.length) {
                    if (!outputValuesSet.contains(new Position(outputValues.rowIndex+1, outputValues.columnIndex))) {
                        outputValuesSet.add(new Position(outputValues.rowIndex + 1, outputValues.columnIndex));
                        queue1.add(new Position(outputValues.rowIndex + 1, outputValues.columnIndex));
                    }
                }

            }catch(Exception e){
                System.out.println(e);
            }


            rowIndex++;
            columnIndex++;
        }


    }


}

// input = 1 2 3 4 5
//         5 6 7 8 6
//         9 8 7 6 7
//         5 4 3 2 8
//         9 1 2 3 4
// output = 7 3 6 8 7 2 2 4 2 7 8 6 3 9 3 1 3 8 1 5 7 3
// output = 7 6 2 3 4 8 6 7 8 7 8 4 3 2 1 9 5 9 5 1 2 3 4 5 6
// public static class Postion{
//  int rowIndex;
//  int columnIndex;
//  public class Position(int rowIndex,int columnIndex){
//  this.rowIndex = rowIndex;
//  this.columnIndex = columnIndex;
//  }
//}
// Position position1 = new Position(matrix.length/2,matrix[0].length/2);
// queue.add(Position1);
// queue.remove()
// output.add(position1);
// for loop i = matrix.length/2 j = matrix[0].length/2 i++,j++
// while loop (!position1.row)
// row, column+1   2,3  row+1 , column+1  2,2
// 3,3   -   3,2   3,1  2,1  1,1  1,2  1,3  2,3  3,3  1.column-- 2.row-- 3.column++ 4.row++
// 4,4   -   4,3  4,2  4,1  4,0  3,0  2,0  1,0  0,0  0,1  0,2  0,3  0,4   1,4  2,4  3,4  4,4
// row+1 , column  3,2
// for (i){
// for (j = i ;j <= (row-column.length)-1 ;j--){
// row+1 column+1
// 3,3 - 3,2  2,2  2,3
//  2,2  -  2,1  1,2  2,3  3,2
