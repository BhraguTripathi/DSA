package Linked_List;

public class AddingLinkedList {
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
    public static int size;

    public void addFirst(int data){    //adding from first in linked list -- O(1)
        //step: 1 -- create newNode
        Node newNode=new Node(data);
        size++;
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

    public void addLast(int data){     //adding from last in linked list -- O(1)
        //step: 1 -- create new node
        Node newNode=new Node(data);
        size++;
        //if linked list is empty
        if(tail==null){
            tail=head=newNode;
            return;
        }
        //step: 2 -- tail next=newNode
        tail.next=newNode;
        //step: 3 -- tail=newNode
        tail=newNode;
    }

    public void addAtIndex(int data,int index){  // adding in given index of linked list -- O(n)
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
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
        AddingLinkedList linkedList=new AddingLinkedList();
        linkedList.printLinkedList();
        linkedList.addFirst(1);
        linkedList.printLinkedList();
        linkedList.addFirst(2);
        linkedList.printLinkedList();
        linkedList.addLast(4);
        linkedList.printLinkedList();
        linkedList.addLast(5);
        linkedList.printLinkedList();
        linkedList.addAtIndex(9,2);
        linkedList.printLinkedList();
        System.out.println(linkedList.size);
    }
}
