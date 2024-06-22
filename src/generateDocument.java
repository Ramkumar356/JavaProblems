public class generateDocument {
    public static void main(String args[])
    {
        Document D = new Document();
        D.generater(new String[]{"e","a","b","c"},new String[]{"d","b","c","e"});

    }
}


class Document
{
    public int generater(String[] character,String[] document)
    {
        int count = 0;
        int x = character.length;
        for (int i=0;i<x;i++)
        {
            for (int j=1;j<=x;j++) {
                if (character[i] == document[j-1]) {
                    count += 1;
                }


            }

        }
        if (count == character.length)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }

        return 0;
    }
}
