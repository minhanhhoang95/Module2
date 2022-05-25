package Inheritance.triangle;

public class Shape {
    private double side;
    public Shape(){}
    public Shape(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public String toString() {
        return "side : " + getSide();
    }
}
class TestShape{
    public static void main(String[] args) {
        Shape shape = new Shape(2.1);
        System.out.println(shape);
    }
}
