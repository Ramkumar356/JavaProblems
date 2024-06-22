class foo
{
    public int round(int a)
    {
        if(a<1)
            return a;
        else
            round(a-1);
            System.out.println("hello"+a);

            return 0;
    }


}
public class recursive {
    public static void main(String args[])
    {
        foo f=new foo();
        f.round(5);

    }
}
