package Arrays;

import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int arr[],int n,int key){
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]>key){
                end=mid-1;
            }else if(arr[mid]<key){
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int index=binarySearch(arr,n,key);
        if(index==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found at index "+index);
        }
    }
}
