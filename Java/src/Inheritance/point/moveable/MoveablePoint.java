package Inheritance.point.moveable;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[2];
    }

    @Override
    public String toString() {
        return "x = " + super.getX()
                +"y = " + super.getY() +
                "MovablePoint " +
                "xSpeed :" + getXSpeed() +
                ", ySpeed :" + getySpeed()
                ;
    }

    public MoveablePoint move() {
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
class TestMoveablePoint{
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint=new MoveablePoint(2.0f,3.0f);
        System.out.println(moveablePoint);
        moveablePoint=new MoveablePoint(2.0f,3.0f,4.0f,5.0f);
        System.out.println(moveablePoint);
    }
}