package Strings;

import java.util.Scanner;

public class LargestString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        String largest=arr[0];
        for(int i=0;i<n;i++){
            if(largest.compareToIgnoreCase(arr[i])<0){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}
