import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Listdemo {
    public static void main(String args[])
    {
        LinkedList<java.lang.Integer> a1=new LinkedList<>();
        ProcessHandle list;
        LinkedList<java.lang.Integer> a2=new LinkedList<>(List.of(5,8,9,8,7));

        a1.add(10);
        a1.add(1,5);
        a1.addAll(2,a2);
        a1.set(3,67);
        a1.addFirst(3);
        a1.addLast(999);
        a1.peekFirst();
        for (int i=0;i<a1.size();i++) {
            System.out.println(a1.get(i));
        }
    }
}
