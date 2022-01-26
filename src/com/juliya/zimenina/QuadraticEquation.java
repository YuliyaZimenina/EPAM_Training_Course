package com.juliya.zimenina;

import java.util.Locale;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.ENGLISH);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant > 0) {
            double firstRoot;
            double secondRoot;
            firstRoot = (-b - Math.sqrt(discriminant)) / (2 * a);
            secondRoot = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println(firstRoot + " " + secondRoot);
        } else if (discriminant == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println(x);
        } else {
            System.out.println("no roots");
        }
    }
}
