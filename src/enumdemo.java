
    enum dept
    {
        TAMIL,ENGLISH,MATHS,COMPUTER;
    }

public class enumdemo {
    public static void main(String args[])
    {
      dept d= dept.COMPUTER;
      System.out.println(d.ordinal());
      System.out.println(dept.valueOf("COMPUTER"));
      dept list[]=dept.values();
      for (dept x:list)
      System.out.println(x);

    }
}
