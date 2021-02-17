package com.amazon.linkedListRelated;

public class SingleLinkedListImpl {
    private SingleNode head;

    public SingleNode createLinkedListImplWithNodeValue(int data) {
        SingleNode singleNode =new SingleNode(data);
        head= singleNode;
        return head;
    }

    public SingleNode insertNewNodeAtLast(int data){
        if(head==null){
            return createLinkedListImplWithNodeValue(data);

        }
        SingleNode node= new SingleNode(data);
        SingleNode currNode=head;
        while(currNode.getNext()!=null){
            currNode=currNode.getNext();
        }
        currNode.setNext(node);
        return head;
    }

    public void printList(){
        SingleNode currNode=head;
        while(currNode.getNext()!=null){
            System.out.print(currNode.getData());
            System.out.print(" ");
            currNode=currNode.getNext();
        }
        System.out.println();
    }
}
