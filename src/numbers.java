import java.util.Scanner;

class number1
{
    public int number2(int a,int b)
    {
        if (a>b)
        {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
        return 0;



    }
    public int number3(int a,int e)
    {

        int f=a+e;




        System.out.println(f);
        a=e;
        e=f;
        Scanner scan=new Scanner(System.in);
        int d= scan.nextInt();
        if(a>d) {
            return 0;
        }
        number3(a,e);
        //number2(9,8);
        return 0;



    }



}

class numbers2{
    public void numbers(){
        for (int i = 2; i < 100;i++){
            if(i % 3 == 0 && i % 5 != 0 && i % 7 != 0){
                System.out.println("gobi");
            }else if(i % 5 == 0 && i % 3 != 0 && i % 7 != 0){
                System.out.println("gokul");
            }else if(i % 7 == 0 && i % 5 != 0 && i % 3 != 0){
                System.out.println("dhaksith");
            }else{
                System.out.println(i);
            }
        }
    }
}

public class numbers {
    public static void main(String args[])
    {
//        number1 n=new number1();
//
//        n.number2(30,20);
//        n.number3(0,1);
//        //n.number3(10);

        numbers2 number = new numbers2();
        number.numbers();



    }
}
