package Functions;
import java.util.*;

import static Functions.PrimeNumber.isPrimeOptimized;

public class PrimeinRange {
    public static void primeInRange(int n){
        for(int i=2;i<=n-1;i++){
            if(isPrimeOptimized(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeInRange(n);
    }
}
