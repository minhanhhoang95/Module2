package Inheritance.Classhai.ba.d;

import java.util.Arrays;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D() {

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] arr = {x, y};

        return arr;
    }

    @Override
    public String toString() {
        return " x :"
                + getX()
                +", y :"
                + getY()
                + " XY :"
                +Arrays.toString(getXY())
                ;
    }
}
class TestPoint2D{
    public static void main(String[] args) {
        Point2D point2D =new Point2D();
        System.out.println(point2D);
        point2D=new Point2D(2.0f,3.0f);
        System.out.println(point2D);
    }
}
