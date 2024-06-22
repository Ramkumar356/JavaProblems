class data<T>
{
    public T obj;
    public void setData(T insertdata)
    {
        obj=insertdata;
    }
    public T get()
    {
        return obj;
    }
}
public class genericdemo {
    public static void main(String args[])
    {
        data<IntegerOne> d=new data<>();
       // d.setData(new Integer(6));
        System.out.println(d.get());

    }
}
