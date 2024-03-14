package baitap.baitap04;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hinh chu nhat");
        Shape rectangle = new Rectange("red",1.2,2.3);
        rectangle.display();
        rectangle.getArea();
        System.out.println("Dien tich hinh chu nhat la :"+rectangle.getArea());
        System.out.println("=============");

        System.out.println("Hinh tron");
        Shape circle = new Circle("yellow",1.2);
        circle.display();
        circle.getArea();
        System.out.println("Dien tich hinh tron la :"+circle.getArea());
    }
}
