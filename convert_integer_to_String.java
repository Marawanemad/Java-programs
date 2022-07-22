import java.util.Scanner;
public class ConvertingToString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer number: ");
        int n = input.nextInt();
        if(n<=100&&n>=-100){
//        to convert integer number to string
            String s = Integer.toString(n);
            System.out.println("Good job");
        }
        else 
            System.out.println("Wrong answer");
    }
}
