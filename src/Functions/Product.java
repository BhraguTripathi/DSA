package Functions;
import java.util.*;
public class Product {
    public static int product(int a, int b){
        int p=a*b;
        return p;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Product: "+product(a,b));
    }
}
