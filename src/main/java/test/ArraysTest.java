package test;

import org.junit.Before;
import org.junit.Test;
import tems.ArraysCustom;

import static org.junit.Assert.*;

public class ArraysTest {
    private ArraysCustom arrays;

    @Before
    public void setUp() {
        arrays = new ArraysCustom();
    }

    @Test
    public void testFindFirstElementFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int result = arrays.findFirst(arr, x);
        assertEquals(2, result);
    }

    @Test
    public void testFindFirstElementNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int result = arrays.findFirst(arr, x);
        assertEquals(-1, result);
    }

    @Test
    public void testFindFirstEmptyArray() {
        int[] arr = {};
        int x = 3;
        int result = arrays.findFirst(arr, x);
        assertEquals(-1, result);
    }

    @Test
    public void testFindFirstArrayWithDuplicates() {
        int[] arr = {1, 2, 3, 3, 4, 5};
        int x = 3;
        int result = arrays.findFirst(arr, x);
        assertEquals(2, result);
    }

    @Test
    public void testFindLastElementFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int result = arrays.findLast(arr, x);
        assertEquals(2, result);
    }


    @Test
    public void testFindLastEmptyArray() {
        int[] arr = {};
        int x = 3;
        int result = arrays.findLast(arr, x);
        assertEquals(-1, result);
    }

    @Test
    public void testFindLastArrayWithDuplicates() {
        int[] arr = {1, 2, 3, 3, 4, 5};
        int x = 3;
        int result = arrays.findLast(arr, x);
        assertEquals(3, result);
    }

    @Test
    public void testFindLastElementAtEnd() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 5;
        int result = arrays.findLast(arr, x);
        assertEquals(4, result);
    }

    @Test
    public void testMaxAbsPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        int result = arrays.maxAbs(arr);
        assertEquals(5, result);
    }

    @Test
    public void testMaxAbsNegativeNumbers() {
        int[] arr = {-1, -2, -3, -4, -5};
        int result = arrays.maxAbs(arr);
        assertEquals(5, result);
    }

    @Test
    public void testMaxAbsMixedNumbers() {
        int[] arr = {-1, 2, -3, 4, -5};
        int result = arrays.maxAbs(arr);
        assertEquals(5, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testMaxAbsEmptyArray() {
        int[] arr = {};
        arrays.maxAbs(arr);
    }

    @Test
    public void testMaxAbsSingleElementArray() {
        int[] arr = {5};
        int result = arrays.maxAbs(arr);
        assertEquals(5, result);
    }

    @Test
    public void testMaxAbsDuplicateMaxValues() {
        int[] arr = {1, 2, 5, 5, 3};
        int result = arrays.maxAbs(arr);
        assertEquals(5, result);
    }

    @Test
    public void testAddElementAtBeginning() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 0;
        int pos = 0;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};
        int[] result = arrays.add(arr, x, pos);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testAddElementAtEnd() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int pos = 5;
        int[] expectedResult = {1, 2, 3, 4, 5, 6};
        int[] result = arrays.add(arr, x, pos);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testAddElementAtMiddle() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int pos = 2;
        int[] expectedResult = {1, 2, 3, 3, 4, 5};
        int[] result = arrays.add(arr, x, pos);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testAddEmptyArray() {
        int[] arr = {};
        int x = 1;
        int pos = 0;
        int[] expectedResult = {1};
        int[] result = arrays.add(arr, x, pos);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testAd_ArrayWithDuplicates() {
        int[] arr = {1, 2, 2, 3, 4, 5};
        int x = 2;
        int pos = 2;
        int[] expectedResult = {1, 2, 2, 2, 3, 4, 5};
        int[] result = arrays.add(arr, x, pos);
        assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testAddAtTheBeginning() {
        int[] arr = {1, 2, 3};
        int[] ins = {4, 5};
        int pos = 0;
        int[] expected = {4, 5, 1, 2, 3};
        int[] result = arrays.add(arr, ins, pos);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAddInTheMiddle() {
        int[] arr = {1, 2, 3};
        int[] ins = {4, 5};
        int pos = 1;
        int[] expected = {1, 4, 5, 2, 3};
        int[] result = arrays.add(arr, ins, pos);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAddAtTheEnd() {
        int[] arr = {1, 2, 3};
        int[] ins = {4, 5};
        int pos = 3;
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = arrays.add(arr, ins, pos);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAddWithEmptyArray() {
        int[] arr = {};
        int[] ins = {4, 5};
        int pos = 0;
        int[] expected = {4, 5};
        int[] result = arrays.add(arr, ins, pos);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testAddWithEmptyInsertionArray() {
        int[] arr = {1, 2, 3};
        int[] ins = {};
        int pos = 1;
        int[] expected = {1, 2, 3};
        int[] result = arrays.add(arr, ins, pos);
        assertArrayEquals(expected, result);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAddWithNegativePosition() {
        int[] arr = {1, 2, 3};
        int[] ins = {4, 5};
        int pos = -1;
        arrays.add(arr, ins, pos);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testAdd_WithPositionGreaterThanArrayLength() {
        int[] arr = {1, 2, 3};
        int[] ins = {4, 5};
        int pos = 4;
        arrays.add(arr, ins, pos);
    }

    @Test
    public void testReverseEmptyArray() {
        int[] arr = new int[0];
        arrays.reverse(arr);
        assertArrayEquals(new int[0], arr);
    }

    @Test
    public void testReverseingleElementArray() {
        int[] arr = {1};
        arrays.reverse(arr);
        assertArrayEquals(new int[]{1}, arr);
    }

    @Test
    public void testReverseEvenLengthArray() {
        int[] arr = {1, 2, 3, 4};
        arrays.reverse(arr);
        assertArrayEquals(new int[]{4, 3, 2, 1}, arr);
    }

    @Test
    public void testReverseBackEmptyArray() {
        int[] arr = new int[0];
        int[] result = arrays.reverseBack(arr);
        assertArrayEquals(new int[0], result);
    }

    @Test
    public void testReverseBackSingleElementArray() {
        int[] arr = {1};
        int[] result = arrays.reverseBack(arr);
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void testReverseBackEvenLengthArray() {
        int[] arr = {1, 2, 3, 4};
        int[] result = arrays.reverseBack(arr);
        assertArrayEquals(new int[]{4, 3, 2, 1}, result);
    }

    @Test
    public void testReverseBackOddLengthArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] result = arrays.reverseBack(arr);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, result);
    }

    @Test(expected = NullPointerException.class)
    public void testReverseBackNullArray() {
        int[] arr = null;
        arrays.reverseBack(arr);
    }

    @Test
    public void testConcatTwoNonEmptyArrays() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] expected = {1, 2, 3, 4, 5, 6};
        int[] result = arrays.concat(arr1, arr2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testConcatFirstArrayEmpty() {
        int[] arr1 = {};
        int[] arr2 = {4, 5, 6};
        int[] expected = {4, 5, 6};
        int[] result = arrays.concat(arr1, arr2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testConcatSecondArrayEmpty() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {};
        int[] expected = {1, 2, 3};
        int[] result = arrays.concat(arr1, arr2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testConcatBothArraysEmpty() {
        int[] arr1 = {};
        int[] arr2 = {};
        int[] expected = {};
        int[] result = arrays.concat(arr1, arr2);
        assertArrayEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testConcatFirstArrayNull() {
        int[] arr1 = null;
        int[] arr2 = {4, 5, 6};
        arrays.concat(arr1, arr2);
    }

    @Test(expected = NullPointerException.class)
    public void testConcatSecondArrayNull() {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = null;
        arrays.concat(arr1, arr2);
    }

    @Test(expected = NullPointerException.class)
    public void testConcatBothArraysNull() {
        int[] arr1 = null;
        int[] arr2 = null;
        arrays.concat(arr1, arr2);
    }

    @Test
    public void testFindAllElementFound() {
        int[] arr = {1, 2, 3, 2, 4, 2, 5};
        int x = 2;
        int[] expected = {1, 3, 5};
        int[] result = arrays.findAll(arr, x);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindAllElementNotFound() {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 6;
        int[] expected = {};
        int[] result = arrays.findAll(arr, x);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindAllArrayEmpty() {
        int[] arr = {};
        int x = 2;
        int[] expected = {};
        int[] result = arrays.findAll(arr, x);
        assertArrayEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testFindAllArrayNull() {
        int[] arr = null;
        int x = 2;
        arrays.findAll(arr, x);
    }

    @Test
    public void testDeleteNegativeArrayWithPositiveAndNegativeNumbers() {
        int[] arr = {-1, 0, 1, -2, 2, -3, 3};
        int[] expected = {0, 1, 2, 3};
        int[] result = arrays.deleteNegative(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDeleteNegativeArrayWithOnlyPositiveNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] result = arrays.deleteNegative(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDeleteNegativeArrayWithOnlyNegativeNumbers() {
        int[] arr = {-1, -2, -3, -4, -5};
        int[] expected = {};
        int[] result = arrays.deleteNegative(arr);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testDeleteNegativeArrayEmpty() {
        int[] arr = {};
        int[] expected = {};
        int[] result = arrays.deleteNegative(arr);
        assertArrayEquals(expected, result);
    }

    @Test(expected = NullPointerException.class)
    public void testDeleteNegativeArrayNull() {
        int[] arr = null;
        arrays.deleteNegative(arr);
    }
}
