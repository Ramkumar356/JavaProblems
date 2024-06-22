class circle5
{
    private double radius;
  /*  public double getradius()
    {
        return radius;
    }*/

    public void setradius(int R)
    {
        radius=R;

    }
    public double area()

    {
        return Math.PI*radius*radius;

    }
    public double perimeter()
    {
      return  2*Math.PI*radius;

    }
    public double circumference()
    {
        return perimeter();
    }
}


public class circle {

    public static void main(String args[])
    {

        circle5 c1=new circle5();
        circle5 c2=new circle5();
        c2.setradius(89);//private data set
        c1.setradius(90);//private data set
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
        System.out.println(c1.circumference());
        System.out.println(c2.area());
        System.out.println(c2.perimeter());
        System.out.println(c2.circumference());
    }
}
