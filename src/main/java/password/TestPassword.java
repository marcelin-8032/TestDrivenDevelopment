package password;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPassword {

    PasswordValidator passwordValidator;

    @BeforeEach
    public void SetUp() {
        passwordValidator = new PasswordValidator();
    }


    @Test
    public void TestPasswordIfItHasAtLeastEightCharacter() {

        Assert.assertEquals(false, passwordValidator.isValid("Abc"));

    }

    @Test
    public void TestPasswordIfItConsistsofLettersAndDigits() {

        Assert.assertEquals( false, passwordValidator.isValid("Abcdddd25!%"));

    }

    @Test
    public void TestPasswordIfItConsistsAtLeastTwoDigits() {

        Assert.assertEquals(false, passwordValidator.isValid("ABCDEFGHZ2"));

    }
}
