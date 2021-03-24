package fibonacci;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {


    Fibonacci f = new Fibonacci();


    @Before
    public void setUp() {
        f = new Fibonacci();
    }

    @Test
    public void testZeroMemberFibonacciSeries() {
        assertEquals(0, f.fib(0));

    }
    @Test
    public void testFirstMemberFibonacciSeries() {
        assertEquals(1, f.fib(1));
    }

    @Test
    public void testSecondMemberFibonacciSeries() {
        assertEquals(1, f.fib(2));
    }

    @Test
    public void testThirdMemberFibonacciSeries() {
        assertEquals(2, f.fib(3));
    }

    @Test
    public void testFourthMemberFibonacciSeries() {
        assertEquals(3, f.fib(4));
    }

    @Test
    public void testFifthMemberFibonacciSeries() {
        assertEquals(5, f.fib(5));
    }

    @Test
    public void testTenthMemberFibonacciSeries() {
        assertEquals(55, f.fib(10));
    }

}
