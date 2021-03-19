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
    public void shouldReturn1IfNumberIs1() {
        assertEquals("1", fizzBuzz.generate(1, 1));
    }

    @Test
    public void shouldReturn2IfNumberIs2() {
        assertEquals("2", fizzBuzz.generate(2, 2));
    }

    @Test
    public void shouldReturnFizzIfNumberIs3() {
        assertEquals("FIZZ", fizzBuzz.generate(3, 3));
    }

    @Test
    public void shouldReturnFizzIfNumberIs6() {
        assertEquals("FIZZ", fizzBuzz.generate(6, 6));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs5() {
        assertEquals("BUZZ", fizzBuzz.generate(5, 5));
    }

    @Test
    public void shouldReturnBuzzIfNumberIs10() {
        assertEquals("BUZZ", fizzBuzz.generate(10, 10));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs15() {
        assertEquals("FIZZBUZZ", fizzBuzz.generate(15, 15));
    }

    @Test
    public void shouldReturnFizzBuzzIfNumberIs30() {
        assertEquals("FIZZBUZZ", fizzBuzz.generate(30, 30));
    }

    @Test
    public void shouldReturn12IfNumbersAre1and2() {
        assertEquals("12", fizzBuzz.generate(1, 2));
    }


    @Test
    public void shouldReturn12FizzIfNumbersAre1To3() {
        assertEquals("12FIZZ", fizzBuzz.generate(1, 3));
    }

    @Test
    public void shouldReturn12Fizz4BuzzIfNumbersAre1To5() {
        assertEquals("12FIZZ4BUZZ", fizzBuzz.generate(1, 5));
    }

    @Test
    public void shouldReturn12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzzIfNumbersAre1to15(){
        assertEquals("12FIZZ4BUZZFIZZ78FIZZBUZZ11FIZZ1314FIZZBUZZ", fizzBuzz.generate(1, 15));
    }


}