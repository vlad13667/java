package menu;

import tems.ArraysCustom;
import  pechat.pechat;

import java.util.Arrays;
import java.util.Scanner;

public class arraysMenu {
    public static void arrays(Scanner scanner, ArraysCustom arrays) {
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
                int arrayChoice = scanner.nextInt();
                pechat.clearConsole();
                int[] array, array2,result;
                int x_int, pos;
                switch (arrayChoice) {
                    case 1:

                        array = pechat.readArrayFromConsole();
                        x_int = pechat.readInt("x");
                        System.out.println("Первый элемент равный " + x_int + " стоит на позиции: " + arrays.findFirst(array, x_int));
                        pechat.pressEnterToContinue();
                        break;
                    case 2:
                        array = pechat.readArrayFromConsole();
                        x_int = pechat.readInt("x");
                        System.out.println("Последний элемент равный " + x_int + " стоит на позиции: " + arrays.findLast(array, x_int));
                        pechat.pressEnterToContinue();
                        break;
                    case 3:
                        array = pechat.readArrayFromConsole();
                        System.out.println("Максимальный элемент по модулю: " + arrays.maxAbs(array));
                        pechat.pressEnterToContinue();
                        break;
                    case 4:
                        array = pechat.readArrayFromConsole();
                        x_int = pechat.readInt("x");
                        pos = pechat.readInt("pos");
                        result = arrays.add(array, x_int, pos);
                        System.out.println("Массив после добавления элемента: " + Arrays.toString(result));
                        pechat.pressEnterToContinue();
                        break;
                    case 5:

                        array = pechat.readArrayFromConsole();
                        System.out.println("массив для добавления");
                        array2 = pechat.readArrayFromConsole();
                        pos = pechat.readInt("pos");
                        result = arrays.add(array, array2, pos);
                        System.out.println("Массив после добавления массива: " + Arrays.toString(result));
                        pechat.pressEnterToContinue();
                        break;
                    case 6:
                        array = pechat.readArrayFromConsole();
                        arrays.reverse(array);
                        System.out.println("Массив после разворота: " + Arrays.toString(array));
                        pechat.pressEnterToContinue();
                        break;
                    case 7:
                        array = pechat.readArrayFromConsole();
                        result = arrays.reverseBack(array);
                        System.out.println("Массив после разворота (второй способ): " + Arrays.toString(result));
                        pechat.pressEnterToContinue();
                        break;
                    case 8:
                        System.out.println("Введите два массива:");
                        array = pechat.readArrayFromConsole();
                        array2 = pechat.readArrayFromConsole();
                        result = arrays.concat(array, array2);
                        System.out.println("Конкатенация массивов: " + Arrays.toString(result));
                        pechat.pressEnterToContinue();
                        break;
                    case 9:

                        array = pechat.readArrayFromConsole();
                        x_int = pechat.readInt("x");
                        result = arrays.findAll(array, x_int);
                        System.out.println("Все элементы равные " + x_int + ": " + Arrays.toString(result));
                        pechat.pressEnterToContinue();
                        break;
                    case 10:
                        array = pechat.readArrayFromConsole();
                        result = arrays.deleteNegative(array);
                        System.out.println("Массив после удаления отрицательных элементов: " + Arrays.toString(result));
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
