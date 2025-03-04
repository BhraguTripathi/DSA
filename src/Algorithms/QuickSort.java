package Algorithms;

import java.util.Scanner;

public class QuickSort {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quickSort(int arr[],int startIndex, int endIndex){
        if(startIndex>=endIndex){
            return;
        }
        int partitionIndex=partition(arr,startIndex,endIndex);
        quickSort(arr,startIndex,partitionIndex-1);
        quickSort(arr,partitionIndex+1,endIndex);
    }
    public static int partition(int arr[],int startIndex,int endIndex){
        int pivot=arr[endIndex];
        int i=startIndex-1; //to make place for element smaller than pivot

        for(int j=startIndex;j<endIndex;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[endIndex]=arr[i];
        arr[i]=temp;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }
}
