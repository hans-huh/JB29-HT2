package by.ld.hw.conditions;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {

        Scanner scanner;
        double x = 0;
        double result = 0;
        int tempResult = 0; // using this to store the result of Double.compare;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();

        tempResult = Double.compare(x, 3);
        if(tempResult <= 0){
            result = Math.pow(x, 2) - (3 * x) + 9;
        } else {
            result = 1 / (Math.pow(x, 3) + 6);
        }

        System.out.println(result + ", when x = " + x);

    }

}
