class Data {
    int no;
    String name;
    static Data head;
    static Data tail;
    Data next;

    Data(int no, String name) {
        this.name = name;
        this.no = no;

    }

    public static class Linkedlists
    {

        public Data getData()
        {
            return  head;
        }
        public void insert(Data d) {
            if (head == null && tail == null) {
                head = d;
                tail = head;

            } else {
                tail.next = d;
                tail = tail.next;
            }

        }

    }



}

public class Linked {
    public static void main(String args[]) {
        Data.Linkedlists d = new Data.Linkedlists ();
        d.getData();
        Data current = d.getData();
        d.insert(new Data(1,"Hyena"));
      //  d.insert(new Data(2,"Eagle"));
      //  d.insert(new Data(3,"Leo"));

        System.out.println(current);

    }
}



