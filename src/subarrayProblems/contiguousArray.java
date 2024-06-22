package subarrayProblems;

import java.util.ArrayList;

public class contiguousArray {
    public static void main(String[] args) {
        float output = contiguousArray(new int[]{1, 12, -5, -6, 50, 3}, 4);
       System.out.println(output);

        float output1 = contiguousArray1(new int[]{1, 12, -5, -6, 50, 3,6}, 4);
        System.out.println(output1);
        float output2 = contiguousArray2(new int[]{1, 12, -5, -6, 50, 3,6}, 4);
        System.out.println(output2);
    }

    public static float contiguousArray(int[] Array, int k) {
        ArrayList ArraySumValue = new ArrayList();
        for (int i = 0; i + k - 1 < Array.length; i++) {
            int SubArraySum = 0;
            for (int j = i; j < k + i; j++) {
                SubArraySum += Array[j];
            }
            ArraySumValue.add(SubArraySum);
        }
        int maximumValue = Integer.MIN_VALUE;
        for (int i = 0; i < ArraySumValue.size(); i++) {
            int currentValue = (int) ArraySumValue.get(i);
            if (currentValue > maximumValue) {
                maximumValue = currentValue;
            }

        }
        return maximumValue / k;
    }



    public static float contiguousArray1(int[] Array,int k){
        int subArraySum = 0;
        ArrayList subArraySumValue = new ArrayList();
        for (int i = 0; i < k;i++){
            subArraySum += Array[i];
        }
        subArraySumValue.add(subArraySum);
        for (int i = 1;i+k-1 < Array.length;i++){
            for (int j = i+k-1;j < i+k;j++){
                subArraySum -= Array[i-1];
                subArraySum += Array[j];
                subArraySumValue.add(subArraySum);
            }
        }
        int maximumValue = Integer.MIN_VALUE;
        for (int i = 0;i < subArraySumValue.size();i++){
            int currentValue = (int) subArraySumValue.get(0);
            if (currentValue > maximumValue){
                maximumValue = currentValue;
            }
        }
        return maximumValue / k;
    }



    public static float contiguousArray2(int[] Array,int k){
        ArrayList sumValues = new ArrayList();
        int subArraySum = 0;
        for (int i = 0; i < k;i++){
            subArraySum += Array[i];
        }
        sumValues.add(subArraySum);
        int subArrayStartIndex = 1;
        int subArrayEndIndex = subArrayStartIndex+k-1;
        while(subArrayStartIndex+k-1 < Array.length){
            subArraySum -= Array[subArrayStartIndex-1];
            subArraySum += Array[subArrayEndIndex];
            sumValues.add(subArraySum);
            subArrayStartIndex++;
            subArrayEndIndex++;
        }
        int maximumValues = 0;
        for (int i = 0; i < sumValues.size();i++){
            int currentValue = (int) sumValues.get(i);
            if (currentValue > maximumValues){
                maximumValues = currentValue;
            }
        }
        return maximumValues / k;
    }



}




// input = [1,12,-5,-6,50,3] k = 4
// output = 12.75
// for loop - 1,12,-5,-6
// int 1stcontiguousArray = 1
// i = 0 ; i < 4; i++
// j = i ; j < k=4+i; j++
// if input.length == j
// break
// input[j]
// 1,12,-5,-6
// 12,-5,-6,50
// -5,-6,50,3
// -6,50,3,
// int SubArraySum = 0;
// SubArraySum += char = 1
// ArrayList.add SubArraySum
//


// input = [1,12,-5,-6,50,3] , k=4
// output = 12.0
// for loop 1,12,-5,-6
// sum first sub array = 1,12,-5,-6 = 2
// 2-1 and add 50 = 51
// 51-12 and add 3 = 42
// 2 > 51
// 51 > 42
// return maximum average value

