import java.util.Arrays;

class Sort
{
    public int SortedNumbers(int[] arr,int[] arr1){
        for (int i=0;i<arr.length;i++){
            int a1=arr[i];

            arr1[i]=a1*a1;

        }
        Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));
        return 0;
    }
}
public class sortedSquare {
    public static void main(String args[]){
        Sort s=new Sort();
        s.SortedNumbers(new int[]{-9,1,2,3,4,5},new int[6]);

    }
}
