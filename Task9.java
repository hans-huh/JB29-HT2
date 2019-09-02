package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник
 * равносторонним.
 */
public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of side A: ");
        int a = scanner.nextInt();
        System.out.println("Enter the length of side B: ");
        int b = scanner.nextInt();
        System.out.println("Enter the length of side C: ");
        int c = scanner.nextInt();

        if(a == b & b == c) {
            System.out.println("This is an equilateral triangle");
        } else {
            System.out.println("This is not an equilateral triangle");
        }
    }
}
