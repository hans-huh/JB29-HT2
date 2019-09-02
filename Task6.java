package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу: определения наибольшего из двух чисел а и b.
 */

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();

        /*
        int biggest = Math.max(a, b);
        System.out.println("The biggest number is " + biggest); */

        if(a >= b){
            System.out.println(a + " is the biggest");
        } else {
            System.out.println(b + " is the biggest");
        }

    }
}
