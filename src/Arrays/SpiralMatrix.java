package Arrays;

import java.util.Scanner;

public class SpiralMatrix {
    public static void spiralMatrix(int arr[][],int row,int column){
        int startRow=0;
        int endRow=row-1;
        int startCol=0;
        int endCol=column-1;

        while(startRow<=endRow && startCol<=endCol){

            //top
            for(int j=startCol;j<=endCol;j++){
                System.out.print(arr[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(arr[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow) break;
                System.out.print(arr[endRow][j]+" ");
            }

            //left
            for(int i=endRow-1;i>startRow+1;i--){
                if(startCol==endCol) break;
                System.out.print(arr[i][startCol]+" ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int arr[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        spiralMatrix(arr,row,column);
    }
}
