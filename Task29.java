package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner;

        // x and y of point A
        double x1 = 0;
        double y1 = 0;

        // x and y of point B
        double x2 = 0;
        double y2 = 0;

        // x and y of point C
        double x3 = 0;
        double y3 = 0;

        // these fields are used in calculation
        double intermediateResult1 = 0;
        double intermediateResult2 = 0;
        int result = 0;

        // getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Getting the x and y of Point A");
        System.out.println("Enter the value of x: ");
        x1 = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y1 = scanner.nextDouble();

        System.out.println("\nGetting the x and y of Point B");
        System.out.println("Enter the value of x: ");
        x2 = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y2 = scanner.nextDouble();

        System.out.println("\nGetting the x and y of Point C");
        System.out.println("Enter the value of x: ");
        x3 = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y3 = scanner.nextDouble();

        // calculating
        // using two-point form
        // (x3 - x1) / (x2 - x1) = (y3 - y1) / (y2 - y1)
        intermediateResult1 = (x3 - x1) / (x2 - x1);
        intermediateResult2 = (y3 - y1) / (y2 - y1);
        result = Double.compare(intermediateResult1, intermediateResult2);
        if(result == 0){
            System.out.println("The points A, B, C are lying on the same line");
        } else {
            System.out.println("The points A, B, C are NOT lying on the same line");
        }

    }
}
