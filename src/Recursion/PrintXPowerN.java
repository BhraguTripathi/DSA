package Recursion;

import java.util.Scanner;

public class PrintXPowerN {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }
    public static int optimizedPower(int x,int n){
        if(n==0) return 1;
        int halfPower=optimizedPower(x,n/2);
        int halfPowerSq=halfPower*halfPower;
        if(n%2!=0){
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(optimizedPower(x,n));
    }
}
