package by.ld.hw.conditions;
import java.util.Scanner;

/**
 * Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух
 * из них положительной.
 */

public class Task32 {
    public static void main(String[] args) {

        Scanner scanner;
        double[] numbers;
        final int TOTAL_NUMBERS = 3;
        double temp = 0;
        int result = 0; // this is used to store results of Double.compare method
        boolean noPositive = true;

        // Getting user's input
        scanner = new Scanner(System.in);
        numbers = new double[TOTAL_NUMBERS];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter " + (i + 1) + " number");
            numbers[i] = scanner.nextDouble();
        }
        System.out.println("\n\n");

        // calculation
        for(int i = 0; i < numbers.length - 1; i++){
            for(int k = i + 1; k < numbers.length; k++){
                temp = numbers[i] + numbers[k];
                result = Double.compare(temp, 0);
                if(result > 0){
                    System.out.println("The sum of " + numbers[i] + " and " + numbers[k] + " is a positive number.");
                    noPositive = false;
                }
            }
        }

        // This is printed if there are no positive sums
        if(noPositive){
            System.out.println("\nThe resulted sums are not positive numbers");
        }

    }
}
