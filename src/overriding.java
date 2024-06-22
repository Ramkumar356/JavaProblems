class smartTV
{
    public void switchOn()
    {
        System.out.println("TV is switced on");
    }
    public void changeChannel()
    {
        System.out.println("TV channel is changed");

    }

}
class TV extends smartTV
{
   // @Override
    public void switchOn()
    {
        System.out.println("smart TV is switced on");

    }
   // @Override
    public void changeChannel()
    {
        System.out.println("smartTV channel is changed");

    }
    public void browse()
    {
        System.out.println("smarTV browsing");
    }
}
public class overriding
{
    public static void main(String args[])
    {
        //TV t=new smartTV();
        smartTV tv=new TV();
        //t.browse();
        tv.switchOn();
        tv.changeChannel();
    }
}
