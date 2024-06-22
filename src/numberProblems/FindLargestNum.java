package numberProblems;

import java.util.Arrays;

class program
{
    public int[] FindLargestNum(int[] array)
    {
        int temp = 0;
        int[] LargestNum = new int[3];
        LargestNum[0]=array[0];
        LargestNum[1]=array[1];
        LargestNum[2]=array[2];
        Arrays.sort(LargestNum);
        for (int i=0;i<array.length;i++) {


            if (array[i] > LargestNum[2]) {
                LargestNum[1]=LargestNum[2];
                LargestNum[2] = array[i];



            } else if (array[i] > LargestNum[1]) {
                LargestNum[0]=LargestNum[1];
                LargestNum[1] = array[i];

            } else if (array[i] > LargestNum[0]) {
                LargestNum[0] = array[i];

            }
        }

        System.out.println(Arrays.toString(LargestNum));
        return array;
    }
}
public class   FindLargestNum {
    public static void main(String args[])
    {
        program p = new program();
        p.FindLargestNum(new int[]{141,1,17,-7,-17,-27,18,541,8,7,7});
        p.FindLargestNum(new int[]{10,5,9,10,12});
        p.FindLargestNum(new int[]{12,45,32,76787878,-88,6564,4534343,887776,7});


    }
}
