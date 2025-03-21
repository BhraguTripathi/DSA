package Algorithms;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class CountingSort {
    public static void countingSort(int arr[],int n){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest=Math.max(largest,arr[i]);
        }

        int count[]=new int[largest+1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }

        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        countingSort(arr,n);
        printArray(arr,n);
    }
}
