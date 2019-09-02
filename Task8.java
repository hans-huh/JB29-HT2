package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу нахождения наименьшего из квадратов двух чисел а и b.
 */

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter the value of b: ");
        double b = scanner.nextDouble();

        double aSqr = Math.pow(a, 2);
        double bSqr = Math.pow(b, 2);

        if(aSqr <= bSqr){
            System.out.println(a + "^2 is smaller than " +  b + "^2");
        } else {
            System.out.println(b + "^2 is smaller than " +  a + "^2");
        }
    }
}
