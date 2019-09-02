package by.ld.hw.conditions;

import java.util.Scanner;

/**
 *   Написать программу нахождения суммы большего и меньшего из трех чисел
 */

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner;
        double maxValue;
        double minValue;
        double result = 0;
        double[] numbers;
        int totalNumbers = 3;

        // getting user's input
        scanner = new Scanner(System.in);
        numbers = new double[totalNumbers];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter " + (i + 1) + " number: ");
            numbers[i] = scanner.nextDouble();
        }

        //getting the min and the max number from the array
        minValue = Double.POSITIVE_INFINITY;
        maxValue = Double.NEGATIVE_INFINITY;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < minValue){
                minValue = numbers[i];
            }
            if(numbers[i] > maxValue){
                maxValue = numbers[i];
            }
        }

        // getting the sum
        result = maxValue + minValue;
        System.out.println("The sum of the min value (" + minValue + ") and the max value (" +
                maxValue + ")  is " + result);

    }
}
