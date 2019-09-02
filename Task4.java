package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу: равны ли два числа а и b?
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        int b = scanner.nextInt();
        if(a == b){
            System.out.println("a == b");
        } else {
            System.out.println(" a != b");
        }
    }
}
