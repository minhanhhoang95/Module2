package Inheritance.Circle_Cylinder;

public class Cylinder extends Circle {
    private double height = 2.0;

    public Cylinder() {

    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return Math.PI * (getRadius() * getRadius()) * height;
    }

    @Override
    public String toString() {
        return "Cylinder with height : " +
                 getHeight()
                + super.toString()
                + " , Volume : "
                +getVolume()
                ;
    }
}
class TestCylinder{
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        cylinder=new Cylinder(3.0);
        System.out.println(cylinder);
        cylinder=new Cylinder(4.0,2.0,"yellow");
        System.out.println(cylinder);
    }
}
