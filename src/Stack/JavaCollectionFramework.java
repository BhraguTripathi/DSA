package Stack;

import java.util.Stack;

public class JavaCollectionFramework {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        while(!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
