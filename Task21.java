package by.ld.hw.conditions;

import java.util.Scanner;

/**
 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М».
 * В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся
 * мальчики!»
 */

public class Task21 {
    public static void main(String[] args) {

        Scanner scanner;
        char input;

        // Getting user's input
        scanner = new Scanner(System.in);
        System.out.println("Кто ты, мальчик или девочка? Введи Д или М");
        input = scanner.nextLine().toUpperCase().charAt(0);


        // output
        switch (input){
            case 'Д':
                System.out.println("Мне нравятся девочки!");
                break;
            case 'М':
                System.out.println("Мне нравятся мальчики!");
                break;
            default:
                break;
        }
    }
}
