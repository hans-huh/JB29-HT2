package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными
 * значениями, если это не так.
 */

public class Task30 {
    public static void main(String[] args) {

        Scanner scanner;
        double a = 0;
        double b = 0;
        double c = 0;
        boolean firstCondition = false;
        int result = 0; // variable is used to store the result of Double.compare method

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextDouble();
        System.out.println("Enter the value of b: ");
        b = scanner.nextDouble();
        System.out.println("Enter the value of c: ");
        c = scanner.nextDouble();


        System.out.println("Before calculation, a = " + a + ", b = " + b + ", c = " + c);
        // Calculation
        result = Double.compare(a, b);
        if(result > 0){
            result = Double.compare(b, c);
            if(result > 0){
                firstCondition = true;
            }
        }

        if(firstCondition){
            a *= 2;
            b *= 2;
            c *= 2;
        } else {
            a = Math.abs(a);
            b = Math.abs(b);
            c = Math.abs(c);
        }

        System.out.println("After calculation, a = " + a + ", b = " + b + ", c = " + c);



    }
}
