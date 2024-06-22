package BinaryTree;
import java.util.*;

public class BinaryTreeLength {
    public static void main(String[] args){
//        Node1 rootNode1 = new Node1(5);
//        Node1 leftChild1 = new Node1(4);
//        Node1 rightChild2 = new Node1(3);
//        Node1 leftChild3 = new Node1(6);
//        Node1 leftChild4 = new Node1(3);
//        Node1 leftChild5 = new Node1(9);
//        Node1 leftChild6 = new Node1(7);
//        Node1 leftChild7 = new Node1(7);
//        rootNode1.leftChild = leftChild1;
//        rootNode1.rightChild = rightChild2;
//        leftChild1.leftChild = leftChild3;
//        leftChild3.leftChild = leftChild4;
//        leftChild4.leftChild = leftChild5;
//        rightChild2.rightChild = leftChild6;
//        leftChild5.rightChild = leftChild7;
        Node rootNode = new Node("Grand Father");
        rootNode.leftChild = new Node("Father1");
        rootNode.rightChild = new Node("Father2");
        rootNode.leftChild.leftChild = new Node("child1");
        rootNode.rightChild.rightChild = new Node("child2");
        rootNode.leftChild.leftChild.leftChild = new Node("child3");
        rootNode.leftChild.leftChild.leftChild.leftChild = new Node("child4");
        rootNode.leftChild.leftChild.leftChild.leftChild.rightChild = new Node("child5");
        int output = findBinaryTreeHeight(rootNode);
        System.out.println("Binary Tree Height" + " " +output);
        int output1 = binaryTreeHeightUsingBFS(rootNode);
        System.out.println("Binary Tree Width" + " " +output1);
        int output2 = findingBinaryTreeWidthBFS(rootNode);
        System.out.println(output2);
    }
    public static int findBinaryTreeHeight(Node rootNode) {
        int leftChildDistance = leftChildHeight(rootNode, 0);
        int rightChildDistance = rightChildHeight(rootNode,0);
        return leftChildDistance + rightChildDistance;
    }
    public static int leftChildHeight(Node rootNode, int height){
        if (rootNode == null){
            return height;
        }
        height++;
       return leftChildHeight(rootNode.leftChild, height);

    }
    public static int rightChildHeight(Node rootNode, int height){
        if (rootNode == null){
            return height;
        }
        height++;
        return rightChildHeight(rootNode.rightChild,height);
    }
    public static int binaryTreeHeightUsingBFS(Node rootNode){
        Queue queue = new LinkedList();
        Queue heightDistance = new LinkedList();
        heightDistance.add(0);
        int distance = 0;
        queue.add(rootNode);
        while (!queue.isEmpty()){
            Node currentNode = (Node) queue.remove();
            int currentDistance = (int) heightDistance.remove();
            if (currentNode.leftChild != null){
                queue.add(currentNode.leftChild);
                heightDistance.add(currentDistance+1);
            }
            if (currentNode.rightChild != null){
                queue.add(currentNode.rightChild);
                heightDistance.add(currentDistance+1);
            }
            distance = currentDistance;
        }
        return distance;
    }

    public static int findingBinaryTreeWidthBFS(Node rootNode){
        Queue queue = new LinkedList();
        Queue heightDistance = new LinkedList();
        heightDistance.add(0);
        int distance = 0;
        queue.add(rootNode);
        while (!queue.isEmpty()){
            Node currentNode = (Node) queue.remove();
            Node leftCurrentNode = currentNode.leftChild;
            Node rightCurrentNode = currentNode.rightChild;
            while (leftCurrentNode != null){
                leftCurrentNode = leftCurrentNode.leftChild;
                distance++;
            }
            while (rightCurrentNode != null){
                rightCurrentNode = rightCurrentNode.rightChild;
                distance++;
            }
        }
        return distance;
    }
}

class Position{
    Node node;
    int distance;
    Position(Node node,int distance){
        this.distance = distance;
        this.node = node;
    }
}

// input =  5
//       4     5
//    3    4      6
//  5     6     7
//          8
// output = 4
// queue = 5 4 5 3 4

//