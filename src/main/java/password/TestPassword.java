package password;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPassword {

    PasswordValidator passwordValidator;

    @BeforeEach
    public void SetUp() {
        passwordValidator = new PasswordValidator();
    }

    @Test
    public void TestPasswordIfItHasAtLeast8CharacterAndMaximumx16() {
        assertEquals(false, passwordValidator.isValid("Abc"));
    }


    @Test
    public void TestPasswordIfIthasOneOrMoreUPPERCASEcharacters() {
        assertEquals(false, passwordValidator.isValid("abcdfefglatdg"));
    }

    @Test
    public void TestPasswordIfIthasOneOrMoreLowerCaseCharacters() {
        assertEquals(false, passwordValidator.isValid("ABCDEFGLHSLJH"));
    }

    @Test
    public void TestPasswordIfIthasOneOrMoreDigits() {
        assertEquals(false, passwordValidator.isValid("A2ABCDED"));
    }


    @Test
    public void TestPasswordIfIthasOneOrMoreSpecialCharacters() {//$?!@
        assertEquals(false, passwordValidator.isValid("ABCDefgh123"));
    }

    @Test
    public void TestPasswordGoodPassword() {
        assertEquals(true, passwordValidator.isValid("ABCDefgh1!"));
    }

}
