package Arrays;

import java.util.Scanner;

public class DiagonalSum {
    public static void diagonalSum(int matrix[][],int n){
        int sum=0;

        //brute force
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                if(i==j){
//                    sum+=matrix[i][j];
//                } else if(i+j == n-1){
//                    sum+=matrix[i][j];
//                }
//            }
//        }

        //optimized way
        for(int i=0;i<n;i++){
            sum+=matrix[i][i];

            if(i!= n-i-1){
                sum+=matrix[i][n-i-1];
            }
        }

        System.out.println("Sum: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        diagonalSum(matrix,n);
    }
}
