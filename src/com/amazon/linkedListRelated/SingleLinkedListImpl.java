package com.amazon.linkedListRelated;

public class SingleLinkedListImpl {
    private SingleNode head;
    private SingleNode tail;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public SingleNode createLinkedListImplWithNodeValue(int data) {
        SingleNode singleNode =new SingleNode(data);
        head= singleNode;
        tail=singleNode;
        return head;
    }

    public SingleNode insertNewNodeAtLast(int data){
        if(head==null){
            return createLinkedListImplWithNodeValue(data);

        }
        SingleNode node= new SingleNode(data);
        tail.setNext(node);
        tail=node;
        return head;
    }

    public void printList(){
        SingleNode currNode=head;
        while(currNode!=null){
            System.out.print(currNode.getData());
            System.out.print(" ");
            currNode=currNode.getNext();
        }
        System.out.println();
    }

    public void printList(SingleNode currhead){
        SingleNode currNode=currhead;
        while(currNode!=null){
            System.out.print(currNode.getData());
            System.out.print(" ");
            currNode=currNode.getNext();
        }
        System.out.println();
    }
}
