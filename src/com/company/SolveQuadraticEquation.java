package com.company;

import java.util.Scanner;

public class SolveQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Solve the quadratic equation");
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadratic = new QuadraticEquation(a, b, c);
        double delta = quadratic.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two distinct roots: ");
            System.out.println("Root 1: ");
            System.out.printf("%5.6f",quadratic.getRoot1());
            System.out.println("Root 2: ");
            System.out.printf("%5.6f",quadratic.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one real root: ");
            System.out.printf("%5.6f",quadratic.getRoot1());
        } else {
            System.out.println("The equation has no real roots!");
        }
    }
}