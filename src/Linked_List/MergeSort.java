package Linked_List;

import java.util.LinkedList;

public class MergeSort {
    public static class Node{
        int data;
        MergeSort.Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static MergeSort.Node head;
    public static MergeSort.Node tail;

    public void addFirst(int data){    //adding from first in linked list -- O(1)
        //step: 1 -- create newNode
        MergeSort.Node newNode=new MergeSort.Node(data);
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


    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private Node merge(Node lHead, Node rHead){
        Node mergeLinkedList=new Node(-1);
        Node temp=mergeLinkedList;
        while(lHead!=null && rHead!=null){
            if(lHead.data<=rHead.data){
                temp.next=lHead;
                lHead=lHead.next;
                temp=temp.next;
            }else{
                temp.next=rHead;
                rHead=rHead.next;
                temp=temp.next;
            }
        }
        while(lHead!=null){
            temp.next=lHead;
            lHead=lHead.next;
            temp=temp.next;
        }
        while(rHead!=null){
            temp.next=rHead;
            rHead=rHead.next;
            temp=temp.next;
        }
        return mergeLinkedList.next;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //left and right merge sort
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //merge
        return merge(newLeft,newRight);
    }
    public void printLinkedList(){  //O(n)
        if(head==null){
            System.out.println("Linked List is empty");
            return;
        }
        MergeSort.Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MergeSort linkedList=new MergeSort();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(4);
        linkedList.addFirst(5);
        linkedList.printLinkedList();
        linkedList.head=linkedList.mergeSort(linkedList.head);
        linkedList.printLinkedList();
    }
}
