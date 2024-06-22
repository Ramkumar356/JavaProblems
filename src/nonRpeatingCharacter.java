import java.util.HashMap;

class nonRepeat
{
    public void program (int[] arr)
    {
        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=1;j<arr.length;j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}

public class nonRpeatingCharacter {
    public static void main(String args[])
    {
       nonRepeat rep = new nonRepeat();
       rep.program(new int[]{'a','b','c','d','c','a','f'});
       // NonRepeat N = new NonRepeat();
        //N.Program(new int[]{'a','b','c','d','c','a','f'});


    }
}
