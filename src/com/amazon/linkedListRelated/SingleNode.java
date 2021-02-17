package com.amazon.linkedListRelated;

public class SingleNode {
    private SingleNode next;
    private int data;

    public SingleNode(int data) {
        this.data = data;
        this.next=null;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
