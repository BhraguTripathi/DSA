package BitManipulation;

import java.util.Scanner;

public class ClearRangeOfBits {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        System.out.println(number & (a|b));
    }
}
