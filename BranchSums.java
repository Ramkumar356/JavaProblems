package BinaryTree;

import java.util.*;

public class BranchSums {
    public static void main(String[] args){
        Node1 rootNode = new Node1(5);
        rootNode.leftChild = new Node1(12);
        rootNode.rightChild = new Node1(10);
        rootNode.leftChild.rightChild = new Node1(2);
        rootNode.rightChild.leftChild = new Node1(20);
        rootNode.leftChild.leftChild = new Node1(32);
        rootNode.rightChild.rightChild = new Node1(4);
        rootNode.leftChild.leftChild.rightChild = new Node1(7);


//        List branchSums = new ArrayList();
//        binaryTreeHeight(rootNode,0);
//        binaryTreeDistanceSum(rootNode,0);
//        traverseNodeInColumn(rootNode);
        System.out.println(addingNodeInListOfList(rootNode));
    }
    public static void binaryTreeHeight(Node1 node,int height) {
        if (node == null) {
            return;
        }else{
            height++;
        }
        binaryTreeHeight(node.leftChild, height);
        binaryTreeHeight(node.rightChild, height);
        System.out.println(height);
    }
    public static void binaryTreeDistanceSum(Node1 node,int height){
     Queue queue = new LinkedList();
     queue.add(node);
     while(!queue.isEmpty()){
         Node1 currentNode = (Node1) queue.remove();
         if (currentNode.leftChild != null){
             queue.add(currentNode.leftChild);
         }
         if (currentNode.rightChild != null){
             queue.add(currentNode.rightChild);
         }
         height++;
     }
     System.out.println(height);
    }

    public static List traverseNodeInColumn(Node1 rootNode){
        ArrayList<List> outputList = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap();
        Queue queue = new LinkedList();
        Set set = new HashSet();
        int nodeAddress = 0;
        int arrayListIndex = 0;
        map.put(nodeAddress,arrayListIndex);
        outputList.add(arrayListIndex,new ArrayList<>());
        outputList.get(arrayListIndex).add(rootNode.num);
        queue.add(new NodePosition(rootNode,nodeAddress));
        while(!queue.isEmpty()){
            NodePosition currentNode = (NodePosition) queue.remove();
            if (currentNode.node.leftChild  != null){
                queue.add(new NodePosition(currentNode.node.leftChild, currentNode.nodeName-1));
                if(set.add(currentNode.nodeName-1)){
                    arrayListIndex++;
                  outputList.add(arrayListIndex,new ArrayList());
                  outputList.get(arrayListIndex).add(currentNode.node.leftChild.num);
                  map.put(currentNode.nodeName-1,arrayListIndex);
                }else{
                    outputList.get(map.get(currentNode.nodeName-1)).add(currentNode.node.leftChild.num);
                }
            }
            if (currentNode.node.rightChild  != null){
                queue.add(new NodePosition(currentNode.node.rightChild, currentNode.nodeName+1));
                if(set.add(currentNode.nodeName+1)){
                    arrayListIndex++;
                    outputList.add(arrayListIndex,new ArrayList());
                    outputList.get(arrayListIndex).add(currentNode.node.num);
                    map.put(currentNode.nodeName+1,arrayListIndex);
                }else{
                   outputList.get(map.get(currentNode.nodeName+1)).add(currentNode.node.rightChild.num);
                }
            }
        }
        return outputList;
    }
    public static List addingNodeInListOfList(Node1 rootNode){
        ArrayList<List> outputList = new ArrayList();
        HashMap<Integer,Integer> map = new HashMap();
        Queue queue = new LinkedList();
        Set set = new HashSet();
        int nodeName = 0;
        int arrayListIndex = 0;
        queue.add(new NodePosition(rootNode,nodeName));
        while(!queue.isEmpty()){
            NodePosition currentNode = (NodePosition) queue.remove();
            if (currentNode.node.leftChild  != null){
                queue.add(new NodePosition(currentNode.node.leftChild, currentNode.nodeName-1));
            }
            if (currentNode.node.rightChild  != null){
                queue.add(new NodePosition(currentNode.node.rightChild, currentNode.nodeName+1));

            }
            if(set.add(currentNode.nodeName)){
                outputList.add(arrayListIndex,new ArrayList());
                outputList.get(arrayListIndex).add(currentNode.node.num);
                map.put(currentNode.nodeName,arrayListIndex);
                arrayListIndex++;
            }else{
                outputList.get(map.get(currentNode.nodeName)).add(currentNode.node.num);
            }
        }
        return outputList;
    }
}

class NodePosition{
    Node1 node;
    int nodeName;
    NodePosition(Node1 node,int nodeName){
        this.nodeName = nodeName;
        this.node = node;
    }
}
//         5
//    12       10
//  7    18  6       10
// 15           13
// 1
//   1

//  height = 6