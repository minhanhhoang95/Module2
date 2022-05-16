package OOPJava;

import java.util.Scanner;

class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        double delta;
        return delta = (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        double root1;
        return root1 = (-b + (Math.sqrt(getDiscriminant())) / 2 * a);
    }

    public double getRoot2() {
        double root2;
        return root2 = (-b - (Math.sqrt(getDiscriminant())) / 2 * a);
    }
    public double getRoot(){
        double root;
        return root= (-b / 2*a );
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        // delta = b^2 - 4ac;
        // delta > 0 có 2 nghiệm -b +- Math.sqrt(b*b - 4*a*c)/2a;
        // delta < 0 vô nghiệm
        // delta = 0 có 1 nghiệm -b/2a
        if (quadratic.getDiscriminant() > 0) {
            System.out.println("The equation has two solution " + quadratic.getRoot1()+
                    "and" + quadratic.getRoot2()
                    );
        }else if (quadratic.getDiscriminant()==0){
            System.out.println("The Equation has a solution" +quadratic.getRoot() );
        } else {
            System.out.println("The equation has no solution");
        }
    }
}
