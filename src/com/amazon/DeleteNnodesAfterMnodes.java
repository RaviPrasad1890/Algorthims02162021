package com.amazon;

import java.util.LinkedList;

/*
Given a linked list and two integers M and N. Traverse the linked
list such that you retain M nodes then delete next N nodes, continue the same till end of the linked list.
Input:
M = 2, N = 2
Linked List: 1->2->3->4->5->6->7->8
Output:
Linked List: 1->2->5->6
 */
public class DeleteNnodesAfterMnodes {
    public LinkedList<Integer> modify(LinkedList<Integer> list, int m, int n){
        int countM=0;
        int countN=n;
        int length=list.size();
        LinkedList<Integer> res=new LinkedList<>();
        while(!list.isEmpty()){
            while(m>countM){
                res.add(list.removeFirst());
                countM++;
                continue;
            }
            while(countN>0){
                list.removeFirst();
                countN--;
                continue;
            }
            countM=0;
            countN=n;
        }
        return res;
    }
    public static void main(String[] args){
        DeleteNnodesAfterMnodes obj= new DeleteNnodesAfterMnodes();
        LinkedList<Integer> lst= new LinkedList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);
        lst.add(6);
        lst.add(7);
        lst.add(8);
        System.out.println(lst);
        System.out.println(obj.modify(lst,2,2));

    }
}
