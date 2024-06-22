public class stringmethod {
    public static void main(String[] args){

        String str="gokul.govindaraj2002@gmail.com";
        int i=str.indexOf("@");
        String userName=str.substring(0,i);
        String domainName=str.substring(i+1,str.length());
        System.out.println(userName);
        System.out.println(domainName);
        String str1="abcd bgbfg grgr grrt";
        //System.out.println(str1.replaceAll("[a-zA-Z0-9]",""));
        System.out.println(str1.replaceAll("\\s+",""));

    }
}
