import java.util.Arrays;

class Bubble
{
    public void Sort(int[] Array)
    {
        int Temp;
        for (int i=0;i<Array.length-1;i++)
        {
            for (int j=1;j<Array.length;j++) {
                if (Array[j-1] > Array[j]) {
                    Temp = Array[j-1];
                    Array[j-1] = Array[j];
                    Array[j] = Temp;
                }
            }
        }
        System.out.println(Arrays.toString(Array));

    }
}
public class bubblesort {
    public static void main(String args[]) {

        Bubble B = new Bubble();
        B.Sort(new int[]{112,5,341,6,57,8,90,1,-34,-56});

    }

}
