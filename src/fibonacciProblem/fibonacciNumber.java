package fibonacciProblem;

public class fibonacciNumber {
    public static void main(String[] args){
       long output = fibonacci(20);
       long output1 = fibonacci(47);
       long minusValue = output + output1;
       System.out.println(output);
       long output2 = recursiveFibonacci(4);
       System.out.println(output2);

    }
    public static long fibonacci(int n) {
        long firstFibonacciNumber = 0;
        long secondFibonacciNumber = 1;
        long fibonacciValue = 0;
        for (int i = 0; i < n-1; i++) {
            fibonacciValue = firstFibonacciNumber + secondFibonacciNumber;
            firstFibonacciNumber = secondFibonacciNumber;
            secondFibonacciNumber = fibonacciValue;
        }
        return fibonacciValue;
    }

    public static long recursiveFibonacci(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        long leftValue = recursiveFibonacci(n-1);
        long rightValue = recursiveFibonacci(n-2);
        return leftValue + rightValue;


    }

}

// input = 8   0 1 1 2 3 5 8 13 21
//             0 1 2 3 4 5 6 7  8
// output = 21
// int firstNumber = 0;
// int secondNumber = 1;
// forloop i = 0,i < n
//
// int fibonacciValue = firstNumber+secondNum; 0 + 1 = 1 , 1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8
// firstNum = secondNum; 1,1,2,3
// secondNum = fibonacciValue; 1,2,3,5
//
// input  n = 8
// output = 21
// f(n) = (n - 1) + (n - 2)
// fibonacci(n - 1) + fibonacci(n - 2)
// fibonacci
//
//