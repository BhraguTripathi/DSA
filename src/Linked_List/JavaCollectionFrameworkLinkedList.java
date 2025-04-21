package Linked_List;

import java.util.LinkedList;

public class JavaCollectionFrameworkLinkedList {
    public static void main(String[] args) {
        //create
        LinkedList<Integer> linkedList=new LinkedList<>();
        //add
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addFirst(0);
        System.out.println(linkedList);
        //remove
        linkedList.removeLast();
        linkedList.removeFirst();
        System.out.println(linkedList);
    }
}
