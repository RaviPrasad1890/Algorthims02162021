package com.BinaryTree;

public class BinaryTreeMaxDepth {

    BinaryNode root;
    public int maxDepth(BinaryNode node){
        if(node==null){
            return -1;
        }else{
            int lDepth=maxDepth(node.getLeft());
            int rDepth=maxDepth(node.getRight());
            if(lDepth>rDepth){
                return lDepth+1;
            }else{
                return rDepth+1;
            }

        }

    }

    public static void main(String[] args)
    {
        BinaryTreeMaxDepth tree = new BinaryTreeMaxDepth();

        tree.root = new BinaryNode(1);
        tree.root.setLeft(new BinaryNode(2));
        tree.root.setRight(new BinaryNode(3));
        tree.root.getLeft().setLeft(new BinaryNode(4));
        tree.root.getLeft().setRight(new BinaryNode(6));

        System.out.println("Height of tree is : " +
                tree.maxDepth(tree.root));
    }
}
