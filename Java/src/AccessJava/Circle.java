package AccessJava;

import java.awt.*;

import static java.awt.Color.red;

public class Circle {
    private double radius;
    private Color color;

    public Circle(double r) {
        this.radius = r;
        color = red;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.pow(getRadius(), 2) * Math.PI;
    }

    void display() {
        System.out.println("Bán kính :" + getRadius() + " , " + "Diện tích :" + getArea());
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        circle.display();
        Circle circle1 = new Circle(2);
        circle1.display();
    }
}
