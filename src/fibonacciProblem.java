import java.util.HashSet;
import java.util.Set;

public class fibonacciProblem {
    public static void main(String[] args){
        int output = fibonacci(6);
        System.out.println(output);

    }
    public static int fibonacci(int k){
//        Set visitedIndex = new HashSet();
//        if (!visitedIndex.contains(k)) {
            if (k == 0) {
                return 0;
            }
            if (k == 1) {
                return 1;
            }
//        }else{
//           return 0;
//        }
        int leftValue = fibonacci(k-1);
        int rightValue = fibonacci(k-2);
        int returnValue = leftValue + rightValue;
       // visitedIndex.add(new Position(k,returnValue));
        return returnValue;
    }

    public static class Position{
        int indexNumber;
        int value;
        public Position(int indexNumber,int value){
            this.indexNumber = indexNumber;
            this.value = value;
        }
    }
}
