package Recursion;

import java.util.Scanner;

public class PrintNumber {
    public static void printDecreasingNumber(int n){
        if(n>0){
            System.out.print(n+" ");
            printDecreasingNumber(n-1);
        }
    }
    public static void printIncreasingNumber(int n){
        if(n>0){
            printIncreasingNumber(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printDecreasingNumber(n);
        System.out.println();
        printIncreasingNumber(n);
    }
}
