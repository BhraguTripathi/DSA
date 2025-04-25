package Stack;

import java.util.ArrayList;

public class StackArrayList {
    static class Stack{
        static ArrayList<Integer> arrayList=new ArrayList<>();
        public static boolean isEmpty(){
            return arrayList.size()==0;
        }
        //push -- O(1)
        public static void push(int data){
            arrayList.add(data);
        }
        //pop -- O(1)
        public static int pop(){
            int top =arrayList.get(arrayList.size()-1);
            arrayList.remove(arrayList.size()-1);
            return top;
        }
        //peek -- O(1)
        public static int peek(){
            int top =arrayList.get(arrayList.size()-1);
            return top;
        }
    }
    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
