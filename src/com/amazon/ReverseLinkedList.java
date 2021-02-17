package com.amazon;
/*
Given a linked list, write a function to reverse every k nodes (where k is an input to the function).

Examples:

Inputs:  1->2->3->4->5->6->7->8->NULL and k = 3
Output:  3->2->1->6->5->4->8->7->NULL.

Inputs:   1->2->3->4->5->6->7->8->NULL and k = 5
Output:  5->4->3->2->1->8->7->6->NULL.
 */

import java.util.LinkedList;
import java.util.Stack;

public class ReverseLinkedList {
    private static LinkedList<Integer> reverse(LinkedList<Integer> list,int k){
        Stack<Integer> stack= new Stack<>();
        LinkedList<Integer> listRes=new LinkedList<>();
        while(!list.isEmpty()){
            int count=0;
            while(!list.isEmpty()&&k>count){
                stack.push(list.removeFirst());
                count++;
             }
            while(!stack.isEmpty()) {
                listRes.add(stack.pop());
            }
        }
        return listRes;
    }

    public static void main(String[] args){
        LinkedList<Integer> list= new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        System.out.println(list);
        System.out.println(reverse(list,3));
    }
}
