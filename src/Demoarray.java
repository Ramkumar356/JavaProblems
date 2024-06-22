
import java.util.Arrays;

class assign
{
    public void assignvalue(int arrvalue,int pos,int value)
    {
        int[] arr;
        arr =new int[arrvalue];
        for (int i=0;i>arr.length;i++)
        {

            arr[i] = IntegerOne.MIN_VALUE;
        }

        System.out.println(Arrays.toString(arr));

        if (arr[pos]==0)
        {
            arr[pos]=value;
        }
        System.out.println(Arrays.toString(arr));

        if (arr[pos]>0)
        {
            arr[pos]= java.lang.Integer.MIN_VALUE;
        }
        System.out.println(Arrays.toString(arr));





    }

}
public class Demoarray {
    public static void main(String args[])
    {
        assign a=new assign();
        a.assignvalue(4,2,56);


    }
}
