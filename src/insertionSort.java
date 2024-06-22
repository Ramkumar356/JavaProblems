import java.util.Arrays;

class Insert
{
    public void Sorting(int[] array)
    {
        int temp;
        for (int i=0;i<array.length;i++)
        {
            int key = array[i];
            int j=i-1;

            while(j>=0 && array[j] > key)
            {
                array[j + 1] = array[j];
                j = j-1;

            }
            array[j+1] = key;

        }
        System.out.println(Arrays.toString(array));
    }
}
public class insertionSort {
    public static void main(String args[])
    {
        Insert i = new Insert();
        i.Sorting(new int[]{23,4,0,67,1,6});
    }
}
