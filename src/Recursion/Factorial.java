package Recursion;

import java.util.Scanner;

public class Factorial {
    public static int printFactorial(int n){
        int fact=1;
        if(n>=1){
            fact=n*(printFactorial(n-1));
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(printFactorial(n));
    }
}
