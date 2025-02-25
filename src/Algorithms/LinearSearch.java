package Algorithms;

import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int findNumber, int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==findNumber){
                return i;
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
        int findNumber=sc.nextInt();
        System.out.println(linearSearch(findNumber,arr));
    }
}
