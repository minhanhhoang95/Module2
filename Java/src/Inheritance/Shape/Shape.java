package Inheritance.Shape;

public class Shape {
    private String color = "green";
    private boolean filled = true;

    public Shape() {

    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void setColor() {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled(){
        return filled;
    }

    @Override
    public String toString() {
        return "A shape with color of "
                + getColor()
                +" and "
                +(isFilled() ? "filled":"not filled")
                ;
    }
}
class ShapeTest{
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape=new Shape("red",false);
        System.out.println(shape);
    }
}
