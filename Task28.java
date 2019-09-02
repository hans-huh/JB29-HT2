package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d
 * — b, d —c).
 */

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner;
        double a = 0;
        double b = 0;
        double c = 0;
        double d = 0;
        boolean notEqual = true;
        double max = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the value of b: ");
        b = scanner.nextDouble();
        System.out.println("Enter the value of c: ");
        c = scanner.nextDouble();
        System.out.println("Enter the value of d: ");
        d = scanner.nextDouble();

        // Checking if d equals a or b or c
        if(d == a){
            System.out.println(a + " = " + d);
            notEqual = false;
        }
        if(d == b){
            System.out.println(b + " = " + d);
            notEqual = false;
        }
        if(d == c){
            System.out.println(c + " = " + d);
            notEqual = false;
        }

        if(notEqual){
            max = Math.max((d - a), d - b);
            max = Math.max(max, (d - c));
            System.out.println("The max value of max{(d - a), (d - b), (d - c)} is " + max);
        }
    }
}
