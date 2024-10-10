package menu;

import tems.Conditions;

import java.util.Scanner;
import  pechat.pechat;
public class conditionsMenu {
    public static void conditions(Scanner scanner, Conditions conditions){
    int x_int, y_int, z_int;
        while (true) {
        System.out.println("Выберите условие:");
        System.out.println("1. Модуль числа");
        System.out.println("2. Безопасное деление");
        System.out.println("3. Тридцать пять");
        System.out.println("4. Сравнение чисел");
        System.out.println("5. Максимум из трех чисел");
        System.out.println("6. Сумма трех чисел");
        System.out.println("7. Сумма двух чисел");
        System.out.println("8. Возраст");
        System.out.println("9. День недели");
        System.out.println("10. Вывод дней недели");
        System.out.println("11. Назад");
        int conditionChoice = scanner.nextInt();
            pechat.clearConsole();
        switch (conditionChoice) {
            case 1:
                x_int = pechat.readInt("x");
                System.out.println("Модуль числа:" + conditions.abs(x_int));
                pechat.pressEnterToContinue();
                break;
            case 2:
                System.out.println("Введите два числа x и y:");
                x_int = pechat.readInt("x");
                y_int = pechat.readInt("y");
                System.out.println("Безопасное деление:" + conditions.safeDiv(x_int, y_int));
                pechat.pressEnterToContinue();
                break;
            case 3:
                x_int = pechat.readInt("x");
                System.out.println("Делится на 3 или 5:" + conditions.is35((int) x_int));
                pechat.pressEnterToContinue();
                break;
            case 4:
                System.out.println("Введите два числа x и y:");
                x_int = pechat.readInt("x");
                y_int = pechat.readInt("y");
                System.out.println("Сравнение чисел:"+ conditions.makeDecision(x_int, y_int));
                pechat.pressEnterToContinue();
                break;
            case 5:
                System.out.println("Введите три числа x, y, z:");
                x_int = pechat.readInt("x");
                y_int = pechat.readInt("y");
                z_int = pechat.readInt("z");
                System.out.println("Максимум из трех чисел:" +  conditions.max3(x_int, y_int, z_int));
                pechat.pressEnterToContinue();
                break;
            case 6:
                System.out.println("Введите три числа x, y, z:");
                x_int = pechat.readInt("x");
                y_int = pechat.readInt("y");
                z_int = pechat.readInt("z");
                System.out.println("Сумма трех чисел:" + conditions.sum3(x_int, y_int, z_int));
                pechat.pressEnterToContinue();
                break;
            case 7:
                System.out.println("Введите два числа x и y:");
                x_int = pechat.readInt("x");
                y_int = pechat.readInt("y");
                System.out.println("Сумма двух чисел:" + conditions.sum2(x_int, y_int));
                pechat.pressEnterToContinue();
                break;
            case 8:

                x_int = pechat.readInt("возраст");
                System.out.println("Возраст:" + conditions.age(x_int));
                pechat.pressEnterToContinue();
                break;
            case 9:

                x_int = pechat.readInt("день недели(числом)");
                System.out.println("День недели:" + conditions.day(x_int));
                pechat.pressEnterToContinue();
                break;
            case 10:
                System.out.println("Введите день недели(словом):");
                String day = scanner.next();
                conditions.printDays(day);
                pechat.pressEnterToContinue();
                break;
            case 11:
                System.out.println("Выход из меню условий...");
                return;
            default:
                System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
        }
    }
    }
}
