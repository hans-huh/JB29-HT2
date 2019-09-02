package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Написать программу, которая по паролю будет определять уровень доступа сотрудника к секретной
 * информации в базе данных. Доступ к базе имеют только шесть человек, разбитых на три группы по степени
 * доступа. Они имеют следующие пароли: 9583, 1747 — доступны модули баз А, В, С; 3331, 7922 — доступны
 * модули баз В, С; 9455, 8997 — доступен модуль базы С.
 */

public class Task33 {
    public static void main(String[] args) {

        Scanner scanner;
        String password;

        // Getting password from the users
        scanner = new Scanner(System.in);
        System.out.println("Enter your password: ");
        password = scanner.nextLine();

        switch (password){
            case("9583"):
                System.out.println("Granted access to A,B,C");
                break;
            case("1747"):
                System.out.println("Granted access to A,B,C");
                break;
            case("3331"):
                System.out.println("Granted access to B,C");
                break;
            case("7922"):
                System.out.println("Granted access to B,C");
                break;
            case("9455"):
                System.out.println("Granted access to C");
                break;
            case("8997"):
                System.out.println("Granted access to C");
                break;
            default:
                System.out.println("You have no access to this data!");
                break;
        }
    }
}
