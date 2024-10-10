package test;

import org.junit.Before;
import org.junit.Test;
import tems.Cycles;

import static org.junit.Assert.*;

public class CyclesTest {
    private Cycles cycles;

    @Before
    public void setUp() {
        cycles = new Cycles();
    }

    @Test
    public void testListNumsSingleDigit() {
        int x = 5;
        String expected = "0 1 2 3 4 5";
        String actual = cycles.listNums(x);
        assertEquals(expected, actual);
    }

    @Test
    public void testListNumsMultiDigit() {
        int x = 10;
        String expected = "0 1 2 3 4 5 6 7 8 9 10";
        String actual = cycles.listNums(x);
        assertEquals(expected, actual);
    }

    @Test
    public void testListNumsZero() {
        int x = 0;
        String expected = "0";
        String actual = cycles.listNums(x);
        assertEquals(expected, actual);
    }

    @Test
    public void testListNumsNegative() {
        int x = -5;
        String expected = "";
        String actual = cycles.listNums(x);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseListNums() {
        String result = cycles.reverseListNums(5);
        assertEquals("5 4 3 2 1 0", result);
    }

    @Test
    public void testReverseListNumsZero() {
        String result = cycles.reverseListNums(0);
        assertEquals("0", result);
    }

    @Test
    public void testReverseListNumsNegative() {
        String result = cycles.reverseListNums(-1);
        assertEquals("", result);
    }

    @Test
    public void testChet() {
        String result = cycles.chet(5);
        assertEquals("0 2 4", result);
    }

    @Test
    public void testChetZero() {
        String result = cycles.chet(0);
        assertEquals("0", result);
    }

    @Test
    public void testChetOne() {
        String result = cycles.chet(1);
        assertEquals("0", result);
    }

    @Test
    public void testChetNegative() {
        String result = cycles.chet(-1);
        assertEquals("", result);
    }
    @Test
    public void testPowPositive() {
        int result = cycles.pow(2, 3);
        assertEquals(8, result);
    }

    @Test
    public void testPowZeroExponent() {
        int result = cycles.pow(2, 0);
        assertEquals(1, result);
    }

    @Test
    public void testPowOneExponent() {
        int result = cycles.pow(2, 1);
        assertEquals(2, result);
    }

    @Test
    public void testPowNegativeBase() {
        int result = cycles.pow(-2, 3);
        assertEquals(-8, result);
    }

    @Test
    public void testNumLePositive() {
        int result = cycles.numLen(123);
        assertEquals(3, result);
    }

    @Test
    public void testNumLenZero() {
        int result = cycles.numLen(0);
        assertEquals(1, result);
    }

    @Test
    public void testNumLenNegative() {
        int result = cycles.numLen(-123);
        assertEquals(3, result);
    }

    @Test
    public void testNumLenSingleDigit() {
        int result = cycles.numLen(5);
        assertEquals(1, result);
    }

    @Test
    public void testNumLenLongNumber() {
        int result = cycles.numLen(123456789);
        assertEquals(9, result);
    }

    @Test
    public void testEqualNumSingleDigit() {
        boolean result = cycles.equalNum(5);
        assertTrue(result);
    }

    @Test
    public void testEqualNumAllEqualDigits() {
        boolean result = cycles.equalNum(111);
        assertTrue(result);
    }

    @Test
    public void testEqualNumNotAllEqualDigits() {
        boolean result = cycles.equalNum(123);
        assertFalse(result);
    }

    @Test
    public void testEqualNum_ero() {
        boolean result = cycles.equalNum(0);
        assertTrue(result);
    }

    @Test
    public void testEqualNumNegative() {
        boolean result = cycles.equalNum(-111);
        assertTrue(result);
    }
}
