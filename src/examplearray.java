import java.util.Arrays;

public class examplearray {
    public static void main(String args[]){
          int[] output = sortedSquaredArray(new int[]{-5,-14,-3,-2,-1});
          System.out.println(Arrays.toString(output));
        }
    public static int[] sortedSquaredArray(int[] input) {
        int[] squaredValues = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            squaredValues[i] = input[i] * input[i];
        }
        for (int i = 0; i < squaredValues.length; i++){
            for (int j = i+1; j < squaredValues.length; j++){
                if (squaredValues[i] > squaredValues[j]){
                    int currentValue = squaredValues[j];
                    squaredValues[j] = squaredValues[i];
                    squaredValues[i] = currentValue;

                }
            }
        }
        return squaredValues;
    }
}
