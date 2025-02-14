package Arrays;

import java.util.Scanner;

public class SearchInSortedArray {
    public static boolean searchInSortedArray(int arr[][],int n,int m,int key){
        int row=0;
        int column=m-1;
        while(row<n && column>=0){
            if(arr[row][column]==key){
                System.out.println("Found at ("+row+","+column+")");
                return true;
            }else if(key < arr[row][column]) {
                column--;
            }else{
                row++;
            }
        }
        System.out.println("Not Found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int key=sc.nextInt();
        searchInSortedArray(arr,n,m,key);
    }
}
