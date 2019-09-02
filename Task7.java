package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();
        System.out.println("Enter the value of c: ");
        int c = scanner.nextInt();
        System.out.println("Enter the value of x: ");
        int x = scanner.nextInt();

        int result = (a * x * x) + (b * x) + c;
        if(result < 0 ){
            result = Math.abs(result);
            System.out.println("|" + result + "|");
        } else {
            System.out.println("|" + result + "|");
        }

    }
}
