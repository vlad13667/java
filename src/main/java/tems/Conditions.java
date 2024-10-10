package tems;

public class Conditions {

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


}
