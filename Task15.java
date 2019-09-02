package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Даны действительные числа х и у, не равные друг другу. Меньшее из этих двух чисел заменить половиной
 * их суммы, а большее — их удвоенным произведением.
 */

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner;
        double x = 0;
        double y = 0;
        double tempX = 0;
        double tempY = 0;

        scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y = scanner.nextDouble();

        System.out.println("Before calculation, x = " + x + ", and y = " + y);


        int result = Double.compare(x, y);
        if(result < 0){  // x < y
            tempX = (x + y) / 2;
            tempY = (x * y) * 2;
            x = tempX;
            y = tempY;
            System.out.println();
        } else if(result > 0) { // x > y
            tempY = (x + y) / 2;
            tempX = (x * y) * 2;
            y = tempY;
            x = tempX;
        } else {
            System.out.println("x and y are equal!");
        }

        System.out.println("After calculation, x = " + x + ", and y = " + y);

    }
}
