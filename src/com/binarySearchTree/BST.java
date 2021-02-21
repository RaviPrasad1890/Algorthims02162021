package com.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BST {
    BinaryNode root;

    //Create blank BST
    public BST() {
        this.root = null;
    }

    public boolean searchBST(BinaryNode root,int data){
        if(root==null){
            return false;
        }
        if(root.getData()==data){
            return true;
        }
        else if(data<root.getData()){
            searchBST(root.left,data);
        }
        else{
            searchBST(root.right,data);
        }
        return false;
    }

    //pre Order
    public void preOrder(BinaryNode root){
        System.out.println(root.getData());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    //in Order
    public void inOrder(BinaryNode root){
        preOrder(root.getLeft());
        System.out.println(root.getData());
        preOrder(root.getRight());
    }

    //post Order
    public void postOrder(BinaryNode root){
        preOrder(root.getLeft());
        preOrder(root.getRight());
        System.out.println(root.getData());
    }

    //level order
    public void levelOrder(BinaryNode root){
        if(root==null){
            return;
        }
        Queue<BinaryNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            BinaryNode curr=queue.poll();
            System.out.println(curr.getData());
            if(curr.getLeft()!=null){
                queue.offer(curr.getLeft());
            }
            if(curr.getRight()!=null){
                queue.offer(curr.getRight());
            }
        }
    }

    public BinaryNode insert(int data){
        BinaryNode newNode= new BinaryNode(data);
        if(root==null) {
            root = newNode;
        }
        BinaryNode tempRoot= root;
        insertUtility(tempRoot,newNode);
        return root;
    }

    public void insertUtility(BinaryNode root,BinaryNode newNode){
        if(root==null) {
            root = newNode;
        }else if(root.getData()> newNode.getData()){
            insertUtility(root.getLeft(),newNode);
        }else{
            insertUtility(root.getRight(),newNode);
        }
    }
}
