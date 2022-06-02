package abstract_interface.resizeable;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        //chưa thay đổi
        Circle circle = new Circle(12);
        System.out.println("Circle :" + circle);
        Rectangle rectangle = new Rectangle();
        System.out.println("Rectangle :" + rectangle);
        Square square = new Square(12);
        System.out.println("Square : "+ square);
        // khai báo 1 biến random từ 1- 100 để set kích thước
        double percent = Math.floor(Math.random()*100-1);
        // thay đổi kích thước
        circle.resize(percent);
        shapes[0]=circle;
        rectangle.resize(percent);
        shapes[1]=rectangle;
        square.resize(percent);
        shapes[2]=square;
        System.out.println("Array after resizing "+ Arrays.toString(shapes));
    }
}
