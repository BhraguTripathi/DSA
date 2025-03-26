package Backtracking;

public class GridWays {
    public static int gridWays(int i,int j,int row,int col){
        if(i==row-1&&j==col-1){
            return 1;
        }else if(i==row || j==row){
            return 0;
        }
        int way1=gridWays(i+1,j,row,col);
        int way2=gridWays(i,j+1,row,col);
        return way1+way2;
    }
    public static void main(String[] args) {
        int row=4;
        int col=4;
        System.out.println(gridWays(0,0,row,col));
    }
}
