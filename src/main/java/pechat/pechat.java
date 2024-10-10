package pechat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class pechat {

    public static void pressEnterToContinue( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите Enter чтобы продолжить...");
        scanner.nextLine();
    }
    public static int readInt(String identifier) {
        System.out.println("Введите элемент " + identifier + ": ");
        Scanner scanner = new Scanner(System.in);
        int x_int = scanner.nextInt();
        return x_int;
    }
    public static Double readDouble(String identifier) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Введите элемент " + identifier + ": ");
                double x_int = scanner.nextDouble();
                return x_int;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите число:");
                scanner.next();
            }
        }
    }

    public static int[] readArrayFromConsole() {
        while (true) {
            System.out.println("Введите массив(элементы массива через пробел):");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            String[] strings = input.split(" ");
            int[] array = new int[strings.length];

            boolean isValid = true;

            for (int i = 0; i < strings.length; i++) {
                try {
                    array[i] = Integer.parseInt(strings[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод. Пожалуйста, введите числа через пробел.");
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                if (array.length == 0) {
                    System.out.println("Массив пуст. Пожалуйста, введите хотя бы одно число.");
                    continue;
                }

                return array;
            }
        }
    }
    public static void clearConsole() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
    }

}
