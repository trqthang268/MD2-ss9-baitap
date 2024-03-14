package baitap.baitap01;

import baitap.baitap01.Circle;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        double x = (double) Math.floor(Math.random()*10);
        double y = (double) Math.floor(Math.random()*10);

        Circle circle1 = new Circle(x, "yellow", false);
        Rectangle rectangle1 = new Rectangle(x,y,"red",true);
        Square square1 = new Square(x, "orange",true);

        Shape[] shapes = {circle1,rectangle1,square1};
        System.out.println("truoc khi resize");
        for (Shape a : shapes){
            System.out.println(a);
        }

        circle1.resize(Math.random()*100);
        rectangle1.resize(Math.random()*100);
        square1.resize(Math.random()*100);
        System.out.println("Sau khi resize");
        for (Shape a : shapes){
            System.out.println(a);
        }

    }
}