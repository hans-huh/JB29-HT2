package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * На плоскости ХОY задана своими координатами точка А. Указать, где она расположена (на какой оси или
 * в каком координатном угле).
 */

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner;
        double x = 0;
        double y = 0;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("What are the coordinates (x, y) of the point A?");
        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y = scanner.nextDouble();

        int resultX = Double.compare(x, 0);
        int resultY = Double.compare(y, 0);

        if (resultX == 0 && resultY != 0 ){
            System.out.println("The point A is located on Y-axis");
        }
        else if (resultX != 0 && resultY == 0){
                System.out.println("The point A is located on X-axis");
            }
        else if (resultX > 0 && resultY > 0){
            System.out.println("The point A is in I quadrant");
        }
        else if (resultX > 0 && resultY < 0){
            System.out.println("The point A is in IV quadrant");
        }
        else if(resultX < 0 && resultY > 0){
            System.out.println("The point A is in II quadrant");
        }
        else if(resultX < 0 && resultY < 0){
            System.out.println("The point A is in III quadrant");
        }
        else {
            System.out.println("The point A is the origin");
        }
    }
}
