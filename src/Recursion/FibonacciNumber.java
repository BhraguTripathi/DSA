package Recursion;

import java.util.Scanner;

public class FibonacciNumber {
    public static int fibonacciNumber(int n){
        if(n==0){
            return 0;
        } else if(n==1){
            return 1;
        }
        int fib=fibonacciNumber(n-1)+fibonacciNumber(n-2);
        return fib;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacciNumber(n));
    }
}
