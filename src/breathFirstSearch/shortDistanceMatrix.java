package breathFirstSearch;

import java.util.ArrayList;
import java.util.Set;
import java.util.*;

public class shortDistanceMatrix {
    public static void main(String[] args){
        shortDistanceTraversal();

    }
   public static void shortDistanceTraversal(){
        int[][] matrix = new int[3][3];
        matrix[0] = new int[]{0,0,0};
        matrix[1] = new int[]{0,0,0};
        matrix[2] = new int[]{0,0,0};

        Position position = new Position(0,2);
        Queue queue = new LinkedList();
        Queue distanceTraversedQueue = new LinkedList();
        Set set = new HashSet();
        queue.add(position);
        set.add(position);
        distanceTraversedQueue.add(0);
        while(!queue.isEmpty()){
            Position outputValues = (Position) queue.remove();
            int shortDistace = (int) distanceTraversedQueue.remove();
            if (outputValues.rowIndex-1 >= 0){
                if (!set.contains(new Position(outputValues.rowIndex-1, outputValues.columnIndex))){
                    set.add(new Position(outputValues.rowIndex-1,outputValues.columnIndex));
                    queue.remove(new Position(outputValues.rowIndex-1, outputValues.columnIndex));
                    distanceTraversedQueue.add(shortDistace+1);
                }
            }
            if (outputValues.columnIndex-1 >= 0){
                if (!set.contains(new Position(outputValues.rowIndex,outputValues.columnIndex-1))){
                    set.add(new Position(outputValues.rowIndex,outputValues.columnIndex-1));
                    queue.add(new Position(outputValues.rowIndex,outputValues.columnIndex-1));
                    distanceTraversedQueue.add(shortDistace+1);
                }
            }
            if (outputValues.rowIndex+1 < matrix.length){
                if (!set.contains(new Position(outputValues.rowIndex+1, outputValues.columnIndex))){
                    set.add(new Position(outputValues.rowIndex+1,outputValues.columnIndex));
                    queue.add(new Position(outputValues.rowIndex+1, outputValues.columnIndex));
                    distanceTraversedQueue.add(shortDistace+1);
                }
            }
            if (outputValues.columnIndex+1 < matrix.length){
                if (!set.contains(new Position(outputValues.rowIndex, outputValues.columnIndex+1))){
                    set.add(new Position(outputValues.rowIndex,outputValues.columnIndex+1));
                    queue.add(new Position(outputValues.rowIndex, outputValues.columnIndex+1));
                    distanceTraversedQueue.add(shortDistace+1);
                }
            }

            matrix[outputValues.rowIndex][outputValues.columnIndex] = shortDistace;
        }
        for (int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix.length;j++){
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

// input = 0 0 0 input = 0,2 - starting position
//         0 0 0
//         0 0 0
// output = 2 1 0
//          3 2 1
//          4 3 2
// breathFirstSearch.breathFirstSearch 1 1
//  1 1 1 1 2 2 2 2  3 3 3 3