class cylinder
{
    private static double radius;
    private static double height;

    public cylinder()
    {
        radius=5;
        height=5;
    }
   /* public cylinder(double r,double h){
        radius=r;
        height=h;
    }*/


    public void setHeight(double height) {
        this.height = height;
    }
    public static void area()
    {
        System.out.println(height);
    }
    public double getRadius()
    {
        return radius;
    }
}
public class cylindertest {
    public static void main(String args[])
    {
        cylinder c=new cylinder();
        c.setHeight(6);
        c.area();




    }
}
