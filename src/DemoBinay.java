class Node {

    int data;
    Node left;
    Node right;


    public Node(int data) {
        this.data = data;

    }
}

    class Bin {
    Node root;


    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            insert(root, data);
        }
    }

    public void insert(Node currentNode, int data) {
        if (data < currentNode.data && currentNode.left == null) {
            currentNode.left = new Node(data);
            return;
        }
        if (data > currentNode.data && currentNode.right == null) {
            currentNode.right = new Node(data);
            return;
        }
        if (data < currentNode.data) {
            insert(currentNode.left, data);
        } else {
            insert(currentNode.right, data);
        }

    }
    public void Dfs(Node currentNode)
    {
        if (currentNode == null)
        {
            return;
        }
        System.out.println(currentNode.data);
        Dfs(currentNode.left);
        Dfs(currentNode.right);
    }
}

class DemoBinay {
     public static void main(String args[]) {
         Bin b = new Bin();
         b.insert(55);
         b.insert(7);
         b.insert(34);
         b.insert(8);
         b.insert(90);
         b.insert(8);
         b.insert(2);
         b.insert(1);
         b.Dfs(b.root);


     }
 }





