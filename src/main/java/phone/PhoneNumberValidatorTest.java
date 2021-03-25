package phone;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

class PhoneNumberValidatorTest {


    private PhoneNumberValidator phoneNumberValidator;

    @BeforeEach
    void setUp() {
        phoneNumberValidator = new PhoneNumberValidator();
    }

    @Test
    void testShouldValidatePhoneNumber() {
        String number = "7873923408";
        assertEquals(true,phoneNumberValidator.test(number));
    }





}
