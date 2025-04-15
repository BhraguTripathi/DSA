package Linked_List;

public class CheckPalindrome {
    public static class Node{
        int data;
        CheckPalindrome.Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static CheckPalindrome.Node head;
    public static CheckPalindrome.Node tail;

    public void addFirst(int data){    //adding from first in linked list -- O(1)
        //step: 1 -- create newNode
        CheckPalindrome.Node newNode=new CheckPalindrome.Node(data);
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

    public Node findMid(Node head){   //slow-fast concept
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;   //slow is the midNode of the Linked List
    }

    public boolean checkPalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode=findMid(head);
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right=prev;
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public void printLinkedList(){  //O(n)
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        CheckPalindrome.Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CheckPalindrome checkPalindrome=new CheckPalindrome();
        checkPalindrome.addFirst(1);
        checkPalindrome.addFirst(2);
        checkPalindrome.addFirst(2);
        checkPalindrome.addFirst(1);
        checkPalindrome.printLinkedList();
        System.out.println(checkPalindrome.checkPalindrome());
    }
}
