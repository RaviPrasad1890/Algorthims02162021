package com.educative.copyLinkedListWithArbitraryPointer;

import java.util.Hashtable;

/*
You are given a linked list where the node has two pointers.
The first is the regular next pointer.
The second pointer is called arbitrary_pointer and it can point to any node in the linked list.
Your job is to write code to make a deep copy of the given linked list.
Here, deep copy means that any operations on the original list should not affect the copied list.
 */
public class DeepCopyWithArbitaryPointer {

    public ArbitaryPointerNode  deep_copy_arbitrary_pointer(ArbitaryPointerNode head) {
        if(head==null){
            return null;
        }
        ArbitaryPointerNode current = head;
        ArbitaryPointerNode new_head = null;
        ArbitaryPointerNode new_prev = null;
        Hashtable<ArbitaryPointerNode, ArbitaryPointerNode> map =
                new Hashtable<>();
        // create copy of the linked list, recording the corresponding
        // nodes in hashmap without updating arbitrary pointer
        while(current!=null){
            ArbitaryPointerNode new_node= new ArbitaryPointerNode(current.getData());

            // copy the old arbitrary pointer in the new node
            new_node.setArbitaryPointer(current.getArbitaryPointer());

            if (new_prev != null) {
                new_prev.setNext(new_node);
            }
            else {
                new_head = new_node;
            }

            map.put(current,new_node);

            new_prev = new_node;
            current = current.getNext();
        }
        ArbitaryPointerNode new_current = new_head;
        // updating arbitrary_pointer
        while (new_current != null) {
            if (new_current.getArbitaryPointer() != null) {
                ArbitaryPointerNode node =
                        map.get(new_current.getArbitaryPointer());

                new_current.setArbitaryPointer(node);
            }

            new_current = new_current.getNext();
        }

        return new_head;

    }

}
