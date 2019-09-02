package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Определить, делителем каких чисел а, b, с является число k.
 */

public class Task20 {
    public static void main(String[] args) {

        Scanner scanner;
        int a = 0;
        int b = 0;
        int c = 0;
        int k = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = scanner.nextInt();
        System.out.println("Enter the value of b: ");
        b = scanner.nextInt();
        System.out.println("Enter the value of c: ");
        c = scanner.nextInt();
        System.out.println("Enter the value of k: ");
        k = scanner.nextInt();

        if(a % k == 0){
            System.out.println(k + " is a divider of " + a);
        }
        if(b % k == 0){
            System.out.println(k + " is a divider of " + b);
        }
        if(c % k == 0){
            System.out.println(k + " is a divider of " + c);
        }
    }


}
