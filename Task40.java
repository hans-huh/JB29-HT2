package by.ld.hw.conditions;

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {

        Scanner scanner;
        double x = 0;
        double result = 0;
        int tempResult = 0; // used to store the result of Double.compare

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();

        tempResult = Double.compare(x, 13);
        if(tempResult <= 0){
            result = (-1) * (Math.pow(x, 3) - 9);
        } else {
            result = ((-1) * 3) / (x + 1);
        }

        System.out.println(result + ", if x = " + x);

    }
}
