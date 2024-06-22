interface MyLamda
{
    public int display(int m,int r);
}
public class demolamda {
    public static void main(String args[])
    {
        MyLamda m=(a,b)->{return a+b;};

        System.out.println(m.display(56,7));


    }
}
