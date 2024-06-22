class numbers1{
    public int num1(String s)
    {
        int count = 0;
        String[] n= new String[]{"()","[]","{}","{}[]","{}()","()[]","()()","[]{}","{}[]()"};
        for (int i = 0; i<n.length; i++)
        {
            if (s == n[i])
            {
               count += 1;
                break;

            }
        }
        if (count == 1)
        {
            System.out.println("true");
        }else

        System.out.println("false");
        return 0;
    }
}
public class Braces {
    public static void main(String[] args)
    {
        numbers1 n1 =new numbers1();
        n1.num1("{]");
    }
}
