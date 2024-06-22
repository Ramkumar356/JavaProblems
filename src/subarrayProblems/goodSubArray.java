package subarrayProblems;

import java.util.ArrayList;

public class goodSubArray {
    public static void main(String[] args){
//       boolean output = subarrayProblems.goodSubArray(new int[]{23,2},13);
//       System.out.println(output);

        boolean output1 = goodSubArray2(new int[]{23,2,4,6,7},13);
        System.out.println(output1);
    }

    public static boolean goodSubArray(int[] array,int k){
        ArrayList subArrayAumValues = new ArrayList();
        for (int i = 0; i < array.length; i++){
            int sumValues = 0;
            for (int j = i; j < array.length;j++){
                sumValues += array[j];
            }
            int arrayListIndex = 0;
            subArrayAumValues.add(arrayListIndex,sumValues);
            int startIndex = i;
            int endIndex = array.length-1;
            while(startIndex < array.length){
                int currentValue = (int) subArrayAumValues.get(arrayListIndex);
                if (currentValue % k == 0){
                    return  true;
                }
                sumValues -= array[endIndex];
                arrayListIndex++;
                subArrayAumValues.add(arrayListIndex,sumValues);
                startIndex++;
                endIndex--;
            }

        }
        return false;
    }


    public static boolean goodSubArray2(int[] array,int k){

        for (int i = 0; i < array.length;i++) {
            int sumValues = 0;
            for (int j = i; j < array.length;j++) {
                sumValues += array[j];
            }
            int startIndex = i;
            int endIndex = array.length-1;
            while( startIndex < array.length-1) {
                if (sumValues % k == 0) {
                    return true;
                }
                sumValues -= array[endIndex];
                endIndex--;
                startIndex++;
            }

        }
        return false;
    }
}


// input = [23,2,4,6,7], k = 6
// output = true
// for loop 23,2,4,6,7 = 42
// while loop
//