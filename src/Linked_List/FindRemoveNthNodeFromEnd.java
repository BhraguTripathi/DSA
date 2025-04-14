package Linked_List;

public class FindRemoveNthNodeFromEnd {
    public static class Node{
        int data;
        FindRemoveNthNodeFromEnd.Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static FindRemoveNthNodeFromEnd.Node head;
    public static FindRemoveNthNodeFromEnd.Node tail;

    public void addFirst(int data){    //adding from first in linked list -- O(1)
        //step: 1 -- create newNode
        FindRemoveNthNodeFromEnd.Node newNode=new FindRemoveNthNodeFromEnd.Node(data);
        //if linked list is empty
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step: 2 -- newNode next=head
        newNode.next=head;
        //step: 3 -- head=newNode
        head=newNode;
    }

    public void removeNthNodeFromEnd(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }

        if(size==n){
            head=head.next;
            return;
        }

        int i=1;
        int indexToFind=size-n;
        Node prev=head;
        while(i<indexToFind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public void printLinkedList(){  //O(n)
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        FindRemoveNthNodeFromEnd.Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        FindRemoveNthNodeFromEnd removeNthNode=new FindRemoveNthNodeFromEnd();
        removeNthNode.addFirst(1);
        removeNthNode.addFirst(2);
        removeNthNode.addFirst(3);
        removeNthNode.addFirst(4);
        removeNthNode.addFirst(5);
        removeNthNode.printLinkedList();
        removeNthNode.removeNthNodeFromEnd(3);
        removeNthNode.printLinkedList();
    }
}
