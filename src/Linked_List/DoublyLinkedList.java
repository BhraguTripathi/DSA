package Linked_List;

public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("Doubly Linked List is empty.");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int value=head.data;
            head=tail=null;
            size--;
            return value;
        }
        int value= head.data;
        head=head.next;
        head.prev=null;
        size--;
        return value;
    }
    public void reverse(){
        Node current=head;
        Node prev =null;
        Node next;
        while(current!=null){
            next=current.next;
            current.next= prev;
            current.prev=next;

            prev=current;
            current=next;
        }
        head=prev;
    }

    public void printDoublyLinkedList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();
        doublyLinkedList.addFirst(5);
        doublyLinkedList.addFirst(4);
        doublyLinkedList.addFirst(3);
        doublyLinkedList.addFirst(2);
        doublyLinkedList.addFirst(1);
        doublyLinkedList.printDoublyLinkedList();
        //System.out.println(size);
        //System.out.println(doublyLinkedList.removeFirst());
        //doublyLinkedList.printDoublyLinkedList();
        //System.out.println(size);
        doublyLinkedList.reverse();
        doublyLinkedList.printDoublyLinkedList();
    }
}
