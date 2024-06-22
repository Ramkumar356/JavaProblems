/*class Node
{
    public Node next;
    int value;
    Node left;
    Node right;
    Node root;

    Node (int value)
    {
        this.value = value;
        right = null;
        left = null;
    }

    /* public Node insertTree(Node current,int value)
    {
        if(current == null)
        {
            return new Node(5);

        }
        if (value < current.value) {


            current.left = insertTree(current.left, value);
        }

        else {
            current.right = insertTree(current.right,value);


        }
        return current;

    }
    public void add(int value)
    {
        root = insertTree(root, value);
    } */






public class tree {
    public static void main(String args[])
    {
        Node n=new Node(5);
        n.left = new Node(3);
        n.right = new Node(7);
        n.left.left = new Node(2);
        n.right.right = new Node(56);
        /*  n.add(5);
        n.add(7);
        n.add(10);
        n.add(15); */





    }


}
