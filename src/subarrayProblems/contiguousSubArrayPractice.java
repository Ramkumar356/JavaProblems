package subarrayProblems;

import java.util.ArrayList;

public class contiguousSubArrayPractice {
    public static void main(String[] args){
        float output = contigousSubArray(new int[]{1,23},1);
        System.out.println(output);
        boolean output1 = goodSubArray(new int[]{1,23,4,5,6,90},90);
        System.out.println(output1);

    }
    public static float contigousSubArray(int[] input, int k){
        ArrayList sumValues = new ArrayList();
        int subArraySumValues = 0;
        for (int i = 0; i < k; i++){
            subArraySumValues += input[i];
        }
        sumValues.add(subArraySumValues);
        int currentSumValues = 0;
        int greatestValue = Integer.MIN_VALUE;
        int startIndex = 0;
        int endIndex = startIndex + k - 1;
        while(endIndex + 1 < input.length){
            subArraySumValues -= input[startIndex];
            subArraySumValues += input[endIndex + 1];
            sumValues.add(subArraySumValues);
            startIndex++;
            endIndex++;
            currentSumValues = (int) sumValues.get(startIndex);
            if (currentSumValues > greatestValue){
                greatestValue = currentSumValues;
            }
        }
        return  greatestValue / k;
    }

    public static boolean goodSubArray(int[] input, int k){
        for (int i = 0; i < input.length; i++){
            int sumValues = 0;
            for (int j = i; j < input.length; j++){
                sumValues += input[j];
            }
            int startIndex = i;
            int endIndex = input.length-1;
            while(startIndex < input.length){
                if(sumValues % k == 0){
                    return true;
                }
                sumValues -= input[endIndex];
                endIndex--;
                startIndex++;
            }
        }
        return false;
    }

}

// input = 1,23,4,5,6,90   k = 3   28  32  15  101
// output = 25.25
// int subArraySum = 0;
// for loop i = 0, i < k
// subArraySum += input[i];
// stINdex = 1 endIndex = startIndex+k-1
// while (startIndex+k-1 < endINdex)
// subArraySum -= input[0]
// subArraySum += input[3]
// stIndex ++
// endIndex--


// input = 1,23,4,5,6,90 k = 5
// output = 5
// subArray in 1,23,4,5,6,90
// 1,23,4,5,6,90
// 1,23,4,5,6
// 1,23,4,5
// 1,23,4
// 1,23
// 1
// 23,4,5,6,90
// 23,4,5,6
// 23,4,5
// 23,4
// 23
// 4,5,6,90
// 4,5,6
// 4,5
// 4
// 5,6,90
// 5,6
// 5
// 6,90
// 6
// 90

// forloop i = 0 i < input.length
// int sumValues = 0
// for loop j = i
// sumValues += input[j]
// while (startIndex < input.length)
// currentValues = sumValues.get(startINdex)
// if (currentValue  % k == 0){
// return true
// sumValues -= input[endINdex]
// startINdex++
// endIndex--
//