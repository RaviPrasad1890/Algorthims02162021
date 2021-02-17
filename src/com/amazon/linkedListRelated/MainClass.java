package com.amazon.linkedListRelated;

public class MainClass {
    public static void main(String[] args){
       SingleLinkedListImpl obj=new SingleLinkedListImpl();
       obj.createLinkedListImplWithNodeValue(1);
       obj.insertNewNodeAtLast(2);
       obj.insertNewNodeAtLast(3);
        obj.insertNewNodeAtLast(4);
        obj.insertNewNodeAtLast(5);
        obj.insertNewNodeAtLast(6);
        obj.insertNewNodeAtLast(7);
        obj.insertNewNodeAtLast(8);
        obj.printList();
    }
}
