package com.quadraticequation;
import java.lang.Math;

public class QuadraticEquation {
    private double a, b, c;
    private double delta = Math.pow(b, 2) - (4 * a * c);

//    public double getDelta() {
//        return delta;
//    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscrimainant() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + (Math.sqrt(getDiscrimainant()))) / (2 * a);
    }

    public double getRoot2() {
        return (-b - (Math.sqrt(getDiscrimainant()))) / (2 * a);
    }
}
