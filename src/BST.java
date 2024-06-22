class Person {

    Person next;

    int id;
    String name;
    int mobnNo;

    Person(int id, String name, int mobno) {
        this.id = id;
        this.name = name;
        mobnNo = mobno;

    }

    public void display() {



            if (true) {
                System.out.println(id);
                System.out.println(name);
                System.out.println(mobnNo);


            }


    }

}
public class BST {
    public static void main(String args[])
    {
        Person t = new Person(01,"Gobi",4545554);
        Person t1 = new Person(02,"Gokul",4545434);
        Person t2 = new Person(03,"Dhaksith",545455);
        Person t3 = new Person(04,"vijay",45454355);
        Person t4 = new Person(05,"leo",34654656);
       // int next;
        try
        {
            Person head = t;
            Person tail = t3;
            t.next = t1;
            t1.next = t4;
            t4.next = t2;
            t2.next = t3;

          //  t = null;
          //  t4.next=null;

            t.display();
            t.next.display();
            t.next.next.display();
            t.next.next.next.display();
            t.next.next.next.next.display();
            head.display();
            tail.display();


        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
