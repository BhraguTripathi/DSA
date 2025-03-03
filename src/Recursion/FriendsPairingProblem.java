package Recursion;

import java.util.Scanner;

public class FriendsPairingProblem {
    public static int friendPairing(int n){
        if(n==1 || n==2){
            return n;
        }
        int totalWays=(friendPairing(n-1)+((n-1)*friendPairing(n-2)));
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(friendPairing(n));
    }
}
