package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число
 * а меньше 3; если больше, то вывести слово «no».
 */

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = scanner.nextInt();
        if(a < 3){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
