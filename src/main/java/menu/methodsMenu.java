package menu;

import tems.Methods;
import  pechat.pechat;
import java.util.Scanner;

public class methodsMenu {
    public static void methods(Scanner scanner, Methods methods) {
        double x_double;
        int x_int, y_int, z_int;
        while (true) {
            System.out.println("Выберите метод:");
            System.out.println("1. Дробная часть числа");
            System.out.println("2. Сумма последних двух цифр числа");
            System.out.println("3. Букву в число");
            System.out.println("4. Есть ли позитив");
            System.out.println("5. Двузначное");
            System.out.println("6. Большая буква");
            System.out.println("7. Диапазон");
            System.out.println("8. Делитель");
            System.out.println("9. Равенство.");
            System.out.println("10. Многократный вызовй");
            System.out.println("11. Назад");

            int methodChoice = scanner.nextInt();
            pechat.clearConsole();

            Object input;
            switch (methodChoice) {
                case 1:
                    x_double = pechat.readDouble("x");
                    System.out.println("Дробная часть числа:" + methods.fraction(x_double));
                    pechat.pressEnterToContinue();
                    break;
                case 2:
                    x_int = pechat.readInt("x");
                    System.out.println("Сумма последних двух цифр числа:" + methods.sumLastNums(x_int));
                    pechat.pressEnterToContinue();
                    break;
                case 3:
                    System.out.println("Введите символ:");
                    input = scanner.next().charAt(0);
                    System.out.println("Число, соответствующее символу:" + methods.charToNum((char) input));
                    pechat.pressEnterToContinue();
                    break;
                case 4:
                    x_int = pechat.readInt("x");
                    System.out.println("Число является положительным:" + methods.isPositive( x_int));
                    pechat.pressEnterToContinue();
                    break;
                case 5:
                    x_int = pechat.readInt("x");
                    System.out.println("Число является двузначным:" + methods.is2Digits(x_int));
                    pechat.pressEnterToContinue();
                    break;
                case 6:
                    System.out.println("Введите символ:");
                    input = scanner.next().charAt(0);
                    System.out.println("Символ является верхним регистром:" + methods.isUpperCase((char) input));
                    pechat.pressEnterToContinue();
                    break;
                case 7:
                    System.out.println("Введите диапазон (x, y) и число z:");
                    x_int = pechat.readInt("x");
                    y_int = pechat.readInt("y");
                    z_int = pechat.readInt("z");

                    System.out.println("Число принадлежит диапазону:" + methods.isInRange(x_int, y_int, z_int));
                    pechat.pressEnterToContinue();
                    break;
                case 8:
                    System.out.println("Введите два числа:");
                    x_int = pechat.readInt("x");
                    y_int = pechat.readInt("y");
                    System.out.println("Число " + x_int + " делится на " + y_int + " без остатка:" + methods.isDivisor(x_int, y_int));
                    pechat.pressEnterToContinue();
                    break;
                case 9:
                    System.out.println("Введите три числа:");
                    x_int = pechat.readInt("x");
                    y_int = pechat.readInt("y");
                    z_int = pechat.readInt("z");
                    System.out.println("Числа равны:" + methods.isEqual(x_int, y_int, z_int));
                    pechat.pressEnterToContinue();
                    break;
                case 10:
                    System.out.println("Введите два числа:");
                    x_int = pechat.readInt("x");
                    y_int = pechat.readInt("y");
                    System.out.println("Сумма последних цифр двух чисел:" + methods.lastNumSum(x_int, y_int));
                    pechat.pressEnterToContinue();
                    break;
                case 11:
                    System.out.println("Выход из меню методов...");
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }
}
