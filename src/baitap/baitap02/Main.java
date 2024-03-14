package baitap.baitap02;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.5,"yellow",true);
        Rectangle rectangle = new Rectangle(2.0,3.0,"red",false);
        Square square = new Square(4.0,"red",false);
        Rectangle rectangle1 = new Rectangle(2.9,9.0,"red",true);
        Shape[] shapes = {circle,rectangle,square,rectangle1};
        for (Shape a : shapes){
            System.out.println(a);
            if (a instanceof Square){
                square.howToColor();
            }
        }
    }
}