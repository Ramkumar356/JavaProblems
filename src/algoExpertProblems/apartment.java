package algoExpertProblems;

import java.sql.ClientInfoStatus;
import java.util.*;
public class apartment {
    public static void main(String[] args){
        boolean[][] matrix = new boolean[5][3];
        matrix[0] = new boolean[]{false,true,false};
        matrix[1] = new boolean[]{true,false,false};
        matrix[2] = new boolean[]{true,true,false};
        matrix[3] = new boolean[]{false,true,false};
        matrix[4] = new boolean[]{false,true,true};

        int output = minimizingFarthestDistance2DArray(matrix);
        System.out.println(output);


    }
    public static class apartments{
        boolean gym;
        boolean school;
        boolean store;
        public apartments(boolean gym,boolean school,boolean store){
            this.gym = gym;
            this.school = school;
            this.store = store;
        }
    }

    public static class apartmentDistance{
        int rowIndex;
        int columnIndex;
        public apartmentDistance(int row,int column){
            this.rowIndex = row;
            this.columnIndex = column;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof apartmentDistance)) return false;
            apartmentDistance that = (apartmentDistance) o;
            return rowIndex == that.rowIndex && columnIndex == that.columnIndex;
        }

        @Override
        public int hashCode() {
            return Objects.hash(rowIndex, columnIndex);
        }
    }
    public static int minimizingFarthestDistance(){
        List apartments = new LinkedList();
        ArrayList farthestDistance = new ArrayList();
        Queue queue = new LinkedList();
        apartments.add(new apartments(false,true,false));
        apartments.add(new apartments(true,false,false));
        apartments.add(new apartments(true,true,false));
        apartments.add(new apartments(false,true,false));
        apartments.add(new apartments(false,true,true));
        for(int i = 0; i < apartments.size(); i++){
            for(int j = 0; j < apartments.size(); j++){
                if (apartments.contains(new apartments(false,true,false))){

                }
            }
        }
        return 0;
    }


    public static int minimizingFarthestDistance2DArray(boolean[][] input){
       Queue queue = new LinkedList();
       Set set = new HashSet();
       set.add(new apartmentDistance(0,0));
       int minimumFarthestDistance = Integer.MAX_VALUE;
       ArrayList farthestDistances = new ArrayList();
       for (int i = 0; i < input.length; i++) {
           int farthestDistance = 0;
           for (int j = 0; j < input[0].length; j++) {
               queue.add(new apartmentDistance(i, j));
               while (!queue.isEmpty()) {
                   apartmentDistance currentIndex = (apartmentDistance) queue.remove();
                   if (input[currentIndex.rowIndex][currentIndex.columnIndex] == true) {
                       if (currentIndex.rowIndex - i > farthestDistance) {
                           farthestDistance = currentIndex.rowIndex - i;
                           break;
                       }

                   }
                   if (currentIndex.rowIndex + 1 < input.length) {
                       if(!set.contains(new apartmentDistance(currentIndex.rowIndex + 1, currentIndex.columnIndex))){
                           set.add(new apartmentDistance(currentIndex.rowIndex + 1, currentIndex.columnIndex));
                           queue.add(new apartmentDistance(currentIndex.rowIndex + 1, currentIndex.columnIndex));
                       }
                   }
                   if (currentIndex.rowIndex - 1 >= 0) {
                       if (!set.contains(new apartmentDistance(currentIndex.rowIndex - 1, currentIndex.columnIndex))){
                           set.add(new apartmentDistance(currentIndex.rowIndex - 1, currentIndex.columnIndex));
                           queue.add(new apartmentDistance(currentIndex.rowIndex - 1, currentIndex.columnIndex));
                   }
                   }

               }
               set.clear();
           }
           farthestDistances.add(farthestDistance);

       }

           for(int i = 0; i < farthestDistances.size(); i++){
               int currentDistances = (int) farthestDistances.remove(i);
               if (currentDistances < minimumFarthestDistance){
                   minimumFarthestDistance = currentDistances;
               }
           }
           return minimumFarthestDistance;
    }

    public static void findShortestDistance(){

    }
}
// "blocks": [
//    {
//      "gym": false,       gym = 1
//      "school": true,     school = 2               4      7
//      "store": false      store = 4
//    },
//    {
//      "gym": true,
//      "school": false,    school = 1                3      4
//      "store": false      store = 3
//    },
//    {
//      "gym": true,
//      "school": true,      school = 1                2     3
//      "store": false       store = 2
//    },
//    {
//      "gym": false,         gym = 1                   1     3
//      "school": true,       school = 1
//      "store": false        store = 1
//    },
//    {
//      "gym": false,         gym = 2
//      "school": true,       school = 1                2      3
//      "store": true         store = 0
//    }
//  ],
//  "reqs": ["gym", "school", "store"]
//
//  output = 3  indexvalue
//  object1 indexvalue, gymdistance, schooldistance, storedistance    farthestdistance
//  gymdisttance = 1
//  schooldistance = 0
//  storedistance = 4

// block2
// gym = 0
// school = 1
// store = 3

// gym = 0
// school = 0
// store = 3

// gym = 1
// school = 0
// store = 1

// gym = 2
// school = 0
// store = 0

//  input = [0 1 0]
//          [1 0 0]
//          [1 1 0]
//          [0 1 0]
//          [0 1 1]