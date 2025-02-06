package Algorithms;

//Used to find max subarray sum
//It is the best way to find the max sum of any subarray

import java.util.*;
public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(maxSum,currSum);
        }
        System.out.println("Max Sum: "+maxSum);
    }
}
