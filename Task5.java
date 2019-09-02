package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу: определения наименьшего из двух чисел а и b.
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();

        /*
        int smallest = Math.min(a, b);
        System.out.println("The smallest number is " + smallest);
        */

        if(a <= b){
            System.out.println(a + " is the smallest");
        } else {
            System.out.println(b + " is the smallest");
        }
    }
}
