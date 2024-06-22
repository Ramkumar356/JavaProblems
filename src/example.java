import java.util.Scanner;
public class example {
    public static void main(String args[]) {
        int a = 25;

        int b = 56;

        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();


      /*  switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;

        }
        int j=8;

        for (int i=1;i<=10;i++)
        {
            System.out.println(j +"x"+i +"="+j*i);
        }*/

        char[] letters=scan.nextLine().toCharArray();
        for (int i=letters.length - 1;i>=0;i--)
        {
            System.out.println(letters[i]);
        }
        System.out.println("/n");

    }
}
