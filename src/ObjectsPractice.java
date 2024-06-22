import java.util.Arrays;

public class ObjectsPractice{
    public static void main(String[] args){
        bankDetails customerOne = new bankDetails("Gobi",12345678,10000);
        bankDetails customerTwo = new bankDetails("Gokul",12345679,10000);
        bankDetails customerThree = new bankDetails("Dhaksith",123456780,10000);
        customerOne.balance = deposit(5000,customerOne.balance);
        customerTwo.balance = deposit(1000,customerTwo.balance);
        customerThree.balance = deposit(3000,customerThree.balance);
        bankDetails duplicateCustomerOne = customerOne;
        System.out.println(customerOne.balance);
        duplicateCustomerOne.balance = 45;
        System.out.println(customerOne.balance);
        checkBalance(customerOne.balance);
        checkBalance(customerTwo.balance);
        checkBalance(customerThree.balance);
        customerOne.balance = withdraw(100,customerOne.balance);
        customerTwo.balance = withdraw(300,customerTwo.balance);
        customerThree.balance = withdraw(500,customerThree.balance);
        checkBalance(customerOne.balance);
        checkBalance(customerTwo.balance);
        checkBalance(customerThree.balance);
        int[] output = sortingAsenting(new int[]{1,6,7,3,5,9});
        System.out.println(Arrays.toString(output));
        int[] output1 = sortingDescending(new int[]{1,6,7,3,5,9});
        System.out.println(Arrays.toString(output1));
        boolean output3 = numberSearchArray(new int[]{1,6,7,3,5,9},1);
        System.out.println(output3);

    }

    public static int deposit(int amount,int balance){
         balance += amount;
         return balance;

    }

    public static int withdraw(int amount, int balance){
        balance -= amount;
        return balance;
    }

    public static void checkBalance(int balance){
       System.out.println(balance);
    }

    public static class bankDetails{
        String name;
        int accNumber;
        int balance;
        public bankDetails(String name,int accNumber,int balance){
            this.accNumber = accNumber;
            this.balance = balance;
            this.name = name;
        }
    }

    public static int[] sortingAsenting(int[] input){
        for (int i = 0; i < input.length-1; i++){
            for (int j = 0; j < input.length-1; j++){
                if (input[j] > input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }

    public static int[] sortingDescending(int[] input){
        for (int i = 0; i < input.length-1; i++){
            for (int j = 0; j < input.length-1; j++){
                if (input[j] < input[j+1]){
                    int temp = input[j];
                    input[j] = input[j+1];
                    input[j+1] = temp;
                }
            }
        }
        return input;
    }

    public static boolean numberSearchArray(int[] input, int target){
        for(int i = 0; i < input.length; i++){
            if (input[i] == target){
                return true;
            }
        }
        return false;
    }
}


// sorted Array
// input = [1,6,7,3,5]
// output = [1,3,5,6,7]
// for loop i = 0; i < inout.length
// comparing 0th index and 1st index value
// if 0th index value > 1st index value
// 1 > 6  false
// swapping the value
// comparing next two index value
// 1st index value > second index value 6 > 7  false
// 2nd index > 3rd index 7 > 3 true
// 1 6 3 7 5   7 > 5 true
// 1 6 3 5 7   1 > 6 f  6 > 3
// 1 3 6 5 7   6 > 5
// 1 3 5 6 7


//
