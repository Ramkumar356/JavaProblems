package numberProblems;

public class postiveStartValue {
    public static void main(String[] args){
         int output = minimumPositive(new int[]{-67 ,2,4,2});
         System.out.println(output);
        int output1 = minimumPositive(new int[]{-3,2,-3,4,2});
        System.out.println(output1);
    }

    public static int minimumPositive(int[] input){
        int sumValues = 0;
        int currentValue = 0;
        int smallvalue = 0;
        for (int i = 0;i < input.length;i++){
            sumValues += input[i];
            currentValue = sumValues;
            if (currentValue < smallvalue){
                smallvalue = currentValue;
            }
        }
        int startValue = 0;
        return startValue - smallvalue + 1;
    }
}

// input = [-3,2,-3,4,2]
// output
// startValue = 0
// for loop i = startValue
// j loop startValue + -3
// startValue + 2
// startValue + -3
// startValue + 4
// startValue + 2
// sum value < 1 break
// arraylist add sumvalues = 7

//