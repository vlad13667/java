package test;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import tems.Methods;


public class MethodsTest {

    private Methods methods;

    @Before
    public void setUp() {
        methods = new Methods();
    }


    @Test
    public void testFractionInteger() {
        double x = 5.0;
        double expected = 0.0;
        double result = methods.fraction(x);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testFractionFractional() {
        double x = 5.5;
        double expected = 0.5;
        double result = methods.fraction(x);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testFractionNegative() {
        double x = -5.5;
        double expected = -0.5;
        double result = methods.fraction(x);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testFractionZero() {
        double x = 0.0;
        double expected = 0.0;
        double result = methods.fraction(x);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testSumLastNumsDoubleDigitInput() {
        int x = 12;
        int expected = 3;
        int result = methods.sumLastNums(x);
        assertEquals(expected, result);
    }

    @Test
    public void testSumLastNumsMultiDigitInput() {
        int x = 123;
        int expected = 5;
        int result = methods.sumLastNums(x);
        assertEquals(expected, result);
    }

    @Test
    public void testSumLastNumsZeroInput() {
        int x = 000;
        int expected = 0;
        int result = methods.sumLastNums(x);
        assertEquals(expected, result);
    }

    @Test
    public void testSumLastNumsNegativeInput() {
        int x = -123;
        int expected = 5;
        int result = methods.sumLastNums(x);
        assertEquals(expected, result);
    }

    @Test
    public void testCharToNumDigitChar() {
        char x = '5';
        int expected = 5;
        int result = methods.charToNum(x);
        assertEquals(expected, result);
    }

    @Test
    public void testCharToNumZeroChar() {
        char x = '0';
        int expected = 0;
        int result = methods.charToNum(x);
        assertEquals(expected, result);
    }

    @Test
    public void testCharToNumNineChar() {
        char x = '9';
        int expected = 9;
        int result = methods.charToNum(x);
        assertEquals(expected, result);
    }

    @Test
    public void testIsPositivePositiveNumber() {
        int x = 5;
        boolean result = methods.isPositive(x);
        assertTrue(result);
    }

    @Test
    public void testIsPositiveNegativeNumber() {
        int x = -5;
        boolean result = methods.isPositive(x);
        assertFalse(result);
    }

    @Test
    public void testIsPositiveZero() {
        int x = 0;
        boolean result = methods.isPositive(x);
        assertFalse(result);
    }

    @Test
    public void testIs2DigitsTwoDigitNumber() {
        int x = 42;
        boolean result = methods.is2Digits(x);
        assertTrue(result);
    }

    @Test
    public void testIs2DigitsSingleDigitNumber() {
        int x = 5;
        boolean result = methods.is2Digits(x);
        assertFalse(result);
    }

    @Test
    public void testIs2DigitsThreeDigitNumber() {
        int x = 123;
        boolean result = methods.is2Digits(x);
        assertFalse(result);
    }

    @Test
    public void testIs2Digits_NegativeNumber() {
        int x = -42;
        boolean result = methods.is2Digits(x);
        assertTrue(result);
    }

    @Test
    public void testIsUpperCaseUpperCaseLetter() {
        char x = 'A';
        boolean result = methods.isUpperCase(x);
        assertTrue(result);
    }

    @Test
    public void testIsUpperCaseLowerCaseLetter() {
        char x = 'a';
        boolean result = methods.isUpperCase(x);
        assertFalse(result);
    }

    @Test
    public void testIsUpperCaseDigit() {
        char x = '1';
        boolean result = methods.isUpperCase(x);
        assertFalse(result);
    }


    @Test
    public void testIsUpperCaseWhitespace() {
        char x = ' ';
        boolean result = methods.isUpperCase(x);
        assertFalse(result);
    }

    @Test
    public void testIsInRangeWithinRange() {

        int a = 10;
        int b = 20;
        int num = 15;
        boolean result = methods.isInRange(a, b, num);
        assertTrue(result);
    }

    @Test
    public void testIsInRangeBelowRange() {
        int a = 10;
        int b = 20;
        int num = 5;
        boolean result = methods.isInRange(a, b, num);
        assertFalse(result);
    }

    @Test
    public void testIsInRangeAboveRange() {
        int a = 10;
        int b = 20;
        int num = 25;
        boolean result = methods.isInRange(a, b, num);
        assertFalse(result);
    }

    @Test
    public void testIsInRangeEqualToLowerBound() {
        int a = 10;
        int b = 20;
        int num = 10;
        boolean result = methods.isInRange(a, b, num);
        assertTrue(result);
    }

    @Test
    public void testIsInRangeEqualToUpperBound() {
        int a = 10;
        int b = 20;
        int num = 20;
        boolean result = methods.isInRange(a, b, num);
        assertTrue(result);
    }

    @Test
    public void testIsDivisorPositiveDivisor() {
        int a = 3;
        int b = 6;
        boolean result = methods.isDivisor(a, b);
        assertTrue(result);
    }

    @Test
    public void testIsDivisorNegativeDivisor() {
        int a = 10;
        int b = -2;
        boolean result = methods.isDivisor(a, b);
        assertTrue(result);
    }

    @Test(expected = ArithmeticException.class)
    public void testIsDivisorZeroDivisor() {
        int a = 10;
        int b = 0;
        methods.isDivisor(a, b);
    }

    @Test
    public void testIsDivisorNonDivisor() {
        int a = 10;
        int b = 3;
        boolean result = methods.isDivisor(a, b);
        assertFalse(result);
    }

   @Test(expected = ArithmeticException.class)
    public void testIsDivisorAIsZero() {
        int a = 0;
        int b = 2;
        boolean result = methods.isDivisor(a, b);
        assertFalse(result);
    }

    @Test
    public void testIsEqualEqualValues() {
        int a = 5;
        int b = 5;
        int c = 5;
        boolean result = methods.isEqual(a, b, c);
        assertTrue(result);
    }

    @Test
    public void testIsEqualNotEqualValues() {
        int a = 4;
        int b = 5;
        int c = 6;
        boolean result = methods.isEqual(a, b, c);
        assertFalse(result);
    }

    @Test
    public void testIsEqual_FirstTwoEqual() {
        int a = 5;
        int b = 5;
        int c = 4;
        boolean result = methods.isEqual(a, b, c);
        assertFalse(result);
    }

    @Test
    public void testIsEqualLastTwoEqual() {
        int a = 4;
        int b = 5;
        int c = 5;
        boolean result = methods.isEqual(a, b, c);
        assertFalse(result);
    }

    @Test
    public void testIsEqualFirstAndLastEqual() {
        int a = 5;
        int b = 4;
        int c = 5;
        boolean result = methods.isEqual(a, b, c);
        assertFalse(result);
    }

    @Test
    public void testLastNumSumSingleDigitNumbers() {
        int a = 5;
        int b = 7;
        int result = methods.lastNumSum(a, b);
        assertEquals(12, result);
    }

    @Test
    public void testLastNumSumMultiDigitNumbers() {
        int a = 15;
        int b = 27;
        int result = methods.lastNumSum(a, b);
        assertEquals(5 + 7, result);
    }

    @Test
    public void testLastNumSumZeroNumbers() {
        int a = 0;
        int b = 10;
        int result = methods.lastNumSum(a, b);
        assertEquals(0, result);
    }

    @Test
    public void testLastNumSumNegativeNumbers() {
        int a = -15;
        int b = 27;
        int result = methods.lastNumSum(a, b);
        assertEquals(5 + 7, result);
    }
}
