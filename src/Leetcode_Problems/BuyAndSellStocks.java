package Leetcode_Problems;

import java.util.*;

public class BuyAndSellStocks {
    public static int buyAndSellStocks(int prices[],int n){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(buyPrice<prices[i]){
                int profit=prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prices[]=new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(buyAndSellStocks(prices,n));
    }
}
