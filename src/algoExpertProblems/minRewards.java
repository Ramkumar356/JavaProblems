package algoExpertProblems;

import java.util.Set;
import java.util.Queue;
import java.util.LinkedList;
public class minRewards {
    public static void main(String[] args){
        int[] input = new int[]{2, 20, 13, 12, 11, 8, 4, 3, 1, 5, 6, 7, 9, 0};
       // minReward(input);
        optimalMinRewards(input);

    }
    public static void minReward(int[] input){
        int[] awards = new int[input.length];
        awards[0] = 1;
        Queue queue = new LinkedList();
        queue.add(0);
        while (!queue.isEmpty()){
            int currentIndex = (int) queue.remove();
            if (currentIndex+1 == input.length){
                break;
            }
            if(input[currentIndex+1] > input[currentIndex]){
                int currentValue = awards[currentIndex];
                awards[currentIndex+1] += currentValue+1;
                leftTraverse(input,currentIndex+1,awards);
                queue.add(currentIndex+1);
            }else{
                awards[currentIndex+1] = 1;
                queue.add(currentIndex+1);
                leftTraverse(input,currentIndex+1,awards);
            }

        }
        minimumAwards(awards);
    }

    public static void leftTraverse(int[] input,int currentIndex,int[] awards){
        if (currentIndex == 0) {
            return;
        }
        if (input[currentIndex-1] < input[currentIndex]){
            return;
        }
        if (input[currentIndex-1] > input[currentIndex]){
            awards[currentIndex-1] += 1;
        }
        leftTraverse(input,currentIndex-1,awards);
    }

    public static void minimumAwards(int[] awards){
        int minAwards = 0;
        for (int i = 0; i < awards.length; i++){
             minAwards += awards[i];
            System.out.print(awards[i] + " ");
        }
        System.out.println(" ");
        System.out.println(minAwards);
    }

    public static void optimalMinRewards(int[] input){
        int startIndex = 0;
        int endIndex = input.length-1;
        int sumValues = 0;
        int[] minRewards = new int[input.length];
        minRewards[0] = 1;
        while(startIndex < input.length-1){
           if (input[startIndex+1] > input[startIndex] ){
               minRewards[startIndex+1] = minRewards[startIndex]+1;
           }else{
               minRewards[startIndex+1] = 1;
           }
           startIndex++;
        }
        while(endIndex > 0){
            if (input[endIndex-1] > input[endIndex] && minRewards[endIndex-1] <= minRewards[endIndex]){
                minRewards[endIndex-1] = minRewards[endIndex]+1;
            }
            endIndex--;
        }
        for (int i = 0; i < input.length; i++){
            sumValues += minRewards[i];
            System.out.print(minRewards[i] + " ");
        }
        System.out.println(sumValues);
    }
}

// input = 8,4,2,1,3,6,7,9,5
//         4 3 2 1 2 3 4 5 1

// input = 2, 20, 13, 12, 11, 8, 4, 3, 1, 5, 6, 7, 9, 0
//         1  8   7   6   5   4  3  2  1  2  3  4  5  1
//
// output = 52
// output = 25
// 1 2 3 4 5 6 7 8 9
// 1 == 2
//1 2 3 4 5 6 7 8 9


// while loop
// int[] awards = new int[];
// index[0] = 1
// index[i+1] > index[i]
// queue.add(index[i])
// currentindex = queue.remove()
// input[currentindex+1] > input[currrentindex]
// set.add input[currentindex+1]
// checkpreviousindex();
// input[currrentindex-1] > input[currentindex]
// awards[currentindex-1] += 1
//


// for i = 0
// for j = 0
// 1 2 3 4 5 6 7
// traverse to right to left
// traverse to left to right

// 1 2 3 4 1 2 3 0
// 1 2 3 4 1 2 3 1

// 2, 20, 13, 12, 11, 8, 4, 3, 1, 5, 6, 7, 9, 0
// 1  8   7   6   5   4  3  2  1  2  3  4  5  1




