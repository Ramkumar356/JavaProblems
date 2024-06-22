class myDatas
{
    int value;
    public void set(int v)
    {
        value=v;
    }
    public int get()
    {
        int x=0;
        x=value;
       return x;
    }


}
class producer extends Thread
{
    myData data;
    public producer(myData d)
    {
        data = d;

    }
    public void run()
    {
        int count=1;
        while (true)
        {
            data.set(count);
            System.out.println("producer"+count);
            count++;

        }

    }

}
class consumer extends Thread {
    myData data;

    public consumer(myData d) {
        data = d;

    }

    public void run() {
        int value;
        while (true) {
            value = data.get();
            System.out.println("consumer" + value);


        }

    }
}
public class interprocess {
    public static void main(String args[])
    {
        myData data=new myData();
        myData myDatas = null;
        consumer c=new consumer(myDatas);
        producer p=new producer(myDatas);



        p.start();
        c.start();
    }
}
