import java.util.Arrays;
import java.io.*;
import java.util.*;

public class commonCharacter {
    public static void main (String args[])
    {

        int[] intArray = new int[4];
        String[] arrayName = new String[]{"abc","b","c","d"};
        arrayName[0] = "abfcbaccd";
        common c = new common();
        c.commonChar(new String[]{"abfcbaccd"});

    }
}

class common
{
     public int[] commonChar (String[] arr)
     {
         String name = "abcdabcdf";


         int count = 0;
         for (int i=0;i<arr.length;i++)
         {
             String currentValue = arr[i];

             for (int j=0;j< currentValue.length();j++) {

                 char currentChar = currentValue.charAt(j);

                 for(int k = j+1;k < currentValue.length();k++)
                 {
                 if (currentChar == currentValue.charAt(k)) {
                     count += 1;
                     break;
                 }
                 }
             }

         }
         if (count >= 4 ) {
             System.out.println(count);
             System.out.println("true");
         }
         else
             System.out.println("false");



  /*   for (int i = 0;i<=8;i++)
     {
         char ch = name.charAt(i);

         for (int j=1;j<9;j++) {
             char ch1 = name.charAt(j);

             if (ch == ch1)
             {
                 System.out.println(ch);
             }
         }
     }*/
         return new int[0];
     }
}
