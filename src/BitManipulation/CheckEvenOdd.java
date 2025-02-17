package BitManipulation;

import java.util.Scanner;

public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if((number & 1) == 1){
            System.out.println("Odd Number");
        }else if((number & 1) == 0) {
            System.out.println("Even Number");
        }
    }
}
