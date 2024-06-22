package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class tree {
    public static void main(String[] args){
        Node rootNode = new Node("GrandFather");
        System.out.println(rootNode.leftChild);
        rootNode.leftChild =new Node("Father1");
        rootNode.rightChild.name = "Father2";
        rootNode.leftChild.leftChild.name = "Child1";
        rootNode.rightChild.leftChild.name = "child2";
        treeTraversalUsingRecursiom(rootNode);
    }
    public static void treeTraversalUsingRecursiom(Node rootNode){
        if (rootNode == null){
            return;
        }
        System.out.println(rootNode.name);
        treeTraversalUsingRecursiom(rootNode.leftChild);
        treeTraversalUsingRecursiom(rootNode.rightChild);
    }
}
