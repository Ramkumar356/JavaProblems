public class operators {
    public static void main (String[] args){

        int x=5;
        int y=x++;
        System.out.println(y);
        System.out.println(x);
        char a='A';
        //for
        a++;
        System.out.println(a);

        int x1=4,y1 = 5,z;
        z=2*++x1 + 3* ++y1;
        System.out.println(x1+" "+y1);
        System.out.println(z);
        int a1=0b0101;
        int a2=0b1110;
        int a3=a1&a2;
        int a4=a1|a2;
        int a5=a1^a2;
        int a6=a1<<a2;
        int a7=a1>>>a2;
        System.out.println(a3);
        System.out.println(a5);
        System.out.println(a6);
        System.out.println(a7);
        System.out.println(a4);
        int y2=a1>>2;
        int y3=~a1;
       // System.out.println(String.format("%s",Integer.toBinaryString(y2)));
        System.out.println(y3);






    }
}
