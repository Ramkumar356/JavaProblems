package binarySearchProblems;

import java.util.*;

class BinaryT {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(5);
        bst.insert(6);
        bst.insert(3);
        bst.insert(2);
        bst.insert(1);
        bst.insert(40);
        bst.insert(7);
        bst.insert(4);

        bfs(bst.root);
        dfs(bst.root);
    }

    public static void dfs(Node currentNode){
        if(currentNode == null){
            return;
        }
        System.out.print(currentNode.data + " ");
        dfs(currentNode.left);
        dfs(currentNode.right);
    }

    public static void bfs(Node rootNode){
        LinkedList<Node> queue = new LinkedList();
        queue.add(rootNode);
        while(!queue.isEmpty()){
            Node currentNode = queue.remove();
            System.out.print( currentNode.data + " ");
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }

    }


    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    public static class BST{
        public Node root;

        public void insert(int data){ // data = 5
            if(root == null){
                root = new Node(data);
            }else{
                insert(root,data);
            }
        }

        public void insert(Node currentNode, int data){
            if(data < currentNode.data && currentNode.left == null){
                currentNode.left = new Node(data);
                return;
            }
            if(data > currentNode.data && currentNode.right == null){
                currentNode.right = new Node(data);
                return;
            }

            if(data < currentNode.data){
                insert(currentNode.left, data);
            }else{
                insert(currentNode.right, data);
            }
        }


    }
}