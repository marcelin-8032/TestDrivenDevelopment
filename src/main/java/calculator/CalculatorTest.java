package calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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

}
