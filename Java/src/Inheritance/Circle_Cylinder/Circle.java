package Inheritance.Circle_Cylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "green";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println(" radius is wrong ");
            return;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius :"
                + getRadius()
                +" , color : "
                +getColor()
                +" , area :"
                +getArea()
                +" , perimeter :"
                +getPerimeter()
        ;
    }
}

class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        circle=new Circle(5.0,"red");
        System.out.println(circle);

    }
}
