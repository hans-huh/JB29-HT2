package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек находится
 * ближе к началу координат.
 */

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner;

        // Fields for point A
        double x1 = 0;
        double y1 = 0;
        double total1 = 0;

        // Fields for point B
        double x2 = 0;
        double y2 = 0;
        double total2 = 0;

        // getting user's input
        scanner = new Scanner(System.in);
        System.out.println("You need to provide the location of point A(x1, y1)");
        System.out.println("Enter the value of x1: ");
        x1 = scanner.nextDouble();
        System.out.println("Enter the value of y1: ");
        y1 = scanner.nextDouble();

        System.out.println("\nYou need to provide the location of point B(x2, y2");
        System.out.println("Enter the value of x2: ");
        x2 = scanner.nextDouble();
        System.out.println("Enter the value of y2: ");
        y2 = scanner.nextDouble();

        // calculation
        total1 = Math.sqrt( Math.pow(x1, 2) + Math.pow(y1, 2) );
        total2 = Math.sqrt( Math.pow(x2, 2) + Math.pow(y2, 2) );

        if (total1 < total2 ){
            System.out.println("Point A is closer to the origin of coordinates");
        } else if (total1 > total2){
            System.out.println("Point B is closer to the origin of coordinates");
        } else {
            System.out.println("Points are equally spaced");
        }




    }
}
