package arrayProblems;

import java.util.Arrays;

public class arrayofproducts {
    public static void main(String[] args){
        int[] output = arrayOfproducts(new int[]{3,5,1,2,3});
        int[] output1 = arrayOfproducts(new int[]{3,-1,1,2,3});
        System.out.println(Arrays.toString(output));
        System.out.println(Arrays.toString(output1));
    }
    public static int[] arrayOfproducts(int[] input){
        int[] arrayOfProductNumber = new int[input.length];   // product 10 numbers using wraparound
        for (int i = 0; i < input.length; i++){           // 3*5*1*2*3*3*5*1*2*3
            int productSum = 1;    // productSum = 1   index 0 1 2 3 4 0 1 2 3 4
            for (int j = 0; j < input.length; j++){
                if (i != j) {
                    productSum *= input[j];     // productSum = 1  * input[j] = 5 = 5
                }                               // productSum = 5  5*1 = 5
            }                                   // productSum = 5  5*2 = 10
            arrayOfProductNumber[i] = productSum;  // productSum = 10  10*3 = 30
        }                                          // productSum = 30
      return   arrayOfProductNumber;
    }

    public static int[] arrayOfProductsOptimal(int[] input){
        int arrayProductValue = 0;
        int[] arrayOfProduct = new int[input.length];    // multiply use 1 to store empty variable value for multiplication
        int startIndex = 0;                               // addition use 0 to add values in empty variable value
        for (int i = 0; i < input.length; i++){
            arrayProductValue *= input[i];
        }
        while (startIndex < input.length){
            arrayOfProduct[startIndex] = arrayProductValue / input[startIndex];
            startIndex++;
        }
        return arrayOfProduct;
    }
}

// product of numbers  multiplying numbers is products of sum 1*2 = 2   1*2*3 = 6
// input = [3,5,1,2,3]
// 3 = 5*1*2*3 = 30
// 5 = 3*1*2*3 = 18
// 1 = 3*5*2*3 = 90
// 2 = 3*5*1*3 = 45
// 3 = 3*5*1*2 = 30
// output = [30,18,90,45,30]
// int[] productNumberArray = new int[];
// forloop i = 0; i < input.length
// for j = 0; j < input.length
//  if ( i != j)
//  productSum *= input[j];
// }
// int productSum[i] = productSum



// input = 3,5,1,2,3
// output = 30,18,90,45,30
// int sumArrayOfProducts = 1
// sumArrayOfProducts *= input[i]   15 = 5  5*1 = 5  5*2 = 10   10*30 = 30  30*3   = 90
// using this for output[1] not product of input[1]
// sumArrayOfProducts / 3  = 90/3 30    90/5  = 18   90/1  =90    90/2 =  45   90/3  = 30
