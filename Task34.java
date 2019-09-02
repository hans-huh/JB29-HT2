package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу, реализующую эпизод применения компьютера в книжном магазине. Компьютер
 * запрашивает стоимость книг, сумму денег, внесенную покупателем; если сдачи не требуется, печатает на
 * экране «спасибо»; если денег внесено больше, чем необходимо, то печатает «возьмите сдачу» и указывает
 * сумму сдачи; если денег недостаточно, то печатает сообщение об этом и указывает размер недостающей
 * суммы.
 */

public class Task34 {
    public static void main(String[] args) {

        Scanner scanner;
        double cost = 0;
        double money = 0;
        double change = 0;
        int result = 0; // This field is used to store the result of Double.compare method

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Enter the cost of the books: ");
        cost = scanner.nextDouble();
        System.out.println("Enter your customer's money: ");
        money = scanner.nextDouble();
        change = cost - money;
        result = Double.compare(change, 0);
        if(result < 0){ // customer gave more than the cost of the books
            System.out.println("Change: " + Math.abs(change));
        } else if(result > 0){
            System.out.println("Not enough. The customer needs to add " + String.format("%.2f", change) + " roubles");
        } else {
            System.out.println("Thank you!");
        }



    }
}
