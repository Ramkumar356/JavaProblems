import java.lang.reflect.Array;

class main
{
    public int TwoNumber(int[] array, int target)
    {
        try {


        for (int i=0;i<array.length-1;i++) {
            for (int j=i;j<array.length-1;j++) {
                int first=array[i];
                int second=array[j];
                if (first + second == target) {
                    System.out.println(Array.getInt(first, second));
                }
            }

            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return 0;
    }


}
public class twoNumberSum {
    public static void main(String args[])
    {
        main m=new main();
        m.TwoNumber(new int[]{1,2,3,4,5},7);

    }
}
