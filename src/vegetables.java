

public class vegetables {
    static class red
    {
        public String redVegetables()
        {
            return "carrot";
        }
    }

    static class green extends red
    {
        public String red()
        {
            return "drumsticks";

        }
    }

    public static void main(String[] args)
    {
        green G=new green();
        G.red();
        red r=new red();
        r.redVegetables();

    }
}
