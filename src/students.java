public class students {
    class Students
    {
        public int num;
        public String name;
        public String course;
        public int m1,m2,m3;

        public int  total() {
            return m1+m2+m3;
        }

        public float grade() {
            return (float)total()/3;
        }
    }
    public int total()
    {
        int m1 = 90;
        int m2 = 89;
        int m3 = 87;
        return m1+m2+m3;
    }
    public float average()
    {
        return (float) total()/3;

    }
    public char grade()
    {
        if(average()>=60)
            return 'a';
        else
            return 'b';


    }
    public String details()
    {

        String num = null;
        String name = null;
        String course = null;
        return "num"+ null +"\n"+"name"+name+"\n"+"course"+course;

    }


    public void main(String args[])
    {
        Students s=new Students();
        s.num=43;
        s.name="Ram";
        s.course="cse";
        s.m1=43;
        s.m2=90;
        s.m3=80;

        System.out.println(s.total());
        System.out.println(s.grade());
       // System.out.println(s.details());
    }
}
