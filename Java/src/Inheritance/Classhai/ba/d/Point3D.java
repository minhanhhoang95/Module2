package Inheritance.Classhai.ba.d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {

    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float []arr={getX(),getY(),z};
        return arr;
    }

    @Override
    public String toString() {
        return super.toString()
                +" , z :"
                + z
                + " , XYZ :"
                + Arrays.toString(getXYZ())
                ;
    }
}
class TestPoint3D{
    public static void main(String[] args) {
        Point3D point3D = new Point3D();
        System.out.println(point3D);
        point3D=new Point3D(2.0f,3.0f,4.0f);
        System.out.println(point3D);
    }
}
