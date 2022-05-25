package Inheritance.Shape;

public class Rectangle extends Shape {
    private double length = 1.0;
    private double width = 1.0;

    public Rectangle() {

    }
    public Rectangle(double length , double width){
        this.length=length;
        this.width=width;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * this.length;
    }
    public double getPerimeter(){
        return 2*(width+this.length);
    }

    @Override
    public String toString() {
        return "A Rectangle with length " +
                + getLength()
                +" and width "
                + getWidth()
                +" , which is a subclass of "
                + super.toString()
                ;
    }
}
class TestRectangle{
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        System.out.println(rectangle);
        rectangle=new Rectangle(5.8,2.3);
        System.out.println(rectangle);
        rectangle=new Rectangle(5.8,2.3,"orange",true);
        System.out.println(rectangle);
    }
}
