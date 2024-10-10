package test;

import org.junit.Before;
import org.junit.Test;
import tems.Conditions;


import static org.junit.Assert.*;

public class ConditionsTest {

    private Conditions conditions;

    @Before
    public void setUp() {
        conditions = new Conditions();
    }
    @Test
    public void testAbsPositiveNumber() {
        int x = 5;
        int expected = 5;
        int result = conditions.abs(x);
        assertEquals(expected, result);
    }

    @Test
    public void testAbsNegativeNumber() {
        int x = -5;
        int expected = 5;
        int result = conditions.abs(x);
        assertEquals(expected, result);
    }

    @Test
    public void testAbsZero() {
        int x = 0;
        int expected = 0;
        int result = conditions.abs(x);
        assertEquals(expected, result);
    }

    @Test
    public void testSafeDivDivisionWithoutZero() {
        int x = 10;
        int y = 2;
        double expected = 5.0;
        double result = conditions.safeDiv(x, y);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testSafeDiv_DivisionByZero() {
        int x = 10;
        int y = 0;
        double expected = 0.0;
        double result = conditions.safeDiv(x, y);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testSafeDivDivisionByOne() {
        int x = 10;
        int y = 1;
        double expected = 10.0;
        double result = conditions.safeDiv(x, y);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testSafeDivDivisionOfZero() {
        int x = 0;
        int y = 2;
        double expected = 0.0;
        double result = conditions.safeDiv(x, y);
        assertEquals(expected, result, 0.0);
    }

    @Test
    public void testIs35MultipleOf3NotMultipleOf5() {
        int x = 6;
        boolean result = conditions.is35(x);
        assertTrue(result);
    }

    @Test
    public void testIs35MultipleOf5NotMultipleOf3() {
        int x = 10;
        boolean result = conditions.is35(x);
        assertTrue(result);
    }

    @Test
    public void testIs35MultipleOfBoth3And5() {
        int x = 15;
        boolean result = conditions.is35(x);
        assertFalse(result);
    }

    @Test
    public void testIs35NotMultipleOfEither3Or5() {
        int x = 7;
        boolean result = conditions.is35(x);
        assertFalse(result);
    }

    @Test
    public void testMakeDecisionXGreaterThanY() {
        int x = 5;
        int y = 3;
        String expected = "5 > 3";
        String result = conditions.makeDecision(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testMakeDecisionXLessThanY() {
        int x = 3;
        int y = 5;
        String expected = "3 < 5";
        String result = conditions.makeDecision(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testMakeDecisionXEqualToY() {
        int x = 5;
        int y = 5;
        String expected = "5 = 5";
        String result = conditions.makeDecision(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testMax3XIsMax() {
        int x = 5;
        int y = 3;
        int z = 4;
        int expected = 5;
        int result = conditions.max3(x, y, z);
        assertEquals(expected, result);
    }

    @Test
    public void testMax3YIsMax() {
        int x = 3;
        int y = 5;
        int z = 4;
        int expected = 5;
        int result = conditions.max3(x, y, z);
        assertEquals(expected, result);
    }

    @Test
    public void testMax3ZIsMax() {
        int x = 3;
        int y = 4;
        int z = 5;
        int expected = 5;
        int result = conditions.max3(x, y, z);
        assertEquals(expected, result);
    }

    @Test
    public void testMax3AllEqual() {
        int x = 5;
        int y = 5;
        int z = 5;
        int expected = 5;
        int result = conditions.max3(x, y, z);
        assertEquals(expected, result);
    }

    @Test
    public void testSum3XPlusYEqualsZ() {
        int x = 2;
        int y = 3;
        int z = 5;
        boolean result = conditions.sum3(x, y, z);
        assertTrue(result);
    }

    @Test
    public void testSum3XPlusZEqualsY() {
        int x = 2;
        int y = 5;
        int z = 3;
        boolean result = conditions.sum3(x, y, z);
        assertTrue(result);
    }

    @Test
    public void testSum3PlusZEqualsX() {
        int x = 5;
        int y = 2;
        int z = 3;
        boolean result = conditions.sum3(x, y, z);
        assertTrue(result);
    }

    @Test
    public void testSum3NoSumEquals() {
        int x = 1;
        int y = 2;
        int z = 3;
        boolean result = conditions.sum3(x, y, z);
        assertTrue( result);
    }

    @Test
    public void testSum2SumInRange() {
        int x = 10;
        int y = 10;
        int expected = 20;
        int result = conditions.sum2(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testSum2SumBelowRange() {
        int x = 5;
        int y = 3;
        int expected = 8;
        int result = conditions.sum2(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testSum2SumAboveRange() {
        int x = 15;
        int y = 10;
        int expected = 25;
        int result = conditions.sum2(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testSum2SumAtLowerBound() {
        int x = 10;
        int y = 0;
        int expected = 20;
        int result = conditions.sum2(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testSum2SumAtUpperBound() {
        int x = 10;
        int y = 9;
        int expected = 20;
        int result = conditions.sum2(x, y);
        assertEquals(expected, result);
    }

    @Test
    public void testAgeSingular() {
        int x = 1;
        String expected = "1 год";
        String result = conditions.age(x);
        assertEquals(expected, result);
    }

    @Test
    public void testAgePlural2to4() {
        int x = 2;
        String expected = "2 года";
        String result = conditions.age(x);
        assertEquals(expected, result);
    }

    @Test
    public void testAgePlural5to9() {
        int x = 5;
        String expected = "5 лет";
        String result = conditions.age(x);
        assertEquals(expected, result);
    }

    @Test
    public void testAgePlural11to19() {
        int x = 11;
        String expected = "11 лет";
        String result = conditions.age(x);
        assertEquals(expected, result);
    }


    @Test
    public void testAgePlural25to29() {
        int x = 25;
        String expected = "25 лет";
        String result = conditions.age(x);
        assertEquals(expected, result);
    }


    @Test
    public void testDayMonday() {
        int x = 1;
        String expected = "Понедельник";
        String result = conditions.day(x);
        assertEquals(expected, result);
    }

    @Test
    public void testDayTuesday() {
        int x = 2;
        String expected = "Вторник";
        String result = conditions.day(x);
        assertEquals(expected, result);
    }

    @Test
    public void testDayWednesday() {
        int x = 3;
        String expected = "Среда";
        String result = conditions.day(x);
        assertEquals(expected, result);
    }

    @Test
    public void testDayThursday() {
        int x = 4;
        String expected = "Четверг";
        String result = conditions.day(x);
        assertEquals(expected, result);
    }

    @Test
    public void testDayFriday() {
        int x = 5;
        String expected = "Пятница";
        String result = conditions.day(x);
        assertEquals(expected, result);
    }

    @Test
    public void testDaySaturday() {
        int x = 6;
        String expected = "Суббота";
        String result = conditions.day(x);
        assertEquals(expected, result);
    }

    @Test
    public void testDaySunday() {
        int x = 7;
        String expected = "Воскресенье";
        String result = conditions.day(x);
        assertEquals(expected, result);
    }

    @Test
    public void testDayInvalidDay() {
        int x = 8;
        String expected = "это не день недели";
        String result = conditions.day(x);
        assertEquals(expected, result);
    }
}
