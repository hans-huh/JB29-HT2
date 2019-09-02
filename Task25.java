package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение
 * «Пожароопасная ситуация », если температура в комнате превысила 60° С.
 */

public class Task25 {
    public static void main(String[] args) {
        Scanner scanner;
        double temperature = 0;
        int result = 0;

        // getting input
        scanner = new Scanner(System.in);
        System.out.println("Enter the temperature: ");
        temperature = scanner.nextDouble();

        // fire sensor logic
        result = Double.compare(temperature, 60);
        if(result > 0){
            System.out.println("Fire Hazard!");
        }
    }
}
