package Arrays;

import java.util.Scanner;

public class SearchRotatedSortedArray {
    public static int searchRotatedSortedArray(int arr[],int target,int startIndex,int endIndex){
        if(startIndex>endIndex){
            return -1;
        }
        int mid=startIndex+(endIndex-startIndex)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[startIndex]<=arr[mid]){
            if(arr[startIndex]<=target && target<=arr[mid]){
                return searchRotatedSortedArray(arr,target,startIndex,mid-1);
            }else{
                return searchRotatedSortedArray(arr,target,mid+1,endIndex);
            }
        }else{
            if(arr[mid]<=target && target<=arr[endIndex]){
                return searchRotatedSortedArray(arr,target,mid+1,endIndex);
            }else{
                return searchRotatedSortedArray(arr,target,startIndex,mid-1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(searchRotatedSortedArray(arr,target,0,arr.length-1));
    }
}
