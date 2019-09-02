package by.ld.hw.conditions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в
 * четвертую степень — отрицательные
 */

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner;
        Double[] numbers;
        int totalNumber = 0;

        scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want to use in your calculation: ");
        totalNumber = scanner.nextInt();
        numbers = new Double[totalNumber];

        // getting input from user
        for(int i = 0; i < totalNumber; i++){
            System.out.println("PLease enter your " + (i + 1) + " number");
            numbers[i] = scanner.nextDouble();
        }

        // Print array before calculation
        System.out.println("Before calculation");
        System.out.println(Arrays.toString(numbers));

        // calculating
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] < 0){
                numbers[i] = Math.pow(numbers[i], 4);
            } else {
                numbers[i] = Math.pow(numbers[i], 2);
            }
        }

        // printing the result
        System.out.println("\nAfter calculation");
        System.out.println(Arrays.toString(numbers));
    }
}
