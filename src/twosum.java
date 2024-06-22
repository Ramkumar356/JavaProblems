class TwoSum {
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for(int i = 0;i < array.length;i++)
        {
            if (array[i] < targetSum)
            {
                for(int j = i+1; j < array.length; j++)
                {
                    if (array[i] + array[j] == targetSum)
                    {
                        int[] arrays = new int[]{array[i],array[j]};
                    }
                }
            }
        }
        return new int[]{0};
    }
}
public class twosum {
    public static void main(String[] args)
    {
        TwoSum p = new TwoSum();



    }
}



