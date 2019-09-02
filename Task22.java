package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y -
 * меньшее
 */

public class Task22 {
    public static void main(String[] args) {

        Scanner scanner;
        double x = 0;
        double y = 0;
        double temp = 0;
        int result = 0;

        //Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y = scanner.nextDouble();

        System.out.println("Before calculation, x = " + x + ", and y = " + y);


        // calculation
        result = Double.compare(x, y);
        if(result < 0){
             temp = x;
             x = y;
             y = temp;
        }
        System.out.println("After calculation, x = " + x + ", and y = " + y);
    }
}
