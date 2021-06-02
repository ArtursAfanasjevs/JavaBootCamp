package sef.module6.activity;

public class Restangle extends  Shape {
    private double lenght;
    private double breadth;


    Restangle(double lenght, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double calculateArea() {
        double area = lenght * breadth;
        return area;
    }
    public double CalculatePerimeter(){
        double perimeter = 2 * (lenght = breadth);
        return perimeter;
    }
}
