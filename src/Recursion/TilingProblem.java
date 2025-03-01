package Recursion;

import java.util.Scanner;

public class TilingProblem {
    public static int tilingProblem(int n){
        if(n==0 || n==1){
            return 1;
        }
        int vertical=tilingProblem(n-1);
        int horizontal=tilingProblem(n-2);
        int totalWays=vertical+horizontal;
        return totalWays;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tilingProblem(n));
    }
}
