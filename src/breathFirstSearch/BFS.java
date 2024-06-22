package breathFirstSearch;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.*;

public class BFS {
    public static void main(String[] args){
        breathFirstSearch();

    }
    public static void breathFirstSearch(){
        int[][] input = new int[3][3];
        input[0] = new int[]{1,2,3};
        input[1] = new int[]{4,5,6};
        input[2] = new int[]{7,8,9};
        int shortDistance = 0;
        Queue shortDistances = new LinkedList();
        shortDistances.add(shortDistance);
        Set set = new HashSet();
        Queue queue = new LinkedList();
        Position position = new Position(1,1);
        queue.add(position);
        set.add(position);
        while(!queue.isEmpty()){
            Position visitedPositions = (Position) queue.remove();
            int currentShortDistance = (int) shortDistances.remove();
            if (visitedPositions.columnIndex-1 >= 0) {
                if (!set.contains((new Position(visitedPositions.rowIndex, visitedPositions.columnIndex - 1)))) {
                    set.add(new Position(visitedPositions.rowIndex, visitedPositions.columnIndex - 1));
                    queue.add(new Position(visitedPositions.rowIndex, visitedPositions.columnIndex - 1));
                    shortDistances.add(currentShortDistance+1);
                }
            }
            if (visitedPositions.rowIndex-1 >= 0) {
                if (!set.contains((new Position(visitedPositions.rowIndex-1, visitedPositions.columnIndex)))) {
                    set.add(new Position(visitedPositions.rowIndex-1, visitedPositions.columnIndex));
                    queue.add(new Position(visitedPositions.rowIndex-1, visitedPositions.columnIndex));
                    shortDistances.add(currentShortDistance+1);
                }
            }
            if (visitedPositions.columnIndex+1 < input[0].length) {
                if (!set.contains((new Position(visitedPositions.rowIndex, visitedPositions.columnIndex +1)))) {
                    set.add(new Position(visitedPositions.rowIndex, visitedPositions.columnIndex + 1));
                    queue.add(new Position(visitedPositions.rowIndex, visitedPositions.columnIndex + 1));
                    shortDistances.add(currentShortDistance+1);
                }
            }
            if (visitedPositions.rowIndex+1 < input[0].length) {
                if (!set.contains((new Position(visitedPositions.rowIndex+1, visitedPositions.columnIndex)))) {
                    set.add(new Position(visitedPositions.rowIndex+1, visitedPositions.columnIndex));
                    queue.add(new Position(visitedPositions.rowIndex+1, visitedPositions.columnIndex));
                    shortDistances.add(currentShortDistance+1);
                }
            }
            input[visitedPositions.rowIndex][visitedPositions.columnIndex] = currentShortDistance;
        }
        for (int i = 0; i < input.length;i++){
            for (int j = 0; j < input.length; j++){
               System.out.print(input[i][j]);
            }
            System.out.println("  ");
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

/*
*  input = 1 2 3  input = (1,1)
*         4 5 6
*         7 8 9
*  output = 5 4 6 2 8 7 1 3 9
*  queue.add input[1][1]
*  int position = (int) queue. remove
*  position.row position.column-1    left
*  position.row position.column+1    right
*  position.row-1 position.column    top
*  position.row+1 position.column    bottom
*
* */