package Recursion;

import java.util.Scanner;

public class RemoveDuplicateString {
    public static void removeDuplicateString(String str,int index,StringBuilder newStr,boolean arr[]){
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(index);
        if(arr[currChar-'a']==true){
            removeDuplicateString(str,index+1,newStr,arr);
        }else{
            arr[currChar-'a']=true;
            removeDuplicateString(str,index+1,newStr.append(currChar),arr);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        removeDuplicateString(str,0, new StringBuilder(""),new boolean[26]);
    }
}
