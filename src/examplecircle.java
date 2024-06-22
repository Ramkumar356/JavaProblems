class box
{
    public String colour()
    {
        return "red";

    }
    public static int capacity()
    {
        return 100;
    }
    static int weight()
    {
       return capacity();
    }

}
public class examplecircle {

    public static void main(String args[]){


        box b=new box();
        b.colour();
        System.out.println(b.colour());
        System.out.println(b.weight());
        System.out.println(b.capacity());


    }
}
