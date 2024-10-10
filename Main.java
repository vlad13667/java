package org.example;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Main {

    public static void  main(String[] args) {
    Main laba1 = new Main();
        laba1.laba1();
    }

    public  void  laba1() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите задание:");
            System.out.println("1. Массивы");
            System.out.println("2. Условия");
            System.out.println("3. Циклы");
            System.out.println("4. Методы");
            System.out.println("5. Выход");

            int choice = readInt("");
            clearConsole();
            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали задание по массивам");
                    arrays(scanner);
                    break;
                case 2:
                    // Задание по условиям
                    System.out.println("Вы выбрали задание по условиям");
                    conditions(scanner);
                    break;
                case 3:
                    // Задание по циклам
                    System.out.println("Вы выбрали задание по циклам");
                    cycles(scanner);
                    // Добавьте здесь реализацию задания по циклам
                    break;
                case 4:
                    // Задание по методам
                    methods(scanner);
                    break;
                case 5:
                    System.out.println("Выход...");
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }

    public void methods(Scanner scanner) {
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

            int methodChoice = readInt("");
            clearConsole();

            Object input;
            switch (methodChoice) {
                case 1:
                    x_double = readDouble("x");
                    System.out.println("Дробная часть числа:" + fraction(x_double));
                    pressEnterToContinue();
                    break;
                case 2:
                    x_int = readInt("x");
                    System.out.println("Сумма последних двух цифр числа:" + sumLastNums(x_int));
                    pressEnterToContinue();
                    break;
                case 3:
                    System.out.println("Введите символ:");
                    input = scanner.next().charAt(0);
                    System.out.println("Число, соответствующее символу:" + charToNum((char) input));
                    pressEnterToContinue();
                    break;
                case 4:
                    x_int = readInt("x");
                    System.out.println("Число является положительным:" + isPositive( x_int));
                    pressEnterToContinue();
                    break;
                case 5:
                    x_int = readInt("x");
                    System.out.println("Число является двузначным:" + is2Digits(x_int));
                    pressEnterToContinue();
                    break;
                case 6:
                    System.out.println("Введите символ:");
                    input = scanner.next().charAt(0);
                    System.out.println("Символ является верхним регистром:" + isUpperCase((char) input));
                    pressEnterToContinue();
                    break;
                case 7:
                    System.out.println("Введите диапазон (x, y) и число z:");
                    x_int = readInt("x");
                    y_int = readInt("y");
                    z_int = readInt("z");

                    System.out.println("Число принадлежит диапазону:" + isInRange(x_int, y_int, z_int));
                    pressEnterToContinue();
                    break;
                case 8:
                    System.out.println("Введите два числа:");
                    x_int = readInt("x");
                    y_int = readInt("y");
                    System.out.println("Число " + x_int + " делится на " + y_int + " без остатка:" + isDivisor(x_int, y_int));
                    pressEnterToContinue();
                    break;
                case 9:
                    System.out.println("Введите три числа:");
                    x_int = readInt("x");
                    y_int = readInt("y");
                    z_int = readInt("z");
                    System.out.println("Числа равны:" + isEqual(x_int, y_int, z_int));
                    pressEnterToContinue();
                    break;
                case 10:
                    System.out.println("Введите два числа:");
                    x_int = readInt("x");
                    y_int = readInt("y");
                    System.out.println("Сумма последних цифр двух чисел:" + lastNumSum(x_int, y_int));
                    pressEnterToContinue();
                    break;
                case 11:
                    System.out.println("Выход из меню методов...");
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }

    public void cycles(Scanner scanner) {
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

            int choice = readInt("");
            clearConsole();
            switch (choice) {
                case 1:
                    x_int = readInt("x");
                    System.out.println(listNums(x_int));
                    pressEnterToContinue();
                    break;
                case 2:
                    x_int = readInt("x");
                    System.out.println(reverseListNums(x_int));
                    pressEnterToContinue();
                    break;
                case 3:
                    x_int = readInt("x");
                    System.out.println(chet(x_int));
                    pressEnterToContinue();
                    break;
                case 4:
                    x_int = readInt("x");
                    y_int = readInt("y");
                    System.out.println(pow(x_int, y_int));
                    pressEnterToContinue();
                    break;
                case 5:
                    System.out.println( "Введите элемент x: ");
                    long num = scanner.nextLong();
                    System.out.println("длина числа:" + numLen(num));
                    pressEnterToContinue();
                    break;
                case 6:
                    x_int = readInt("x");
                    System.out.println( "число состоит из одинаковых цифр:" + equalNum(x_int));
                    pressEnterToContinue();
                    break;
                case 7:
                    x_int = readInt("x");
                    square(x_int);
                    pressEnterToContinue();
                    break;
                case 8:
                    x_int = readInt("x");
                    leftTriangle(x_int);
                    pressEnterToContinue();
                    break;
                case 9:
                    x_int = readInt("x");
                    rightTriangle(x_int);
                    pressEnterToContinue();
                    break;
                case 10:
                    guessGame();
                    pressEnterToContinue();
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }

    public void conditions(Scanner scanner){
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
            int conditionChoice = readInt("");
            clearConsole();
            switch (conditionChoice) {
                case 1:
                    x_int = readInt("x");
                    System.out.println("Модуль числа:" + abs(x_int));
                    pressEnterToContinue();
                    break;
                case 2:
                    System.out.println("Введите два числа x и y:");
                    x_int = readInt("x");
                    y_int = readInt("y");
                    System.out.println("Безопасное деление:" + safeDiv(x_int, y_int));
                    pressEnterToContinue();
                    break;
                case 3:
                    x_int = readInt("x");
                    System.out.println("Делится на 3 или 5:" + is35((int) x_int));
                    pressEnterToContinue();
                    break;
                case 4:
                    System.out.println("Введите два числа x и y:");
                    x_int = readInt("x");
                    y_int = readInt("y");
                    System.out.println("Сравнение чисел:"+ makeDecision(x_int, y_int));
                    pressEnterToContinue();
                    break;
                case 5:
                    System.out.println("Введите три числа x, y, z:");
                    x_int = readInt("x");
                    y_int = readInt("y");
                    z_int = readInt("z");
                    System.out.println("Максимум из трех чисел:" +  max3(x_int, y_int, z_int));
                    pressEnterToContinue();
                    break;
                case 6:
                    System.out.println("Введите три числа x, y, z:");
                    x_int = readInt("x");
                    y_int = readInt("y");
                    z_int = readInt("z");
                    System.out.println("Сумма трех чисел:" + sum3(x_int, y_int, z_int));
                    pressEnterToContinue();
                    break;
                case 7:
                    System.out.println("Введите два числа x и y:");
                    x_int = readInt("x");
                    y_int = readInt("y");
                    System.out.println("Сумма двух чисел:" + sum2(x_int, y_int));
                    pressEnterToContinue();
                    break;
                case 8:

                    x_int = readInt("возраст");
                    System.out.println("Возраст:" + age(x_int));
                    pressEnterToContinue();
                    break;
                case 9:

                    x_int = readInt("день недели(числом)");
                    System.out.println("День недели:" + day(x_int));
                    pressEnterToContinue();
                    break;
                case 10:
                    System.out.println("Введите день недели(словом):");
                    String day = scanner.next();
                    printDays(day);
                    pressEnterToContinue();
                    break;
                case 11:
                    System.out.println("Выход из меню условий...");
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }

    public void arrays(Scanner scanner) {
        while (true) {
            System.out.println("Выберите метод для массивов:");
            System.out.println("1. Найти первый элемент равный x");
            System.out.println("2. Найти последний элемент равный x");
            System.out.println("3. Найти максимальный элемент по модулю");
            System.out.println("4. Добавить элемент в массив");
            System.out.println("5. Добавить массив в массив");
            System.out.println("6. Реверс массива");
            System.out.println("7. Реверс массива (второй способ)");
            System.out.println("8. Объединение");
            System.out.println("9. Найти все элементы равные x");
            System.out.println("10. Удалить отрицательные элементы");
            System.out.println("11. Назад");
            int arrayChoice = readInt("");
            clearConsole();
            int[] array, array2,result;
            int x_int, pos;
            switch (arrayChoice) {
                case 1:

                    array = readArrayFromConsole();
                    x_int = readInt("x");
                    System.out.println("Первый элемент равный " + x_int + " стоит на позиции: " + findFirst(array, x_int));
                    pressEnterToContinue();
                    break;
                case 2:
                    array = readArrayFromConsole();
                    x_int = readInt("x");
                    System.out.println("Последний элемент равный " + x_int + " стоит на позиции: " + findLast(array, x_int));
                    pressEnterToContinue();
                    break;
                case 3:
                    array = readArrayFromConsole();
                    System.out.println("Максимальный элемент по модулю: " + maxAbs(array));
                    pressEnterToContinue();
                    break;
                case 4:
                    array = readArrayFromConsole();
                    x_int = readInt("x");
                    pos = readInt("pos");
                    result = add(array, x_int, pos);
                    System.out.println("Массив после добавления элемента: " + Arrays.toString(result));
                    pressEnterToContinue();
                    break;
                case 5:

                    array = readArrayFromConsole();
                    System.out.println("массив для добавления");
                    array2 = readArrayFromConsole();
                    pos = readInt("pos");
                    result = add(array, array2, pos);
                    System.out.println("Массив после добавления массива: " + Arrays.toString(result));
                    pressEnterToContinue();
                    break;
                case 6:
                    array = readArrayFromConsole();
                    reverse(array);
                    System.out.println("Массив после разворота: " + Arrays.toString(array));
                    pressEnterToContinue();
                    break;
                case 7:
                    array = readArrayFromConsole();
                    result = reverseBack(array);
                    System.out.println("Массив после разворота (второй способ): " + Arrays.toString(result));
                    pressEnterToContinue();
                    break;
                case 8:
                    System.out.println("Введите два массива:");
                    array = readArrayFromConsole();
                    array2 = readArrayFromConsole();
                    result = concat(array, array2);
                    System.out.println("Конкатенация массивов: " + Arrays.toString(result));
                    pressEnterToContinue();
                    break;
                case 9:

                    array = readArrayFromConsole();
                    x_int = readInt("x");
                    result = findAll(array, x_int);
                    System.out.println("Все элементы равные " + x_int + ": " + Arrays.toString(result));
                    pressEnterToContinue();
                    break;
                case 10:
                    array = readArrayFromConsole();
                    result = deleteNegative(array);
                    System.out.println("Массив после удаления отрицательных элементов: " + Arrays.toString(result));
                    pressEnterToContinue();
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        }
    }

    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int findLast(int[] arr, int x) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > max) {
                max = Math.abs(arr[i]);
            }
        }
        return max;
    }

    public int[] add(int[] arr, int x, int pos) {
        if (pos > arr.length) {
            throw new IndexOutOfBoundsException("Позиция " + pos + " вне границ массива длиной " + arr.length);
        }
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        result[pos] = x;
        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }
        return result;
    }

    public int[] add(int[] arr, int[] ins, int pos) {
        if (pos > arr.length) {
            throw new IndexOutOfBoundsException("Позиция " + pos + " вне границ массива длиной " + arr.length);
        }

        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[pos + ins.length + i - pos] = arr[i];
        }
        return result;
    }

    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - i - 1];
        }
        return result;
    }

    public int[] concat(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0, arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        return result;
    }

    public int[] findAll(int[] arr, int x) {
        return IntStream.range(0, arr.length)
                .filter(i -> arr[i] == x)
                .toArray();
    }

    public int[] deleteNegative(int[] arr) {
        return IntStream.of(arr)
                .filter(element -> element >= 0)
                .toArray();
    }


    public int abs(int x) {
        return x < 0 ? -x : x;
    }

    public double safeDiv(int x, int y) {
        if (y == 0) return 0;
        return (double) x / y;
    }

    public boolean is35(int x) {
        if (x % 3 == 0) {
            return x % 5 != 0;
        } else {
            return x % 5 == 0;
        }
    }

    public String makeDecision(int x, int y) {
        if (x > y) return x + " > " + y;
        else if (x < y) return x + " < " + y;
        else return x + " = " + y;
    }

    public int max3(int x, int y, int z) {
        return (x > y) ? (x > z) ? x : z : (y > z) ? y : z;
    }


    public boolean sum3(int x, int y, int z) {
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    public int sum2(int x, int y) {
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    public String age(int x) {
        if (x % 10 == 1 && x % 100 != 11) {
            return x + " год";
        } else if (x % 10 >= 2 && x % 10 <= 4 && (x % 100 < 10 || x % 100 >= 20)) {
            return x + " года";
        } else {
            return x + " лет";
        }
    }

    public String day(int x) {
        switch (x) {
            case 1:
                return "Понедельник";
            case 2:
                return "Вторник";
            case 3:
                return "Среда";
            case 4:
                return "Четверг";
            case 5:
                return "Пятница";
            case 6:
                return "Суббота";
            case 7:
                return "Воскресенье";
            default:
                return "это не день недели";
        }
    }

    public void printDays(String x) {
        String[] days = {"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье"};
        int index = -1;

        switch (x) {
            case "понедельник":
                index = 0;
                break;
            case "вторник":
                index = 1;
                break;
            case "среда":
                index = 2;
                break;
            case "четверг":
                index = 3;
                break;
            case "пятница":
                index = 4;
                break;
            case "суббота":
                index = 5;
                break;
            case "воскресенье":
                index = 6;
                break;
            default:
                System.out.println("это не день недели");
                return;
        }

        for (int i = index; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }


    public double fraction(double x) {
        String strX = String.valueOf(x);
        int decimalIndex = strX.indexOf('.');
        int decimalPlaces = strX.length() - decimalIndex - 1;

        double result = x % 1;
        return round(result, decimalPlaces);
    }

    private double round(double value, int decimalPlaces) {
        double multiplier = Math.pow(10, decimalPlaces);
        return Math.round(value * multiplier) / multiplier;
    }

    public int sumLastNums(int x) {
        int lastTwoDigits = Math.abs(x) % 100;
        return (lastTwoDigits / 10) + (lastTwoDigits % 10);
    }


    public int charToNum(char x) {
        return x - '0';
    }

    public boolean isPositive(int x) {
        return x > 0;
    }

    public boolean is2Digits(int x) {
        int absX = Math.abs(x);
        return absX >= 10 && absX <= 99;
    }

    public boolean isUpperCase(char x) {
        return Character.isUpperCase(x);
    }

    public boolean isInRange(int a, int b, int num) {
        if (a <= b) {
            return num >= a && num <= b;
        } else {
            return num >= b && num <= a;
        }
    }


    public boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            throw new ArithmeticException("На 0 делить нельзя");
        }
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        return max % min == 0;
    }


    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    public int lastNumSum(int a, int b) {
        return Math.abs(a) % 10 + Math.abs(b) % 10;
    }

    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public String reverseListNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }

    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString().trim();

    }

    public int pow(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public int numLen(long x) {
        if (x == 0) {
            return 1;
        }

        int length = 0;
        if (x < 0) {
            x = -x;
        }

        while (x > 0) {
            x /= 10;
            length++;
        }

        return length;
    }

    public boolean equalNum(int x) {
        int firstDigit = x % 10;
        int a = x / 10;
        while (a > 0) {
            if (a % 10 != firstDigit) {
                return false;
            }
            a /= 10;
        }
        return true;
    }

    public void square(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print("*");
            }
            System.out.println('\n');
        }
    }

    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println('\n');
        }
    }

    public void rightTriangle(int x) {
        for (int i = 0; i <= x; i++) {
            for (int j = 1; j <= x - i; j++) {
                System.out.print("*");
            }
            System.out.println('\n');
        }
    }

    public  void guessGame() {
        Random random = new Random();
        int secretNumber = random.nextInt(10);
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число от 0 до 9: ");
            int userNumber = scanner.nextInt();
            attempts++;

            if (userNumber == secretNumber) {
                System.out.println("Поздравляем! Вы угадали число!");
                System.out.println("Количество попыток: " + attempts);
                break;
            } else if (userNumber < secretNumber) {
                System.out.println("Ваше число меньше загаданного. Попробуйте еще раз.");
            } else {
                System.out.println("Ваше число больше загаданного. Попробуйте еще раз.");
            }
        }
    }






    public static void pressEnterToContinue( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Нажмите Enter чтобы продолжить...");
        scanner.nextLine();
    }
    public static int readInt(String identifier) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите элемент " + identifier + ": ");
            if (scanner.hasNextInt()) {
                int x_int = scanner.nextInt();
                scanner.nextLine(); // Чтобы очистить буфер
                return x_int;
            } else {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
                scanner.nextLine(); // Чтобы очистить буфер
            }
        }
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

