package Arrays;

import java.util.Scanner;

public class LargestNumber {
    public static int largestNumber(int arr[]){
        int max=arr[0];
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(largestNumber(arr));
    }
}
