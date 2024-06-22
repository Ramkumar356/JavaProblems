import java.util.Scanner;
public class switchcase {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        String days=scan.next();
        switch (num)
        {
            case 1:System.out.println("mon");
            //break;
            case 2:System.out.println("tue");
            //break;
            case 3:System.out.println("wed");
            //break;
            default:System.out.println("invalid day");
            break;
        }
        switch (days)
        {
            case "one":System.out.println("mon");
                break;
            case "two":System.out.println("tue");
                break;
            case "three":System.out.println("wed");
                break;
            default:System.out.println("invalid day");
                break;

        }
    }
}
