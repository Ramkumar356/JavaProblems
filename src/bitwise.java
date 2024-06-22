public class bitwise {

    public static void main (String[] args){

        int a=79,b=56;

        a=a^b;
        b=a^b;
        a=a^b;
        byte c;

        c=(byte)(9<<4);
        c=(byte)(c|12);
        System.out.println((c&0b11110000)>>4);
        System.out.println((c&0b00001111));
        System.out.printf("%010d",a);




        System.out.println(a+ " "+b);
    }
}
