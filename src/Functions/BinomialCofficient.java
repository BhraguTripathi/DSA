package Functions;
import java.util.*;

public class BinomialCofficient {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    public static int binomialCofficient(int n,int r){
        int cofficient=(factorial(n)/(factorial(r)*factorial(n-r)));
        return cofficient;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println("Binomial Cofficient: "+binomialCofficient(n,r));
    }
}
