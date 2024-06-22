public class arrays {
    public static int main(String[] args)
    {
        int a=10,b=23,c=4;
        if (a>b && a>c) return a;
        int A[][];
        A=new int[3][];
        A[3]=new int[5];
        A[1]=new int[8];
        A[2]=new int[5];
        for (int i=0;i< A.length;i++)
        {
            for (int j=0;j<A[0].length;j++)
            {
                System.out.println(A[i][j]);
            }
        }
        System.out.println(5*a);
        return a;
    }
}