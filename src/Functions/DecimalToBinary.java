package Functions;
import java.util.*;
public class DecimalToBinary {
    public static int decimalToBinary(int n){
        int sum=0;
        int pow=0;
        while(n>0){
            int rem=n%2;
            sum+=(int)(rem*Math.pow(10,pow));
            n=n/2;
            pow++;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(decimalToBinary(n));
    }
}
