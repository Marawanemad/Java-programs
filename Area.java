package javaapplication3;

public class Area {
    private double length;
    private double width;
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double RectangleArea(){
        return getLength()*getWidth();
    }
    public double SquareArea(){
        return getLength()*getWidth();
    }
    public double CircleArea(){
        return Math.pow(getRadius(),2)*Math.PI;
    }
    public double TriangleArea(){
        return (getLength()*getWidth())/2;
    }
    
    
}
