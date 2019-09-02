package by.ld.hw.conditions;
import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {

        Scanner scanner;
        double x = 0;
        double result = 0;
        int tempResult1 = 0; // using this to store the result of Double.compare method;
        int tempResult2 = 0;

        // getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();

        tempResult1 = Double.compare(x, 0);
        tempResult2 = Double.compare(x, 3);
        if(tempResult1 >= 0 && tempResult2 <= 0){
            result = Math.pow(x, 2);
        } else {
            result = 4;
        }
        System.out.println(result + ", if x = " + x);
    }
}
