package Algorithms;

import java.util.Scanner;

public class MergeSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[],int startIndex,int lastIndex){
        if(startIndex==lastIndex){
            return;
        }
        int mid=startIndex + (lastIndex-startIndex)/2;
        mergeSort(arr,startIndex,mid);
        mergeSort(arr,mid+1,lastIndex);
        merge(arr,startIndex,mid,lastIndex);
    }
    public static void merge(int arr[],int startIndex,int mid,int lastIndex){
        int temp[]=new int[lastIndex-startIndex+1];
        int i=startIndex; //left Iterator
        int j=mid+1;  //right Iterator
        int k=0;  //temp Iterator

        while(i<=mid && j<=lastIndex){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=lastIndex){
            temp [k++]=arr[j++];
        }

        for (k=0,i=startIndex;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int startIndex=0;
        int lastIndex=arr.length-1;
        mergeSort(arr,startIndex,lastIndex);
        printArray(arr);
    }
}
