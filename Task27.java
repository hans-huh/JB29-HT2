package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Найти max{min(a, b), min(c, d)}.
 */

public class Task27 {
    public static void main(String[] args) {

        Scanner scanner;
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        double min1 = 0;
        double min2 = 0;
        double max = 0;
        int result = 0;

        // getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the value of b: ");
        b = scanner.nextDouble();
        System.out.println("Enter the value of c: ");
        c = scanner.nextDouble();
        System.out.println("Enter the value of d: ");
        d = scanner.nextDouble();

        System.out.println("Solving max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")}");

        result = Double.compare(a, b);
        if(result <= 0){
            min1 = a;
        } else {
            min1 = b;
        }

        result = Double.compare(c, d);
        if(result <= 0){
            min2 = c;
        } else {
            min2 = d;
        }

        result = Double.compare(min1, min2);
        if(result < 0){
            max = min2;
        } else {
            max = min1;
        }
        System.out.println("From max{min(" + a + ", " + b + "), min(" + c + ", " + d + ")}");
        System.out.println("The result is " + max);

    }
}
