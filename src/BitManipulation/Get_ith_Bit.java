package BitManipulation;

import java.util.Scanner;

public class Get_ith_Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int n=sc.nextInt();
        int bitMask=1<<n;
        if((n & bitMask) == 0){
            System.out.println("0");
        }else if((n & bitMask) == 1){
            System.out.println("1");
        }
    }
}
