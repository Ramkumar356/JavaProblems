
/*class mythread extends Thread
{
    public void run()
    {
        int i=1;
        while(true) {
        System.out.println(i+" hello");
        i++;
        }
    }
}*/
class myRunnable implements Runnable {


    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " hello");
            i++;
        }
    }
}
/*public class multithreading extends Thread
{
    public void run()
    {
        int i=1;
        while (true)
        {
            System.out.println(i+" hello");
            i++;
        }
    }*/
    public class multithreading
{
    public static void main(String args[])
    {
        myRunnable th=new myRunnable();
        Thread t=new Thread();
        t.start();
        int i=1;
        while (i < 10)
        {
            System.out.println(i + " world");
            i++;
        }

    }
}
