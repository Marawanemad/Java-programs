package Area_calcolator;
import java.util.Scanner;
public class Area_calcolator {   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Area area = new Area();
        boolean flag = true ;
        while(flag==true){
            System.out.print("Enter shape name to calculate area ,if you want to stop write no : ");
            String shape = input.next();
            shape = shape.toLowerCase();
            if("circle".equals(shape)) {
                System.out.print("Enter the Radius : ");
                double radius = input.nextDouble();
                area.setRadius(radius);
                System.out.println("The area of circle = "+area.CircleArea());   
            }
            else if("triangle".equals(shape)){
                System.out.print("Enter the Height : ");
                double height = input.nextDouble();
                System.out.print("Enter the Base : ");
                double base = input.nextDouble();
                area.setLength(height);
                area.setWidth(base);
                System.out.println("The area of triangle = "+area.TriangleArea());
            }
            else if("square".equals(shape)){
                System.out.print("Enter square side : ");
                double side = input.nextDouble();
                area.setLength(side);
                area.setWidth(side);
                System.out.println("The area of square = "+area.SquareArea());
            }
            else if("rectangle".equals(shape)){
                System.out.print("Enter the Length : ");
                double length = input.nextDouble();
                System.out.print("Enter the Width : ");
                double width = input.nextDouble();
                area.setLength(length);
                area.setWidth(width);
                System.out.println("The area of Rectangle = "+area.RectangleArea());
            }
            else  {
                if("no".equals(shape)){
                flag = false ;
            }
                else{
                System.out.println("the shape name is wrong write it again");
                flag=true;
            }
            }
            }
    }
}
