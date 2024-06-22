import java.util.Arrays;
import java.util.Scanner;
class rev
{
    public int reverse(int n)
    {
        int[] temp = new int[4];
        for(int i=0;i < 4;i++) {

            int rev = n % 10;
            n = n / 10;
            temp[i] = rev;
        }
        System.out.println(Arrays.toString(temp));


        int temp1 = 0;
        int remainder = n%10;
        temp1 = temp1*10+remainder;
        n = n/10;
        System.out.println(temp1);
        return 0;
    }

}
public class reverse {

    public static void main(String args[])
    {
        rev r =new rev();
        r.reverse(1234);

    }
}
