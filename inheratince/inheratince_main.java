package javaapplication2;
import java.util.*;
public class JavaApplication2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name , address,school , program  ;
    int year,phone ;
    double fee , pay ;
    {
    System.out.print("Enter the person name : ");
    name = input.next();
    System.out.print("Enter the person address : ");
    address = input.next();
    System.out.print("Enter the person phone : "); 
    phone = input.nextInt();
    person p = new person(name , address,phone);
    System.out.println(p.toString());
    }
    {
    System.out.print("Enter the student name : ");
    name = input.next();
    System.out.print("Enter the student address : ");
    address = input.next();
    System.out.print("Enter the student program : ");
    program = input.next();
    System.out.print("Enter the student phone : "); 
    phone = input.nextInt();
    System.out.print("Enter the student birth year : ");
    year = input.nextInt();
    System.out.print("Enter the student fee : ");
    fee = input.nextDouble();     
    student s = new student(name , address,phone ,program , year , fee);   
    System.out.println(s.toString());
    }
    {  
    System.out.print("Enter the staff name : ");
    name = input.next();
    System.out.print("Enter the staff address : ");
    address = input.next();
    System.out.print("Enter the staff school : ");
    school = input.next();
    System.out.print("Enter the staff phone : "); 
    phone = input.nextInt();
    System.out.print("Enter the staff pay : ");
    pay = input.nextDouble();    
    staff t = new staff(name , address,phone , school , pay);
    System.out.println(t.toString());
    }
  }
}