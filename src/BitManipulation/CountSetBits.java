package BitManipulation;

import java.util.Scanner;

public class CountSetBits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        while(number>0){
            if((number & 1)!=0){
                count++;
            }
            number=number>>1;
        }
        System.out.println(count);
    }
}
