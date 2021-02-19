package com.amazon.linkedListRelated;
/*
Given two sorted linked list, merge them into one sorted list
 */
public class MergeLinkedList {
    public void mergeList(SingleLinkedListImpl list1,SingleLinkedListImpl list2){
        SingleNode node1=list1.getHead();
        SingleNode node2=list2.getHead();
        //A dummy Node to hang the result/create pointer to result
        SingleNode dummyNode=new SingleNode(0);
        //Point  tail to dummynode and than make connection further
        SingleNode tail=dummyNode;

        while(true){
            if(node1==null){
                tail.setNext(node2);
                break;
            }
            if(node2==null){
                tail.setNext(node1);
                break;
            }
            if(node1.getData()>node2.getData()){
                tail.setNext(node2);
                tail=node2;
                node2= node2.getNext();
            }else{
                tail.setNext(node1);
                tail=node1;
                node1=node1.getNext();
            }
        }
        SingleLinkedListImpl obj= new SingleLinkedListImpl();
        obj.printList(dummyNode.getNext());
    }

    public static void main(String[] args){
        SingleLinkedListImpl list1=new SingleLinkedListImpl();
        SingleLinkedListImpl list2=new SingleLinkedListImpl();
        list1.insertNewNodeAtLast(2);
        list1.insertNewNodeAtLast(4);
        list1.insertNewNodeAtLast(6);
        list1.insertNewNodeAtLast(9);
        list2.insertNewNodeAtLast(1);
        list2.insertNewNodeAtLast(5);
        list2.insertNewNodeAtLast(7);
        list1.printList();
        list2.printList();
        MergeLinkedList mergeLinkedList=new MergeLinkedList();
        mergeLinkedList.mergeList(list1,list2);
    }
}
