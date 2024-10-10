package tems;

import java.util.Random;
import java.util.Scanner;

public class Cycles {


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

    public static void guessGame() {
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
}
