package strings.stringprocessor;

import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class StringProcessorTest {

    private StringProcessor strinProcessor;

    @Before
    public void setup() {
        this.strinProcessor = new StringProcessor();
    }

    @DataProvider
    public static Object[][] dataProviderStringsWithVowels() {
        return new Object[][]{
                {"bababa", 3},
                {"aeiou", 5},
                {"blahblah", 2},
                {"aBBBBB", 1},
                {"aEiOu", 5},
        };
    }


    @Test
    @UseDataProvider("dataProviderStringsWithVowels")
    public void testCountVowels_VowelExistReturnNumberOfVowels(String word, int exp) throws EmptyStringException {

        Assert.assertEquals(exp, strinProcessor.countVowels(word));
    }


    @DataProvider
    public static Object[][] dataProviderStringsWithoutVowels() {

        return new Object[][]{
                {"bcdfgh"},
                {"mmmmm"},
                {"zzzzzzzz"}

        };
    }


    @Test
    @UseDataProvider("dataProviderStringsWithoutVowels")
    public void testCountVowels_VowelsDontExistReturnZero(String word) throws EmptyStringException {

        Assert.assertEquals(0, strinProcessor.countVowels(word));
    }

    @Test(expected = EmptyStringException.class)
    public void testCountVowels_StringIsEmpyThrowEmptyException() throws EmptyStringException {
        strinProcessor.countVowels("");}

}
