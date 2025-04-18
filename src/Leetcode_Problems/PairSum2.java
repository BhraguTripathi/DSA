package Leetcode_Problems;

import java.util.ArrayList;

public class PairSum2 {  //Sorted and Rotated ArrayList
    public static boolean pairSum2(ArrayList<Integer> list, int target){
        int pivot=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)> list.get(i+1)){
                pivot=i;
                break;
            }
        }

        int leftPointer=pivot+1;
        int rightPointer=pivot;

        while(leftPointer != rightPointer){
            if(list.get(leftPointer)+list.get(rightPointer)==target){
                return true;
            }else if(list.get(leftPointer)+list.get(rightPointer)>target){
                rightPointer=(list.size()+rightPointer-1)%list.size();
            }else if(list.get(leftPointer)+list.get(rightPointer)<target){
                leftPointer=(leftPointer+1)%list.size();
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=16;
        System.out.println(pairSum2(list,target));
    }
}
