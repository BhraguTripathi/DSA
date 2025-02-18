package BitManipulation;

import java.util.Scanner;

public class Update_ith_Bit {
    public static int updateithBit(int number, int n, int i){
        if(i==0){
            return number & (~(1<<n));
        }else{
            return number | (1<<n);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        int n=sc.nextInt();
        int i=sc.nextInt();
        System.out.println(updateithBit(number,n,i));
    }
}
