package tems;

import java.util.stream.IntStream;

public class ArraysCustom {
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


}
