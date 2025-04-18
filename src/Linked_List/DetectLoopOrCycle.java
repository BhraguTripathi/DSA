package Linked_List;

import java.util.Objects;

public class DetectLoopOrCycle {
        public static class Node{
            int data;
            Linked_List.DetectLoopOrCycle.Node next;
            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Linked_List.DetectLoopOrCycle.Node head;

        public static boolean isCycle(){  //Floyd's Cycle Finding Algorithm
            Node slow=head;
            Node fast=head;
            while(fast!=null || fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }

        public static void removeLoopCycle(){
            Node slow=head;
            Node fast=head;
            boolean cycle=false;
            while(fast!=null || fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    cycle=true;
                    break;
                }
            }
            if(cycle==false){
                return;
            }
            slow=head;
            Node prev=null;
            while(slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;
            }
            prev.next=null;
        }

        public void printLinkedList(){  //O(n)
            if(head==null){
                System.out.println("Linked List is empty");
                return;
            }
            Linked_List.DetectLoopOrCycle.Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp=temp.next;
            }
            System.out.println("null");
        }

        public static void main(String[] args) {
            DetectLoopOrCycle detectLoopOrCycle=new DetectLoopOrCycle();
            head=new Node(1);
            Node temp=new Node(2);
            head.next=temp;
            head.next.next=new Node(3);
            head.next.next.next=temp;
            //detectLoopOrCycle.printLinkedList();
            System.out.println(isCycle());
            detectLoopOrCycle.removeLoopCycle();
            //System.out.println(isCycle());
        }
}
