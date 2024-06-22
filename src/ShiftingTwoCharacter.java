import java.util.HashMap;

public class ShiftingTwoCharacter {
    public static void main(String[] args){
        int output = swappingTwoNumbers(9876546);
        System.out.println("Descending order number" +  " " +output);
        int output1 = swappingTwoNumbers(1234867);
        System.out.println("Ascending order number" + " " +output1);
        int output2 = swappingTwoNumbers(1011);
        System.out.println(output2);
        int output3 = swappingTwoNumbers(876540987);
        System.out.println(output3);
    }
    public static int swappingTwoNumbers(int input){
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        int reversedNumber = 0;
        int greatestNumber = Integer.MIN_VALUE;
        String inputLength = Integer.toString(input);
        int inputLength1 = inputLength.length();
        int swappedInteger = 0;
        int greatestNumberIndex = 0;
        int duplicateInput = input;
        while(duplicateInput != 0){
            int remainder = duplicateInput % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            hashmap.put(inputLength1,remainder);
            if (inputLength1 > 1) {
                if (remainder > greatestNumber) {
                    greatestNumber = remainder;
                    greatestNumberIndex = inputLength1;
                }
            }
            inputLength1--;
            duplicateInput = duplicateInput / 10;
        }
        if (hashmap.get(1) > hashmap.get(2) && hashmap.get(1) > hashmap.get(greatestNumberIndex)){
            int smallNumberIndex = 0;
            for (int i = 1; i < hashmap.size(); i++) {
                if (hashmap.get(i) < hashmap.get(i + 1)) {
                    smallNumberIndex = i;
                    break;
                }
            }
            int greatestNumbersIndex = 0;
            int currentIndex = smallNumberIndex;
            while (currentIndex < hashmap.size()) {
                currentIndex++;
                if (hashmap.get(currentIndex) > greatestNumbersIndex) {
                    greatestNumbersIndex = currentIndex;
                }
            }
            if (greatestNumbersIndex != currentIndex){
                return input;
            }
            for (int i = 1; i < hashmap.size(); i++) {
                if (hashmap.get(greatestNumberIndex) > hashmap.get(i)) {
                    smallNumberIndex = i;
                    break;
                }
            }
            for (int i = 1; i <= hashmap.size(); i++) {
                if (i == smallNumberIndex) {
                    swappedInteger = swappedInteger * 10 + hashmap.get(greatestNumbersIndex);
                } else if (i == greatestNumbersIndex) {
                    swappedInteger = swappedInteger * 10 + hashmap.get(smallNumberIndex);
                } else {
                    swappedInteger = swappedInteger * 10 + hashmap.get(i);
                }
            }
        }else {
            int smallestNumberIndex = 0;
            for (int i = 1; i < hashmap.size(); i++) {
                if (hashmap.get(greatestNumberIndex) > hashmap.get(i)) {
                    smallestNumberIndex = i;
                    break;
                }
            }
            for (int i = 1; i <= hashmap.size(); i++) {
                if (i == smallestNumberIndex) {
                    swappedInteger = swappedInteger * 10 + hashmap.get(greatestNumberIndex);
                } else if (i == greatestNumberIndex) {
                    swappedInteger = swappedInteger * 10 + hashmap.get(smallestNumberIndex);
                } else {
                    swappedInteger = swappedInteger * 10 + hashmap.get(i);
                }
            }
        }
        return swappedInteger;
    }
}

// input = 12345 swap only two number and the output would be the greatest number
// output = 54321
// int remainder = Integer.MinValue
// int remainder = input % 10;  = 1
// int reversedNumber = reversedNUmber * 10 + remainder
// if(remainder > greatestnumber)
// hashpap<int,int> hashmap
// haspmap.add(input.length--,remainder)
// greatestnumber = remainder
// input = input / 10
// hashmap(1) = remainder
// hashmap(inputlength) = hashmap.(1)


// 98756  9 > 8 true
// 8 > 7 true
// 7 > 5 true
// 5 > 6