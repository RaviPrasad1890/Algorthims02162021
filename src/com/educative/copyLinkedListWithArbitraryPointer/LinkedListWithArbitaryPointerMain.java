package com.educative.copyLinkedListWithArbitraryPointer;

public class LinkedListWithArbitaryPointerMain {
    public static void main(String[] args){
        LinkedListWithArbitaryPointer obj= new LinkedListWithArbitaryPointer();
        /*obj.insert(1,null);
        obj.insert(2,null);
        obj.insert(3,null);
        obj.insert(4,null);
        obj.insert(5,null);
        obj.insert(6,null);*/
        ArbitaryPointerNode node1= new ArbitaryPointerNode(1);
        ArbitaryPointerNode node2= new ArbitaryPointerNode(2);
        ArbitaryPointerNode node3= new ArbitaryPointerNode(3);
        ArbitaryPointerNode node4= new ArbitaryPointerNode(4);
        ArbitaryPointerNode node5= new ArbitaryPointerNode(5);
        obj.insert(node1,node3);
        obj.insert(node2,null);
        obj.insert(node3,node5);
        obj.insert(node4,null);
        obj.insert(node5,node1);
        obj.print();
        DeepCopyWithArbitaryPointer deepCopyWithArbitaryPointer=new DeepCopyWithArbitaryPointer();
        ArbitaryPointerNode head=deepCopyWithArbitaryPointer.deep_copy_arbitrary_pointer(obj.getHead());
        obj.print(head);

    }
}
