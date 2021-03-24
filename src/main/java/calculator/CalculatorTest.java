package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {


    @Test
    public void testAddPositiveNumberReturnPositive() {
        int a = 10;
        int b = 20;
        Calculator calculator = new Calculator();

        int result = calculator.add(a, b);

        Assert.assertTrue(result > 0);
    }

    @Test
    public void testAddNegetiveNumberReturnNegetive() {
        int a = -10;
        int b = -20;
        Calculator clc = new Calculator();
        int result = clc.add(a, b);
        Assert.assertTrue(result<0);
    }

    @Test
    public void testAddOppositeNumberReturnZero() {
        int a = -10;
        int b = 10;
        Calculator clc = new Calculator();
        int result = clc.add(a, b);
        Assert.assertTrue(result==0);
    }

    @Test
    public void testAddPositiveGreaterThanNegetiveNumberReturnPostive() {
        int a = 30;
        int b = -10;
        Calculator clc = new Calculator();
        int result = clc.add(a, b);
        Assert.assertTrue(result>0);
    }

    @Test
    public void testAddNegativeGreaterThanPositiveNumberReturnNegative() {
        int a = -30;
        int b = 10;
        Calculator clc = new Calculator();
        int result = clc.add(a, b);
        Assert.assertTrue(result<0);
    }

}
