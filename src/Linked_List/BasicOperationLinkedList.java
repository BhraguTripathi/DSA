package Linked_List;

public class BasicOperationLinkedList {
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

    public int removeFirst(){    //remove the head of linked list
        if(size==0){
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int value=head.data;
            head=tail=null;
            size--;
            return value;
        }
        int value=head.data;
        head=head.next;
        size--;
        return value;
    }

    public int removeLast(){    //remove the last element of linked list
        if(size==0){
            System.out.println("Linked List is empty");
        }else if(size==1){
            int value=head.data;
            head=tail=null;
            size--;
            return value;
        }

        //prev=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int value=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return value;
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

    public int helperRecursiveSearch(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index=helperRecursiveSearch(head.next,key);
        if(index==-1){
            return -1;
        }
        return index+1;
    }

    public int recursiveSearch(int key){
        return helperRecursiveSearch(head,key);
    }

    public int iterativeSearch(int key){   //this is iterative way to search in linked list -- O(n)
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public void reverseLinkedList(){  //reverse of linked list -- O(n)
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        BasicOperationLinkedList linkedList=new BasicOperationLinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addLast(4);
        linkedList.addLast(5);
        linkedList.addAtIndex(9,2);
        linkedList.printLinkedList();
//        System.out.println(linkedList.size);
//        linkedList.removeFirst();
//        linkedList.printLinkedList();
//        linkedList.removeLast();
//        linkedList.printLinkedList();
//        System.out.println(linkedList.iterativeSearch(5));
//        System.out.println(linkedList.recursiveSearch(4));
        linkedList.reverseLinkedList();
        linkedList.printLinkedList();
    }
}
