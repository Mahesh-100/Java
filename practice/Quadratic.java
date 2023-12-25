package com.practice;

public class Quadratic {public void solveEquation(int a, int b, int c) {
    double discriminant = b * b - 4.0 * a * c;
    if (discriminant < 0) {
        System.out.println("No real solutions");
    } else if (discriminant == 0) {
        double root = -b / (2.0 * a);
        System.out.println("The solution of the equation is: " + root);
    } else {
        double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);
        System.out.println("The solutions of the equation are: " + root1 + " and " + root2);
    }

}
}


