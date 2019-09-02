package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу, которая определит площадь какого треугольника больше.
 */

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner;

        // these fields will be used to calculate S of the first triangle
        double a = 0;
        double b = 0;
        double c = 0;
        double h1 = 0; // the height of the first triangle
        double p1 = 0; // half-perimeter of the first triangle

        // these fields will be used to calculate S of the second triangle
        double x = 0;
        double y = 0;
        double z = 0;
        double h2 = 0; // the height of the second triangle
        double p2 = 0; // half-perimeter of the second triangle

        double s1;
        double s2;

        scanner = new Scanner(System.in);


        // Getting the sides of the first triangle
        System.out.println("Please enter the sides of the first triangle: ");
        System.out.println("Enter the length of side a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of side b: ");
        b = scanner.nextDouble();
        System.out.println("Enter the length of side c: ");
        c = scanner.nextDouble();


        // Getting the sides of the second triangle
        System.out.println("Please enter the sides of the second triangle: ");
        System.out.println("Enter the length of side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter the length of side y: ");
        y = scanner.nextDouble();
        System.out.println("Enter the length of side z: ");
        z = scanner.nextDouble();


        // Calculating s1 (S of the first triangle)
        p1 = (a + b + c) / 2;
        h1 = 2 / a * Math.sqrt((p1 * (p1 - a) * (p1 - b) * (p1 - c)));
        s1 = a / 2 * h1;


        // Calculating s2 (S of the second triangle)
        p2 = (x + y + z) / 2;
        h2 = 2 / x * Math.sqrt((p2 * (p2 - x) * (p2 - y) * (p2 - z)));
        s2 = x / 2 * h2;


        if(s1 < s2) {
            System.out.println("S1 < S2");
        } else if (s1 > s2){
            System.out.println("S1 > S2");
        } else {
            System.out.println("S1 == S2");
        }


    }
}
