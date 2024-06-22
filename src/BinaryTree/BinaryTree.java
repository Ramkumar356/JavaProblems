package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    public static void main(String[] args){
        Node rootNode = new Node("GrandFather");
        Node leftFather = new Node("Father1");
        Node rightFather = new Node("Father2");
        Node child1 = new Node("child1");
        Node child2 = new Node("child2");
        Node child3 = new Node("child3");
        Node child4 = new Node("child4");
        rootNode.leftChild = leftFather;
        rootNode.rightChild = rightFather;
        leftFather.leftChild = child1;
        leftFather.rightChild = child2;
        rightFather.leftChild = child3;
        rightFather.rightChild = child4;
//        System.out.println(leftFather.leftChild);
//        treeTraversalUsingRecursiom(rootNode);
//        postOrderTraversal(rootNode);
//        System.out.println("------------------------");
//        inOrederTraversal(rootNode);
//        System.out.println("------------------------");
//        postOrderTraversal(rootNode);
        treeTraversalUsingBFS(rootNode);
    }
    public static void treeTraversalUsingRecursiom(Node rootNode){
        if (rootNode == null){
            return;
        }
        System.out.println(rootNode.name);
        treeTraversalUsingRecursiom(rootNode.leftChild);
        treeTraversalUsingRecursiom(rootNode.rightChild);
    }
    public static void preOrderTraversal(Node rootNode){
        if (rootNode == null){
            return;
        }
        System.out.println(rootNode.name);
        preOrderTraversal(rootNode.leftChild);
        preOrderTraversal(rootNode.rightChild);
    }
    public static void inOrederTraversal(Node rootNode){
        if (rootNode == null){
            return;
        }
        inOrederTraversal(rootNode.leftChild);
        System.out.println(rootNode.name);
        inOrederTraversal(rootNode.rightChild);
    }
    public static void postOrderTraversal(Node rootNode){
        if (rootNode == null){
            return;
        }
        postOrderTraversal(rootNode.leftChild);
        postOrderTraversal(rootNode.rightChild);
        System.out.println(rootNode.name);
    }
    public static void treeTraversalUsingBFS(Node rootNode){
        Queue queue = new LinkedList();
        queue.add(rootNode);
        while(!queue.isEmpty()){
            Node currentTreeNode = (Node) queue.remove();
            System.out.println(currentTreeNode.name);
            if (currentTreeNode.leftChild != null) {
                queue.add(currentTreeNode.leftChild);
            }
            if(currentTreeNode.rightChild != null) {
                queue.add(currentTreeNode.rightChild);
            }
        }
    }
}

//                grandfather    grandfather is a rootnode
//         father1           father2
//    child1   child2    child3    child4
// linking father1 and father2 in grandfather node
// linking child1 and child2 in leftfather1 node
// linking child3 and child4 in rightfather2 node