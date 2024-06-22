import java.util.Arrays;

class pal
{
    public String checkplaindrome(String[] Palindrome)
    {
        try {

            String[] st = new String[Palindrome.length];

            int j = Palindrome.length;
            for (int i = 0; i < Palindrome.length-1; i++) {
                st[i] = Palindrome[j];
                j--;

            }

        System.out.println(Arrays.toString(Palindrome));
        System.out.println(Arrays.toString(st));

        if(st.equals(Palindrome))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
      return "a" ;
    }
}

class PalindromeCheck
{

    public void check (String[] arr)
    {
        int x = arr.length/2;
        int y = arr.length;
        int count = 0;
        for (int i=0;i<x;i++)
        {
            if (arr[i]==arr[y])
            {
                count += 1;
            }
            y--;
        }
        if (count==x)
        {
            System.out.println(arr[0]);
        }
        else
        {
            System.out.println("false");
        }
    }
}

public class palindrome
{
    public static void main(String args[])
    {
       // pal p = new pal();

       // p.checkplaindrome(new String[]{"aba"});

        PalindromeCheck d = new PalindromeCheck();
        d.check(new String[]{"nitin"});

    }


}