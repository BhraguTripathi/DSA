package Recursion;

import java.util.Scanner;

public class FirstOccurence {
    public static int firstOcuurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcuurence(arr,key,i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        int i=0;
        System.out.println(firstOcuurence(arr,key,i));
    }
}
