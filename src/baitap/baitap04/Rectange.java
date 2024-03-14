package baitap.baitap04;

public class Rectange extends Shape{
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectange(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectange(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectange(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}
