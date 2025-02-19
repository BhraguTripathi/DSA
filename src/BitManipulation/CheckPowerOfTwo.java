package BitManipulation;

import java.util.Scanner;

public class CheckPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(((number) & (number-1)) == 0){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
