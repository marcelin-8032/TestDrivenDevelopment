package fizzbuzz;

import fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void shouldReturn1IfNumberIs1() throws Exception {
        assertEquals("1", fizzBuzz.generate(1, 1));
    }

    @Test
    public void shouldReturn2IfNumberIs2() throws Exception {
        assertEquals("2", fizzBuzz.generate(2, 2));
    }

    @Test
    public void shouldReturnFizzIfNumberIs3() throws Exception {
        assertEquals("FIZZ", fizzBuzz.generate(3, 3));
    }

    @Test
    public void shouldReturnFizzIfNumberIs6() throws Exception {
        assertEquals("FIZZ", fizzBuzz.generate(6, 6));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs5() throws Exception {
        assertEquals("BUZZ", fizzBuzz.generate(5, 5));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs10() throws Exception {
        assertEquals("BUZZ", fizzBuzz.generate(10, 10));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs15() throws Exception {
        assertEquals("FIZZBUZZ", fizzBuzz.generate(15, 15));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs30() throws Exception {
        assertEquals("FIZZBUZZ", fizzBuzz.generate(30, 30));
    }

    @Test
    public void shouldReturn12IfNumbersAre1and2() throws Exception {
        assertEquals("12", fizzBuzz.generate(1, 2));
    }


    @Test
    public void shouldReturn12FizzIfNumbersAre1To3() throws Exception {
        assertEquals("12FIZZ", fizzBuzz.generate(1, 3));
    }

    @Test
    public void shouldReturn12Fizz4BuzzIfNumbersAre1To5() throws Exception {
        assertEquals("12FIZZ4BUZZ", fizzBuzz.generate(1, 5));
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzIfNumbersAre1to15() throws Exception {
        assertEquals("12FIZZ4BUZZFIZZ78FIZZBUZZ11FIZZ1314FIZZBUZZ", fizzBuzz.generate(1, 15));
    }


}