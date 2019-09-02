package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то
 * будет ли он прямоугольным.
 */

public class Task14 {
    public static void main(String[] args) {

        Scanner scanner;
        int alpha = 0;
        int beta = 0;
        int gamma = 0;
        boolean ifExist = false;

        scanner = new Scanner(System.in);
        System.out.println("Enter the first angle: ");
        alpha = scanner.nextInt();
        System.out.println("Enter the second angle: ");
        beta = scanner.nextInt();
        gamma = 180 - (alpha + beta);

        // check of the triangle exist
        if((gamma > 0)){
            System.out.println("The triangle exist");
            ifExist = true;
        } else {
            System.out.println("The triangle does NOT exist");
        }

        //checking if the triangle is right-angled
        if(ifExist){
            if(alpha == 90 || beta == 90 || gamma == 90){
                System.out.println("The triangle is a right-angled triangle");
            } else {
                System.out.println("The triangle is NOT a right-angled triangle");
            }
        }
    }
}
