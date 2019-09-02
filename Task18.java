package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Подсчитать количество отрицательных среди чисел а, b, с.
 */

public class Task18 {
    public static void main(String[] args) {

        Scanner scanner;
        double[] numbers;
        int totalNumber = 3;
        int counter = 0;
        int temp = 0;

        // get user's input
        scanner = new Scanner(System.in);
        numbers = new double[totalNumber];
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Enter " + (i + 1) + " number");
            numbers[i]= scanner.nextDouble();
        }

        //couning negative numbers
        for(int i = 0; i < numbers.length; i++){
            temp = Double.compare(numbers[i], 0);
            if(temp < 0){
                counter++;
            }
        }

        System.out.println("Counted " + counter + " negative numbers");



    }
}
