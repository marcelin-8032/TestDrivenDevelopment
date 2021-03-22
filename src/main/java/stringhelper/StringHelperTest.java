package stringhelper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringHelperTest {
    StringHelper stringHelper;

    @BeforeEach
    public void setUp() {
        stringHelper = new StringHelper();
    }

    @Test
    public void testStringWith2Chars() {
        assertEquals("BA", stringHelper.swapLast2Chars("AB"));
    }

    @Test
    public void testStringWith4Char() {
        assertEquals("ABDC", stringHelper.swapLast2Chars("ABCD"));
    }

    @Test
    public void testStringWith10Chars() {
        assertEquals("ABCDEFGHJI", stringHelper.swapLast2Chars("ABCDEFGHIJ"));
    }

    @Test
    public void testStringWith1Char() {
        assertEquals("A", stringHelper.swapLast2Chars("A"));
    }


    @Test
    public void testStringWith0Char() {
        assertEquals("", stringHelper.swapLast2Chars(""));
    }
    //-------------------------

    @Test
    public void testStringHavingAInFirstCharacterOnly() {
        assertEquals("BCD", stringHelper.removeAInFirst2Chars("ABCD"));
    }

    @Test
    public void testStringHavingNoAInFirstCharacterOnly() {
        assertEquals("BBAA", stringHelper.removeAInFirst2Chars("BBAA"));
    }


    @Test
    public void testStringHavingAInFirst2CharsAnd4Char() {
        assertEquals("BBA", stringHelper.removeAInFirst2Chars("ABBA"));
    }

    @Test
    public void testStringWith1Character() {
        assertEquals("B", stringHelper.removeAInFirst2Chars("B"));
    }

    @Test
    public void testStringWithAA1Character() {
        assertEquals("", stringHelper.removeAInFirst2Chars("A"));
    }

    @Test
    public void testStringWithEmptyString() {
        assertEquals("", stringHelper.removeAInFirst2Chars(""));
    }




}
