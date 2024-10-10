package menu;

import java.util.Scanner;

import tems.Cycles;

import pechat.pechat;

public class cyclesMenu {

    public static void cycles(Scanner scanner, Cycles cycles) {
        int x_int, y_int;
        while (true) {
            System.out.println("Выберите задание по циклам:");
            System.out.println("1. Числа подряд");
            System.out.println("2. Числа наоборот");
            System.out.println("3. Вывести четные числа от 0 до x");
            System.out.println("4. Возвести число x в степень y");
            System.out.println("5. Вывести длину числа x");
            System.out.println("6. Проверить, состоит ли число x из одинаковых цифр");
            System.out.println("7. Вывести квадрат из x строк");
            System.out.println("8. Вывести левый треугольник из x строк");
            System.out.println("9. Вывести правый треугольник из x строк");
            System.out.println("10. Игра 'Угадай число'");
            System.out.println("11. Назад");

            int choice = scanner.nextInt();
            pechat.clearConsole();
            switch (choice) {
                case 1:
                    x_int = pechat.readInt("x");
                    System.out.println(cycles.listNums(x_int));
                    pechat.pressEnterToContinue();
                    break;
                case 2:
                    x_int = pechat.readInt("x");
                    System.out.println(cycles.reverseListNums(x_int));
                    pechat.pressEnterToContinue();
                    break;
                case 3:
                    x_int = pechat.readInt("x");
                    System.out.println(cycles.chet(x_int));
                    pechat.pressEnterToContinue();
                    break;
                case 4:
                    x_int = pechat.readInt("x");
                    y_int = pechat.readInt("y");
                    System.out.println(cycles.pow(x_int, y_int));
                    pechat.pressEnterToContinue();
                    break;
                case 5:
                    System.out.println( "Введите элемент x: ");
                    long num = scanner.nextLong();
                    System.out.println("длина числа:" + cycles.numLen(num));
                    pechat.pressEnterToContinue();
                    break;
                case 6:
                    x_int = pechat.readInt("x");
                    System.out.println( "число состоит из одинаковых цифр:" + cycles.equalNum(x_int));
                    pechat.pressEnterToContinue();
                    break;
                case 7:
                    x_int = pechat.readInt("x");
                    cycles.square(x_int);
                    pechat.pressEnterToContinue();
                    break;
                case 8:
                    x_int = pechat.readInt("x");
                    cycles.leftTriangle(x_int);
                    pechat.pressEnterToContinue();
                    break;
                case 9:
                    x_int = pechat.readInt("x");
                    cycles.rightTriangle(x_int);
                    pechat.pressEnterToContinue();
                    break;
                case 10:
                    cycles.guessGame();
                    pechat.pressEnterToContinue();
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }
}