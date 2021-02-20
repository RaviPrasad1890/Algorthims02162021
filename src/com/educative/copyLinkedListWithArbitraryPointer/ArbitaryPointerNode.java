package com.educative.copyLinkedListWithArbitraryPointer;

public class ArbitaryPointerNode {
    private int data;
    private ArbitaryPointerNode next;
    private ArbitaryPointerNode arbitaryPointer;

    public ArbitaryPointerNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ArbitaryPointerNode getNext() {
        return next;
    }

    public void setNext(ArbitaryPointerNode next) {
        this.next = next;
    }

    public ArbitaryPointerNode getArbitaryPointer() {
        return arbitaryPointer;
    }

    public void setArbitaryPointer(ArbitaryPointerNode arbitaryPointer) {
        this.arbitaryPointer = arbitaryPointer;
    }


}
