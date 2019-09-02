package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Подсчитать количество положительных среди чисел а, b, с.
 */

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner;
        double[] numbers;
        int counter = 0;
        int totalNumbers = 3;
        int temp = 0;

        // getting user's input
        scanner = new Scanner(System.in);
        numbers = new double[totalNumbers];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter " + (i + 1) + " number: ");
            numbers[i] = scanner.nextDouble();
        }

        //counting positive numbers
        for(int i = 0; i < numbers.length; i++){
            temp = Double.compare(numbers[i], 0);
            if(temp > 0){
                counter++;
            }
        }

        System.out.println("Counted " + counter + " positive number(s).");
    }
}
