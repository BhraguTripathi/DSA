package Arrays;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.print(" = "+sum);
                System.out.println();
            }
            System.out.println();
        }
    }
}
