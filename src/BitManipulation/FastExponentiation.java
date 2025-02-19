package BitManipulation;

import java.util.Scanner;

public class FastExponentiation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int power=sc.nextInt();
        int answer=1;
        while(power>0){
            if((power & 1)!=0){
                answer=answer*number;
            }
            number=number*number;
            power=power>>1;
        }
        System.out.println(answer);
    }
}
