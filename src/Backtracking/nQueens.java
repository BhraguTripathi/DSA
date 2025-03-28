package Backtracking;

public class nQueens {
    public static boolean isSafe(String board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=="Q"){
                return false;
            }
        }

        for(int i=row-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(board[i][j]=="Q"){
                return false;
            }
        }

        for(int i=row-1,j=col+1;i>=0&&j< board.length;i--,j++){
            if(board[i][j]=="Q"){
                return false;
            }
        }
        return true;
    }

    public static void nQueen(String board[][],int row){
        if(row== board.length){
            count++;
            printBoard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]="Q";
                nQueen(board,row+1);
                board[row][j]="X";
            }
        }
    }


    public static void printBoard(String board[][]){
        for(int i=0;i< board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static int count=0;

    public static void main(String[] args) {
        int n=4;
        String board[][]=new String[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]="X";
            }
        }
        nQueen(board,0);
        System.out.println("No. of counts: "+count);
    }
}
