class test
{
    static  int x=10;
    static int y=20;
    void show() {
        System.out.println(x+" "+y);
    }
    static void display()
    {
        System.out.println(x+y);
    }
}

public class statictest {

    public static void main(String args[])
    {
        test t1=new test();
        test t2=new test();
        t1.x=45;
        t1.display();
        t2.show();
    }

}
