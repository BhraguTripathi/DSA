package Functions;

import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(int n){
        int sum=0;
        int pow=0;
        while(n>0){
            int rem=n%10;
            sum+=(int)(rem*Math.pow(2,pow));
            n=n/10;
            pow++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(binaryToDecimal(n));
    }
}
