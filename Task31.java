package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич
 * через отверстие.
 */

public class Task31 {
    public static void main(String[] args) {

        Scanner scanner;

        // size of the hole
        double a = 0;
        double b = 0;

        // size of the brick
        double x = 0;
        double y = 0;
        double z = 0;

        // getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Getting the size of the hole");
        System.out.println("Enter the width of the hole: ");
        a = scanner.nextDouble();
        System.out.println("Enter the length of the hole: ");
        b = scanner.nextDouble();

        System.out.println("\nGetting the size of the brick");
        System.out.println("Enter the width of the brick: ");
        x = scanner.nextDouble();
        System.out.println("Enter the length of the brick: ");
        y = scanner.nextDouble();
        System.out.println("Enter the height of the brick: ");
        z = scanner.nextDouble();


        // we do not need the length of the brick to calculate if it possible to put the brick into the hole
        if( (x <= a && z <= b) || (z <= a && x <= b)){
            System.out.println("It fits");
        } else {
            System.out.println("It does not fit");
        }


    }

}
