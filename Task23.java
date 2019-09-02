package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Определить правильность даты, введенной с клавиатуры (число — от 1 до 31, месяц — от 1 до 12). Если
 * введены некорректные данные, то сообщить об этом.
 */

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner;
        int day = 0;
        int month = 0;
        int year = 0;
        String inputDate;
        String[] dateArray;

        // getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Please enter the date in DD/MM/YYYY format: ");
        inputDate = scanner.nextLine();

        //parse it into array of strings
        dateArray = new String[3];
        dateArray = inputDate.split("/");

        //convert to int and assing to fields
        day = Integer.parseInt(dateArray[0]);
        month = Integer.parseInt(dateArray[1]);
        year = Integer.parseInt(dateArray[2]);

        if(day < 0 || day > 31 || month < 0 || month > 12 || year < 0){
            System.out.println("You entered incorrect date. Please try again");
        }





    }
}
