package com.quadraticequation;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 'a':");
        double a = sc.nextDouble();
        System.out.println("Enter a number 'b':");
        double b = sc.nextDouble();
        System.out.println("Enter a number 'c':");
        double c = sc.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println("Delta of the quadratic equation: " + quadraticEquation.getDiscrimainant());
        double delta = quadraticEquation.getDiscrimainant();
        if (delta > 0) {
            double root1 = quadraticEquation.getRoot1();
            double root2 = quadraticEquation.getRoot2();
            System.out.printf("%.2f and %.2f is root of the quadratic equations!\n", root1, root2);
        } else if (delta == 0) {
            double root = quadraticEquation.getRoot1();
            System.out.printf("%.2f is root of the quadratic equations!", root);
        } else {
            System.out.println("The quadratic equation have no solution!");
        }
    }
}
