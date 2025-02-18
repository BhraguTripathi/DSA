package BitManipulation;

import java.util.Scanner;

public class Set_ith_Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(number | (1<<n));
    }
}
