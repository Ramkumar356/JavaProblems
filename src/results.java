class  student
{
    public String name;
    public int rollno;
    public int m1,m2,m3;
    public int total()
    {
        return m1+m2+m3;
    }
    public int Average()
    {
        return total()/3;
    }
}
public class results {
    public static void main(String args[])
    {
        student s1=new student();
        s1.name="ram";
        s1.rollno=23;
        s1.m1=90;
        s1.m2=85;
        s1.m3=95;
        System.out.println(s1.total());
        System.out.println(s1.Average());

    }
}
