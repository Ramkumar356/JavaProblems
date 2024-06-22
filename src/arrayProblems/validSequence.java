package arrayProblems;

import java.util.HashSet;
import java.util.Set;
public class validSequence {
    public static void main(String[] args){
        boolean output = validSequence(new int[]{1,2,3,4,5,6,7},new int[]{7});
        System.out.println(output);

        }
    public static boolean validSequence(int[] input,int[] sequence){
        Set set = new HashSet();
        for (int i = 0; i < input.length; i++) {
            set.add(input[i]);
        }
        int startIndex = 0;
            if (!set.contains(sequence[startIndex])) {
                return false;
            }

        return true;
    }
}
