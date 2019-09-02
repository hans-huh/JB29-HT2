package by.ld.hw.conditions;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Вычислить число и месяц в невисокосном году по номеру дня.
 */

public class Task35 {
    public static void main(String[] args) {

        Scanner scanner;
        int day = 0; // the day of a non-leap year
        int month = 1;
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String monthInText = "";


        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Please enter the number of a day");
        day = scanner.nextInt();
        if(day > 365){
            System.out.println("You have entered incorrect number!");
            System.exit(0);
        }
        for(int i = 0; i < months.length; i++){
            if(day > months[i]){
                day -= months[i];
                month++;
            } else {
                break;
            }
        }

        switch (month){
            case(1):
                monthInText = "January";
                break;
            case(2):
                monthInText = "February";
                break;
            case(3):
                monthInText = "March";
                break;
            case(4):
                monthInText = "April";
                break;
            case(5):
                monthInText = "May";
                break;
            case(6):
                monthInText = "June";
                break;
            case(7):
                monthInText = "July";
                break;
            case(8):
                monthInText = "August";
                break;
            case(9):
                monthInText = "September";
                break;
            case(10):
                monthInText = "October";
                break;
            case(11):
                monthInText = "November";
                break;
            case(12):
                monthInText = "December";
                break;
        }
        System.out.println("It is " + monthInText + ", " + day);


    }

}
