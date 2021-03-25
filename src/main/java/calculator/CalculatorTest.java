package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    Calculator clc;

    @Before
    public void setUp() {
        clc = new Calculator();
    }


    @Test
    public void testAddPositiveNumberReturnPositive() {
        int a = 10;
        int b = 20;

        int result = clc.add(a, b);

        Assert.assertTrue(result > 0);
    }

    @Test
    public void testAddNegetiveNumberReturnNegetive() {
        int a = -10;
        int b = -20;
        int result = clc.add(a, b);
        Assert.assertTrue(result < 0);
    }

    @Test
    public void testAddOppositeNumberReturnZero() {
        int a = -10;
        int b = 10;
        int result = clc.add(a, b);
        Assert.assertTrue(result == 0);
    }

    @Test
    public void testAddPositiveGreaterThanNegetiveNumberReturnPostive() {
        int a = 30;
        int b = -10;

        int result = clc.add(a, b);
        Assert.assertTrue(result > 0);
    }

    @Test
    public void testAddNegativeGreaterThanPositiveNumberReturnNegative() {
        int a = -30;
        int b = 10;

        int result = clc.add(a, b);
        Assert.assertTrue(result < 0);
    }


 /*   @Test(expected = RuntimeException.class)
    public void whereMoreThan2NumbersAreUsed() {
        clc.sumString("1,2,3");
    }*/


    @Test
    public void when2NumbersAreUsed() {
        clc.sumString("1,2");
        Assert.assertTrue(true);
    }


    @Test(expected = RuntimeException.class)
    public void whenNoNumbersIsUsed() {
        clc.sumString("Y,X");
    }

    @Test
    public void whenEmptyStringIsUsed() {
        Assert.assertEquals(0, clc.sumString(""));
    }

    @Test
    public void whenOneNumbersIsUsedReturnthatNumer() {
        Assert.assertEquals(3, clc.sumString("3"));
    }

    @Test
    public void whenTwoNumbersAreUsedReturnthierAddition() {
        Assert.assertEquals(11, clc.sumString("3,8"));
    }

    @Test
    public void whenManyNumbersAreUsedReturnthierSum() {
        Assert.assertEquals(22, clc.sumString("3,8,5,4,2"));
    }

    @Test
    public void whenNewLineIsUsedNumbersAreUsedReturnValuesOfSum() {
        Assert.assertEquals(553, clc.sumString("3,8n542"));
    }

    @Test
    public void whenDelimmiterIsSpecifiedThenItSeperateNumbers() {
        Assert.assertEquals(24, clc.sumString1("//;n3;6;15"));
    }



}
