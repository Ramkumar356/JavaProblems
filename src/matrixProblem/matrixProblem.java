package matrixProblem;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

    public class matrixProblem {

        public static void main(String[] args) {
            long programStartTime = System.currentTimeMillis();
            int[][] inputMatrix = new int[2][2];
            Position startPosition = new Position(0, 2);
            System.out.println("Input matrix");
            printMatrix(inputMatrix);
            findShortestDistance(inputMatrix, startPosition);
            System.out.println("Output matrix");
            printMatrix(inputMatrix);
            long programEndTime = System.currentTimeMillis();
            System.out.println("Milli seconds taken to run the program: " + (programEndTime - programStartTime));
        }

        // Method to find shortest distance from startPosition to all the positions in the input matrix
        private static void findShortestDistance(int[][] inputMatrix, Position startPosition) {
            for (int i = 0; i < inputMatrix.length; i++) {
                for (int j = 0; j < inputMatrix[i].length; j++) {
                    Position currentPosition = new Position(i, j);
                    Set<Position> visitedPositions = new HashSet<>();
                    int shortestDistance = findDistanceUsingDFS(currentPosition, startPosition, inputMatrix, visitedPositions, 0);
                    inputMatrix[i][j] = shortestDistance;
                }
            }
        }

        // Helper method to print the values in the matrix
        private static void printMatrix(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println("");
            }
        }

        // DFS method to find the shortest distance from the currentPosition object to startPosition object
        private static int findDistanceUsingDFS(Position currentPosition, Position startPosition, int[][] inputMatrix, Set<Position> visitedPositions, int distance) {
            // [Important] Check if the currentPosition object is out of matrix boundary
            if (isPositionOutOfBounds(currentPosition, inputMatrix)) {
                return Integer.MAX_VALUE;
            }
            // [Important] We found the start position, so stop the recursion and return the distance
            if (currentPosition.equals(startPosition)) {
                return distance;
            }
            // [Important] add the currentPosition to the visitedPositions so that we don't need to find the distance again
            visitedPositions.add(currentPosition);
            Position leftPosition = new Position(currentPosition.rowIndex, currentPosition.columnIndex - 1);
            Position topPosition = new Position(currentPosition.rowIndex - 1, currentPosition.columnIndex);
            Position rightPosition = new Position(currentPosition.rowIndex, currentPosition.columnIndex + 1);
            Position bottomPosition = new Position(currentPosition.rowIndex + 1, currentPosition.columnIndex);
            int newDistance = distance + 1;
            int distanceByTraversingLeft = Integer.MAX_VALUE;
            int distanceByTraversingTop = Integer.MAX_VALUE;
            int distanceByTraversingRight = Integer.MAX_VALUE;
            int distanceByTraversingBottom = Integer.MAX_VALUE;
            // find the distance by traversing from currentPosition left child
            if (!visitedPositions.contains(leftPosition)) {
                distanceByTraversingLeft = findDistanceUsingDFS(leftPosition, startPosition, inputMatrix, visitedPositions, newDistance);
            }
            // find the distance by traversing from the top position
            if (!visitedPositions.contains(topPosition)) {
                distanceByTraversingTop = findDistanceUsingDFS(topPosition, startPosition, inputMatrix, visitedPositions, newDistance);
            }
            // find the distance by traversing from the right position
            if (!visitedPositions.contains(rightPosition)) {
                distanceByTraversingRight = findDistanceUsingDFS(rightPosition, startPosition, inputMatrix, visitedPositions, newDistance);
            }
            // find the distance by traversing from the bottom position
            if (!visitedPositions.contains(bottomPosition)) {
                distanceByTraversingBottom = findDistanceUsingDFS(bottomPosition, startPosition, inputMatrix, visitedPositions, newDistance);
            }
            int shortestDistance = Integer.MAX_VALUE;
            // If distanceByTraversingLeft is less than the shortestDistance then use it as the shortest distance
            if (distanceByTraversingLeft < shortestDistance) {
                shortestDistance = distanceByTraversingLeft;
            }
            // If distanceByTraversingTop is less than the shortestDistance then use it as the shortest distance
            if (distanceByTraversingTop < shortestDistance) {
                shortestDistance = distanceByTraversingTop;
            }
            // If distanceByTraversingRight is less than the shortestDistance then use it as the shortest distance
            if (distanceByTraversingRight < shortestDistance) {
                shortestDistance = distanceByTraversingRight;
            }
            // If distanceByTraversingBottom is less than the shortestDistance then use it as the shortest distance
            if (distanceByTraversingBottom < shortestDistance) {
                shortestDistance = distanceByTraversingBottom;
            }
            // [Important] remove the currentPosition to the visitedPositions after finding the shortest distance
            visitedPositions.remove(currentPosition);
            return shortestDistance;
        }

        // Method to check if the position is out of inputMatrix boundaray
        private static boolean isPositionOutOfBounds(Position position, int[][] inputMatrix) {
            boolean isRowLessThenZero = position.rowIndex < 0;
            boolean isRowGreaterThanMatrixSize = position.rowIndex >= inputMatrix.length;
            boolean isColumnLessThenZero = position.columnIndex < 0;
            boolean isColumnGreaterThanMatrixSize = position.columnIndex >= inputMatrix[0].length;
            return isRowLessThenZero || isRowGreaterThanMatrixSize || isColumnLessThenZero || isColumnGreaterThanMatrixSize;
        }


        public static class Position {
            int rowIndex;
            int columnIndex;

            public Position(int rowIndex, int columnIndex) {
                this.rowIndex = rowIndex;
                this.columnIndex = columnIndex;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Position position)) return false;
                return rowIndex == position.rowIndex && columnIndex == position.columnIndex;
            }

            @Override
            public int hashCode() {
                return Objects.hash(rowIndex, columnIndex);
            }
        }
    }
//

