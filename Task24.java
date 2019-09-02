package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за
 * исходное данное количество лепестков п.
 */

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner;
        int numOfPetals = 0;

        // getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Please enter the number of petals: ");
        numOfPetals = scanner.nextInt();

        if(numOfPetals % 2 == 0){
            System.out.println("Does NOT love ='(");
        } else {
            System.out.println("Loves =)");
        }
    }
}
