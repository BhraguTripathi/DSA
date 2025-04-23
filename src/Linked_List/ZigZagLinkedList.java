package Linked_List;

public class ZigZagLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){    //adding from first in linked list -- O(1)
        //step: 1 -- create newNode
        Node newNode=new Node(data);
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

    public void zigZag(){
        //finding middle(last element of first half of Linked List)
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //reversing 2nd half of Linked List
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node leftHead=head;
        Node rightHead=prev;

        //Alternate Zig-Zag Merge
        Node nextLeft,nextRight;
        while(leftHead!=null && rightHead!=null){
            nextLeft=leftHead.next;
            leftHead.next=rightHead;
            nextRight=rightHead.next;
            rightHead.next=nextLeft;

            //update of variable
            leftHead=nextLeft;
            rightHead=nextRight;
        }
    }

    public void printLinkedList(){  //O(n)
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ZigZagLinkedList zigzag=new ZigZagLinkedList();
        zigzag.addFirst(5);
        zigzag.addFirst(4);
        zigzag.addFirst(3);
        zigzag.addFirst(2);
        zigzag.addFirst(1);
        zigzag.printLinkedList();
        zigzag.zigZag();
        zigzag.printLinkedList();
    }
}
