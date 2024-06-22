package StringProblems;

class roman
{
    public static String romanletter(int num)
    {
        String ones[]={"","I","II","III","IV","V","VI","VIII","XI"};
        String tens[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX"};
        System.out.println(tens[(num%100)/10] + ones[num%10]);
        return "h";

    }
}
public class romanLetters {
    public static void main(String args[])
    {
        roman r=new roman();
        r.romanletter(84);


    }
}
