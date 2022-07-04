package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of lines: ");
    int n = s.nextInt();

// draw lower triangle
    for(int i=1 ; i<=n ; i++){
        for(int j=n;j>=i;j--){
            System.out.print("*");
        }
        System.out.println("");
    }   
        System.out.println();

// draw inverse lower triangle
    for(int i=n ; i>=0 ; i--){
        for(int c=1;c<=n-i;c++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print("*");
        }
        System.out.println();   
    }
        System.out.println();

        
//    draw upper tiangle
    for(int i=1 ; i<=n ; i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
        System.out.println();
        
//    draw upper tiangle
    for(int i=1 ; i<=n ; i++){
        for(int c=1 ; c<=n-i ; c++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
        System.out.println();
        
//draw box1 
        for(int j=0;j<=n ; j++){
            System.out.print("* ");
        }
        for(int i=1;i<n;i++){
            System.out.println();
            System.out.print("* ");
            for(int j=1;j<n*2-1 ; j++){
                System.out.print(" ");
            }
            System.out.print("*");
        }
            System.out.println();
        
        for(int j=0;j<=n ; j++){
            System.out.print("* ");
        }
        System.out.println();
        
        System.out.println("");
        
//   draw box2
    for(int i=0 ;i<=n ;i++){
        for(int j=0 ; j<=n ; j++){
        System.out.print("* ");
        }
        System.out.println();
        }
    
        System.out.println("");

//    draw upper pyramid
    for(int i=1;i<=n ;i++){
        for(int j=1 ; j<=n-i ;j++){
            System.out.print(" ");
        }
        for(int c=1 ; c<2*i ; c++){
            System.out.print("*");
        }
        System.out.println();
    }
    
//draw lower pyramid
    for(int i=n ; i>=1 ; i--){
        for(int j=1 ; j<=n-i ; j++){
            System.out.print(" ");
        }
        for(int c=1 ; c<=2*i-1 ; c++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}