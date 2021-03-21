package romanToarabic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArabicToRomanTest {


    @Test
    public void testForConvert_I_to_1() {
        // romanToarabic.Roman roman = new romanToarabic.Roman("I");
        //int arabic = roman.toArabic();
        Assertions.assertEquals(new Roman("I").toArabic(), 1);
    }

    @Test
    public void testForConvert_II_to_2() {
        // romanToarabic.Roman roman = new romanToarabic.Roman("I");
        //int arabic = roman.toArabic();
        Assertions.assertEquals(new Roman("II").toArabic(), 2);
    }


    @Test
    public void testForConvert_IV_to_4() {
        // romanToarabic.Roman roman = new romanToarabic.Roman("I");
        //int arabic = roman.toArabic();
        Assertions.assertEquals(new Roman("IV").toArabic(), 4);
    }

    @Test
    public void testForConvert_V_to_5() {
        // romanToarabic.Roman roman = new romanToarabic.Roman("I");
        //int arabic = roman.toArabic();
        Assertions.assertEquals(new Roman("V").toArabic(), 5);
    }

    @Test
    public void testForConvert_X_to_10() {
        // romanToarabic.Roman roman = new romanToarabic.Roman("I");
        //int arabic = roman.toArabic();
        Assertions.assertEquals(new Roman("X").toArabic(), 10);
    }

}
