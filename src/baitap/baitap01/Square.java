package baitap.baitap01;

public class Square extends Rectangle implements Resizable{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color,filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    double getArea1() {
        return side * side;
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setHeight(double height) {
        setSide(height);
    }

    public String toString() {
        return "A Square with side = "
                + getSide()
                +", Area="
                +getArea1();
    }
    @Override
    public  void resize(double percent){
        this.side *= (percent/100);
    }
}
