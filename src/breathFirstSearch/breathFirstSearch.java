package breathFirstSearch;

import java.util.*;
public class breathFirstSearch {
    public static void main(String[] args){
        breathFirstSearch1();

    }

    public static void breathFirstSearch(){
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{0,0,0};
        matrix[1] = new int[]{0,-1,-1};
        matrix[2] = new int[]{0,0,0};
        Set set = new HashSet();
        Queue queue = new LinkedList();
        Position position = new Position(0,2);
        queue.add(position);
        set.add(position);
        Queue shortDistance = new LinkedList();
        int distance = 0;
        shortDistance.add(distance);
        while (!queue.isEmpty()){
            Position visitedPosition = (Position) queue.remove();
            int shortestDistance = (int) shortDistance.remove();
            System.out.println(matrix[visitedPosition.rowIndex][visitedPosition.columnIndex]);
            if (!set.contains((new Position(visitedPosition.rowIndex - 1, visitedPosition.columnIndex)))){
                if (visitedPosition.rowIndex-1 >= 0) {
                    set.add(new Position(visitedPosition.rowIndex - 1, visitedPosition.columnIndex));
                    queue.add(new Position(visitedPosition.rowIndex - 1, visitedPosition.columnIndex));
                    shortDistance.add(shortestDistance + 1);
                }
            }
            if (!set.contains(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex-1))){
                if (visitedPosition.columnIndex-1 >= 0) {
                    set.add(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex-1));
                    queue.add(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex-1));
                    shortDistance.add(shortestDistance + 1);
                }
            }
            if (!set.contains((new Position(visitedPosition.rowIndex + 1, visitedPosition.columnIndex)))){
                if (visitedPosition.rowIndex+1 < matrix.length) {
                    set.add(new Position(visitedPosition.rowIndex+1, visitedPosition.columnIndex));
                    queue.add(new Position(visitedPosition.rowIndex+1, visitedPosition.columnIndex));
                    shortDistance.add(shortestDistance + 1);
                }
            }
            if (!set.contains((new Position(visitedPosition.rowIndex, visitedPosition.columnIndex + 1)))){
                if (visitedPosition.columnIndex+1 < matrix.length) {
                    set.add(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex+1));
                    queue.add(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex+1));
                    shortDistance.add(shortestDistance + 1);
                }
            }
            matrix[visitedPosition.rowIndex][visitedPosition.columnIndex] = shortestDistance;
        }
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0;j < matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void breathFirstSearch1(){
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{0,0,0};
        matrix[1] = new int[]{0,-1,-1};
        matrix[2] = new int[]{0,0,0};
        int nonCheckValue = -1;
        Set set = new HashSet();
        Queue queue = new LinkedList();
        Position position = new Position(0,2);
        queue.add(position);
        set.add(position);
        Queue shortDistance = new LinkedList();
        int distance = 0;
        shortDistance.add(distance);
        while (!queue.isEmpty()) {
            Position visitedPosition = (Position) queue.remove();
            int shortestDistance = (int) shortDistance.remove();
            if (matrix[visitedPosition.rowIndex][visitedPosition.columnIndex] != -1) {
                if (!set.contains((new Position(visitedPosition.rowIndex - 1, visitedPosition.columnIndex)))) {
                    if (visitedPosition.rowIndex - 1 >= 0) {
                        set.add(new Position(visitedPosition.rowIndex - 1, visitedPosition.columnIndex));
                        queue.add(new Position(visitedPosition.rowIndex - 1, visitedPosition.columnIndex));
                        shortDistance.add(shortestDistance + 1);

                    }
                }
                if (!set.contains(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex - 1))) {
                    if (visitedPosition.columnIndex - 1 >= 0) {
                        set.add(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex - 1));
                        queue.add(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex - 1));
                        shortDistance.add(shortestDistance + 1);

                    }
                }
                if (!set.contains((new Position(visitedPosition.rowIndex + 1, visitedPosition.columnIndex)))) {
                    if (visitedPosition.rowIndex + 1 < matrix.length) {
                        set.add(new Position(visitedPosition.rowIndex + 1, visitedPosition.columnIndex));
                        queue.add(new Position(visitedPosition.rowIndex + 1, visitedPosition.columnIndex));
                        shortDistance.add(shortestDistance + 1);

                    }

                }
                if (!set.contains((new Position(visitedPosition.rowIndex, visitedPosition.columnIndex + 1)))) {
                    if (visitedPosition.columnIndex + 1 < matrix.length) {
                        set.add(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex + 1));
                        queue.add(new Position(visitedPosition.rowIndex, visitedPosition.columnIndex + 1));
                        shortDistance.add(shortestDistance + 1);

                    }
                }
                matrix[visitedPosition.rowIndex][visitedPosition.columnIndex] = shortestDistance;
            }
        }
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0;j < matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
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
            if (!(o instanceof Position)) return false;
            Position position = (Position) o;
            return rowIndex == position.rowIndex && columnIndex == position.columnIndex;
        }

        @Override
        public int hashCode() {
            return Objects.hash(rowIndex, columnIndex);
        }
    }
}


// input - 0 0 0  startingposition = 0,2
//         0 -1 -1
//         0 0 0
// output = 2 1 0
//          3 -1 -1
//          4 5 6
// startposition 0,2 - left 0,1, bottom 1,2
// queue.remove();
// matrix[0][1] == -1;
// matrix[1][2] == -1;

