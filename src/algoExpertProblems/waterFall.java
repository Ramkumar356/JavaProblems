package algoExpertProblems;

import java.util.*;
public class waterFall {
    public static void main(String[] args){
        int[][] input = new int[5][5];
        input[0] = new int[]{0, 0, 0, 0, 0};
        input[1] = new int[]{1, 1, 1, 0, 1};
        input[2] = new int[]{0, 1, 1, 1, 0};
        input[3] = new int[]{0, 0, 1, 1, 1};
        input[4] = new int[]{0, 0, 0, 0, 0};

//        waterfalls(input,2);
//        showResult(input);
        waterFalls(input,2);
        showResult(input);
    }
    public static void waterfalls(int[][] matrix,int waterFallsColumnPosition) {
        Queue queue = new LinkedList();
        int waterPercentage = 100;
        int rowIndex = 0;
        int columnIndex = waterFallsColumnPosition;
        matrix[rowIndex][waterFallsColumnPosition] = waterPercentage;
        queue.add(new Position(rowIndex,columnIndex));
        while(!queue.isEmpty()){
            Position currentIndexValue = (Position) queue.remove();
            if (currentIndexValue.rowIndex+1 == matrix.length){
                break;
            }
            if (matrix[currentIndexValue.rowIndex+1][currentIndexValue.columnIndex] == 1){
                int leftZeroValueIndex = findLeftZeroValue(matrix,currentIndexValue.rowIndex+1, currentIndexValue.columnIndex);
                int rightZeroValueIndex = findRightZeroValue(matrix, currentIndexValue.rowIndex+1, currentIndexValue.columnIndex);
                waterPercentage = waterPercentage / 2;
                if (leftZeroValueIndex >= 0){
                    matrix[currentIndexValue.rowIndex+1][leftZeroValueIndex] += waterPercentage / 2;
                    queue.add(new Position(currentIndexValue.rowIndex+1, leftZeroValueIndex));
                }else{
                    waterPercentage += waterPercentage;
                }
                if (rightZeroValueIndex < matrix.length){
                    matrix[currentIndexValue.rowIndex+1][rightZeroValueIndex] += waterPercentage;
                    queue.add(new Position(currentIndexValue.rowIndex+1, rightZeroValueIndex));
                }else {
                    matrix[currentIndexValue.rowIndex+1][leftZeroValueIndex] += waterPercentage;
                    waterPercentage += waterPercentage;
                }
                if(leftZeroValueIndex == -1 && rightZeroValueIndex == matrix.length){
                     showResult(matrix);
                     break;
                }
            }else {
                matrix[currentIndexValue.rowIndex + 1][currentIndexValue.columnIndex] += waterPercentage;
                queue.add(new Position(currentIndexValue.rowIndex+1, currentIndexValue.columnIndex));
            }
        }
//
    }

    public static void waterFalls(int[][] input, int waterPosition){
        int waterPercentage = 100;
        input[0][waterPosition] = waterPercentage;
        Queue queue = new LinkedList();
        queue.add(new Position1(0,waterPosition,waterPercentage));
        while(!queue.isEmpty()){
            Position1 currentPosition = (Position1) queue.remove();
            if (currentPosition.leftIndex+1 == input.length){
                break;
            }
            if (input[currentPosition.leftIndex+1][currentPosition.rightIndex] == 1){
                int leftIndex = findLeftZeroValue(input,currentPosition.leftIndex+1, currentPosition.rightIndex);
                int rightIndex = findRightZeroValue(input, currentPosition.leftIndex+1, currentPosition.rightIndex);
                int currentWaterPercentage = currentPosition.waterPercentage / 2;
                if (leftIndex == -1 || rightIndex == input.length){
                        currentWaterPercentage += currentWaterPercentage;
                }
                if (leftIndex != -1){
                    input[currentPosition.leftIndex+1][leftIndex] += currentWaterPercentage;
                        queue.add(new Position1(currentPosition.leftIndex + 1, leftIndex, currentWaterPercentage));
                }
                if (rightIndex != input.length){
                    input[currentPosition.leftIndex+1][rightIndex] += currentWaterPercentage;
                    queue.add(new Position1(currentPosition.leftIndex + 1, rightIndex, currentWaterPercentage));
                }
            }else {
                input[currentPosition.leftIndex+1][currentPosition.rightIndex] += currentPosition.waterPercentage;
                queue.add(new Position1(currentPosition.leftIndex+1, currentPosition.rightIndex, currentPosition.waterPercentage));
            }
        }

    }

    public static int findLeftZeroValue(int[][] matrix,int rowIndex,int columnIndex){
        while(columnIndex >= 0) {
            if (matrix[rowIndex][columnIndex] != 1) {
                return columnIndex;
            }
            columnIndex--;
        }

        return -1;
    }
    public static int findRightZeroValue(int[][] matrix,int row,int column){
        while(column < matrix.length) {
            if (matrix[row][column] != 1) {
                return column;
            }
            column++;
        }
        return matrix[0].length;
    }
    public static void showResult(int[][] input){
        for (int i = 0; i < input.length;i++){
                System.out.print(input[input.length-1][i] + " ");
            System.out.print(" ");
        }
    }
    public static class Position{
        int rowIndex;
        int columnIndex;
        public Position(int row, int column){
            this.rowIndex = row;
            this.columnIndex = column;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Position)) return false;
            Position position = (Position) o;
            return rowIndex == position.rowIndex && columnIndex == position.columnIndex;
        }

        @Override
        public int hashCode() {
            return Objects.hash(rowIndex, columnIndex);
        }
    }

    public static class Position1{
        int leftIndex;
        int rightIndex;
        int waterPercentage;
        public Position1(int left, int right, int water){
            this.rightIndex = right;
            this.leftIndex = left;
            this.waterPercentage = water;
        }
    }

}

// input = 0 0 0 0 0    waterfallposition = 2
//         0 0 1 0 0
//         1 1 0 0 0
//         0 0 0 0 0
//         0 0 0 0 0

// output = 0 0 50 50 0
// input[0][waterfallposition] = 100;    [ 0 0 100 0 0]
//
// while loop
// if (input[1][waterfallposition] == 1)
// queue.add(findleftindexvalue());
// queue.add(findrightindexvalue());
// int leftindexvalue
// int rightindexvalue = findrightindexvalue();
// if (leftvalue >= 0)
// input[row][leftvalue] = waterfall / 2
// waterfall = waterfall / 2
// if (rightvalue >= 0)
// input[row][rightvalue] = waterfall;
//   100  50 50  25 25  25 25