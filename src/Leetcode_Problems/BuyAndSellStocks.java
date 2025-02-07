package Leetcode_Problems;

import java.util.*;

public class BuyAndSellStocks {
    public static int buyAndSellStocks(int arr[],int n){
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(buyAndSellStocks(arr,n));
    }
}
