package sef.module6.activity;

public class Square extends Shape{

    private final double side;

    Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        double area = side + side;
        return  area;
    }

    @Override
    public double calculatePerimeter() {
        double perimetr = 4 * side;
        return perimetr;

    }
}
