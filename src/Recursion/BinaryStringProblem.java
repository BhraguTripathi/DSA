package Recursion;

import java.util.Scanner;

public class BinaryStringProblem {
    public static void binaryString(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        binaryString(n-1,0,str+"0");
        if(lastPlace==0){
            binaryString(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        binaryString(n,0,"");
    }
}
