package recursion;
import java.util.Scanner;
public class recursion {   
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter the first number : ");
    int n = s.nextInt();
    System.out.print("Enter the second number : ");
    int r = s.nextInt();
    System.out.println(n+"! = "+factorial(n));
        System.out.println(n+"C"+r+" = "+comb(n,r));
    }
//    recursion method to calculate factorial
       public static int factorial(int n){
        if(n<=1)
            return 1;
        else 
            return n*factorial(n-1);
       }
       
//      recursion method to calculate combinations
       public static int comb(int n, int r){
          int fact_n = factorial(n);
          int fact_r = factorial(r);
          int fact_diff = factorial(n-r);
          return fact_n/(fact_r*fact_diff);
       }
}
