

public class string {
    public  static  void  main (String [] args){

        String tvseries = "       theboys     ";

        System.out.println(tvseries.toUpperCase());

        int ageOfPerson = 8;
        boolean indianCitizen = false;
                                         // true    ,   false  method
        String name = ageOfPerson >= 18 ? "wow" : "no";

        System.out.println(ageOfPerson == 18 || indianCitizen == true);
        System.out.println(name);

        String myName = "gokul";
        String college = "university college of engineering ";
        String formattedString = String.format("may name is %s .My college name is %s" , myName , college);
        System.out.println(formattedString);
        char c[]={'a','b','c'};
        byte b[]={54,33 ,66,77};
        String str1=new String(c);
        String str2=new String(b,1,2);

        System.out.println(str1);
        System.out.println(str2);
        int l=tvseries.length();
        System.out.println(l);
        String series=tvseries.toUpperCase();
        System.out.println(series);
        System.out.println(tvseries);
        //tvseries=tvseries.trim();
        System.out.println(tvseries);
        String sub=tvseries.substring(3);
        System.out.println(sub);
        System.out.println(tvseries);
        tvseries=tvseries.trim();
        System.out.println(tvseries);
        System.out.println(tvseries.length());
        System.out.println(tvseries.startsWith("t"));
        //String str=tvseries.endsWith("s");
        System.out.println(tvseries.charAt(6));
        System.out.println(tvseries.matches("[a-z]{10,12}"));






    }
}
