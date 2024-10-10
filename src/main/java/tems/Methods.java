package tems;

public class Methods {

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

}
