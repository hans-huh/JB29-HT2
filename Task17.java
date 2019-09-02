package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Даны целые числа m, n. Если числа не равны, то заменить каждое из них одним и тем же числом, равным
 * большему из исходных, а если равны, то заменить числа нулями.
 */

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner;
        int m = 0;
        int n = 0;
        int temp = 0; // used to temporarily store the max value
        final int ZERO = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("What is the value of m: ");
        m = scanner.nextInt();
        System.out.println("What is the value of n: ");
        n = scanner.nextInt();

        System.out.println("Before calculation, m = " + m + ", and n = " + n);
        if(m != n){
            temp = Math.max(m, n);
            m = temp;
            n = temp;
        } else {
            m = ZERO;
            n = ZERO;
        }

        System.out.println("\nAfter calculation, m = " + m + ", and n = " + n);
    }
}
