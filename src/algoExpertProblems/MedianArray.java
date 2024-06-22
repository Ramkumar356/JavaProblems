package algoExpertProblems;

public class MedianArray {
    public static void main(String[] args){
        float output = medianOfTwoSortedArray(new int[]{1,3,4,5},new int[]{2,3,6,7});
        System.out.println(output);
        float output1 = medianOfTwoArray(new int[]{-100, -50, -1, 0, 1},new int[]{-1, 0, 1, 50, 100});
        System.out.println(output1);

    }
    public static float medianOfTwoSortedArray(int[] firstArray,int[] secondArray){
        int medianDivisor = firstArray.length + secondArray.length;
        int firstArraySum = arraySum(firstArray);
        int secondArraySum = arraySum(secondArray);
        float medianValue = (firstArraySum + secondArraySum) / medianDivisor;
        return medianValue;

    }
    public static int arraySum(int[] input){
        int sumValues = 0;
        for (int i = 0; i < input.length; i++){
            sumValues += input[i];
        }
        return sumValues;
    }
    public static float medianOfTwoArray(int[] firstArray,int[] secondArray){
        int[] combinedArray = new int[firstArray.length+secondArray.length];
        int medianDivisor = combinedArray.length / 2;
        int index = 0;
        for (int i = 0; i < 2; i++){
            int[] currentArray ;
            if (i == 0){
                currentArray = firstArray;
            }else{
                currentArray = secondArray;
            }
            for (int j = 0; j < currentArray.length; j++){
                combinedArray[index] = currentArray[j];
                index++;
                if (index > combinedArray.length){
                    break;
                }
            }
        }
        for (int i = 0; i < combinedArray.length-1; i++){
            for (int j = 0; j < combinedArray.length-1; j++){
                if (combinedArray[j] > combinedArray[j+1]){
                    int temp = combinedArray[j];
                    combinedArray[j] = combinedArray[j+1];
                    combinedArray[j+1] = temp;
                }
            }
        }
        int medianValue = combinedArray[medianDivisor];
        return medianValue;
    }
}


// input = [1,3,4,5]
//         [2,3,6,7]
//         [1,2,3,3,4,6,5,7]
//         [1,2,3]
//
// two sorted integer array
// int medianDivisor = input.length-1 + input1.length-1
// for loop i = 0; i < input.length
// writing method to get sum value of array
// for i = 0; i < input.length
// int sumValues += input[i];
// return sumvalues
// firstArray = method();
// secondAray = method();
// return firstArray + secondArray / medianDivisor
