package baitap.baitap04;

public class Circle extends Shape {
    final double PI = 3.14;
    double r;

    public Circle(String color, double r) {
        super(color);
        this.r = r;
    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return PI * Math.abs(r);
    }
}
