package subarrayProblems;

import java.util.ArrayList;

public class contiguousSubArray {
    public static void main(String[] args){
//        float output = subArray(new int[]{1,12,-5},2);
//        System.out.println(output);
//
//        float output1 = contiguousArray1(new int[]{1,12},1);
//        System.out.println(output1);

        float output2 = subArray2(new int[]{1,12},2);
        System.out.println(output2);

    }

    public static float subArray(int[] Array,int k){
        ArrayList sumValues = new ArrayList();

        for (int i = 0 ; i+k-1 < Array.length;i++){
            int subArraySum = 0;
            for (int j = i; j < k+i; j++){
                subArraySum += Array[j];
            }
            sumValues.add(subArraySum);
        }
        int maximumvalues = 0;
        for (int i = 0;i < sumValues.size();i++){
            int currentValues = (int) sumValues.get(i);
            if (currentValues > maximumvalues){
                maximumvalues = currentValues;
            }
        }
        return maximumvalues / k;
    }

    public static float contiguousArray1(int[] Array,int k){
        ArrayList subArray = new ArrayList();
        int subArraySum =0;
        for (int i = 0; i < k; i++){
            subArraySum += Array[i];
        }
        subArray.add(subArraySum);
        for (int i = 1; i+k-1 < Array.length;i++){
            for (int j = i+k-1; j < i+k; j++){
                subArraySum -= Array[i-1];
                subArraySum += Array[j];
                subArray.add(subArraySum);
            }
        }
        int maximumvalue = Integer.MIN_VALUE;
        for (int i = 0; i < subArray.size();i++){
            int currentValue = (int) subArray.get(i);
            if (currentValue > maximumvalue){
                maximumvalue = currentValue;
            }
        }
        return maximumvalue / k;
    }

    public static float subArray2(int[] Array,int k){
        ArrayList subArray = new ArrayList();
        int subArraySum =0;
        for (int i = 0; i < k; i++){
            subArraySum += Array[i];
        }
        subArray.add(subArraySum);
        int arrayStartIndex = 0;
        int arrayEndIndex = arrayStartIndex+k-1;
        while (arrayEndIndex+1 < Array.length){
            subArraySum -= Array[arrayStartIndex];
            subArraySum += Array[arrayEndIndex+1];
            subArray.add(subArraySum);
            arrayEndIndex++;
            arrayStartIndex++;
        }
        int maximumvalue = Integer.MIN_VALUE;
        for (int i = 0; i < subArray.size();i++){
            int currentValue = (int) subArray.get(i);
            if (currentValue > maximumvalue){
                maximumvalue = currentValue;
            }
        }
        return maximumvalue / k;

    }



}

