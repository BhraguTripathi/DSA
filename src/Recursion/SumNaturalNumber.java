package Recursion;

import java.util.Scanner;

public class SumNaturalNumber {
    public static int sumOfNaturalNumber(int n){
        int sum=0;
        if(n>0){
            sum=n+sumOfNaturalNumber(n-1);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfNaturalNumber(n));
    }
}
