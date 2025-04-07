package Leetcode_Problems;

import java.util.ArrayList;

public class PairSum1 { //Sorted ArrayList

    //Brute Force -- O(n^2)
    public static boolean pairSum1BruteForce(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+ list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    //2 Pointer Approach -- O(n)
    public static boolean pairSum1OptimizeApproach(ArrayList<Integer> list,int target){
        int leftPointer=0;
        int rightPointer=list.size()-1;
        while(leftPointer!=rightPointer){
            if(list.get(leftPointer)+list.get(rightPointer)==target){
                return true;
            }else{
                if(list.get(leftPointer)+list.get(rightPointer)<target){
                    leftPointer++;
                }else if(list.get(leftPointer)+list.get(rightPointer)>target){
                    rightPointer--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target=50;
        System.out.println(pairSum1BruteForce(list,target));
        System.out.println(pairSum1OptimizeApproach(list,target));
    }
}
