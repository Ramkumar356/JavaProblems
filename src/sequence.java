public class sequence {

    static class first1 {


        public boolean first(int[] array, int[] subsequence) {
            try {


                for (int i = 0; i <= subsequence.length; i++) {
                    for (int j = 0; j <= subsequence.length; j++) {
                        if (array[j] == subsequence[i]) {


                        }

                    }
                }
                System.out.println("t");



            }
            catch (Exception e)
            {
                System.out.println(e);
            }
            return true;
            }


    }



    public static void main(String args[])
    {
        first1 f=new first1();

        f.first(new int[]{1,3,4,5,8,9,0}, new int[]{5,1,8,0,4});



    }
}
