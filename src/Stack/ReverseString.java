package Stack;

import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> stack=new Stack<>();
        int index=0;
        while(index<str.length()){
            stack.push(str.charAt(index));
            index++;
        }
        StringBuilder result=new StringBuilder("");
        while(!stack.isEmpty()){
            char current=stack.pop();
            result.append(current);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String str="abc";
        String result=reverseString(str);
        System.out.println(result);
    }
}
