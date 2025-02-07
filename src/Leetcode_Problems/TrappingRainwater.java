package Leetcode_Problems;

import java.util.*;

public class TrappingRainwater {
    public static int trappedRainWater(int height[],int n){
        // calculate left max boundary array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        //calculate right max boundary array
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        int width=1;
        int trappedWater=0;
        //loop
        for(int i=0;i<n;i++){
            //waterLevel=min(leftMax,rightMax)
            int waterLevel=Math.min(leftMax[i],rightMax[i]);

            //trapped water= waterLevel - height
            trappedWater+=(waterLevel-height[i])*width;
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        System.out.println(trappedRainWater(height,n));
    }
}
