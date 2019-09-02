package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу, которая определит площадь какого круга меньше.
 */

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the first circle: ");
        double r1 = scanner.nextDouble();
        System.out.println("Enter the radius of the second circle: ");
        double r2 = scanner.nextDouble();

        double s1 = Math.PI * (Math.pow(r1, 2));
        double s2 = Math.PI * (Math.pow(r2, 2));

        int result = Double.compare(s1, s2);
        if(result < 0 ){
            System.out.println("S of the circle with radius " + r1 + " is smaller than S of the circle with radius " + r2);
        } else if (result == 0) {
            System.out.println("S of both circles are equal");
        } else {
            System.out.println("S of the circle with radius " + r1 + " is bigger that S of the circle with radius " + r2);
        }

    }
}
