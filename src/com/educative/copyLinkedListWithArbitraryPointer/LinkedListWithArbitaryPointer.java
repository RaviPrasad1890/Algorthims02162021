package com.educative.copyLinkedListWithArbitraryPointer;

public class LinkedListWithArbitaryPointer {
    private ArbitaryPointerNode head;
    private ArbitaryPointerNode tail;


    public LinkedListWithArbitaryPointer() {
        this.head = null;
        this.tail = null;
    }

    public ArbitaryPointerNode getHead() {
        return head;
    }

    public void setHead(ArbitaryPointerNode head) {
        this.head = head;
    }

    public ArbitaryPointerNode getTail() {
        return tail;
    }

    public void setTail(ArbitaryPointerNode tail) {
        this.tail = tail;
    }

    public ArbitaryPointerNode insert(int data, ArbitaryPointerNode arbitaryPointer){
        ArbitaryPointerNode node= new ArbitaryPointerNode(data);
        if(head==null){
            head=tail=node;
            head.setArbitaryPointer(arbitaryPointer);
            head.setNext(null);
            tail.setNext(null);
        }else{
            tail.setNext(node);
            tail=node;
            tail.setArbitaryPointer(arbitaryPointer);
        }
        return head;
    }

    public ArbitaryPointerNode insert(ArbitaryPointerNode node, ArbitaryPointerNode arbitaryPointer){
        if(head==null){
            head=tail=node;
            head.setArbitaryPointer(arbitaryPointer);
            head.setNext(null);
            tail.setNext(null);
        }else{
            tail.setNext(node);
            tail=node;
            tail.setArbitaryPointer(arbitaryPointer);
        }
        return node;
    }

    public void print(){
        ArbitaryPointerNode node=head;
        while(node!=null){
            if(null!=node.getArbitaryPointer()) {
                System.out.println(node.getData() + " " + node.getArbitaryPointer().getData());
            }else{
                System.out.println(node.getData());
            }
            node=node.getNext();
        }
        System.out.println("----------------------------");
    }
    public void print(ArbitaryPointerNode head){
        ArbitaryPointerNode node=head;
        while(node!=null){
            if(null!=node.getArbitaryPointer()) {
                System.out.println(node.getData() + " " + node.getArbitaryPointer().getData());
            }else{
                System.out.println(node.getData());
            }
            node=node.getNext();
        }
        System.out.println("----------------------------");
    }
}
