package LoginManager;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class LoginManagerTest {

    private LoginManger loginManger;
    private Map<String, String> userRepo;

    @Before
    public void setUp() {
        this.userRepo = new HashMap<String, String>();
        this.userRepo.put("mduser","modepasse");
        this.loginManger = new LoginManger(userRepo);
    }

    @Test
    public void testLogin_CredentialValidReturnTrue() throws EmptyPasswordException, InvalidCredentialException {
        String username = "mduser";
        String modePass = "modepasse";
        boolean result = loginManger.login(username, modePass);
        Assert.assertTrue(result);
    }

    @Test(expected = InvalidCredentialException.class)
    public void testLoginCredentialAreNotValidthrowsInvalidCredException() throws EmptyPasswordException, InvalidCredentialException {
        String username = "invaliduser";
        String password = "mypassword";

        loginManger.login(username, password);
    }

    @Test(expected = EmptyPasswordException.class)
    public void testLogin_PasswordIsEmptythrowsEmptyPasswordException() throws EmptyPasswordException, InvalidCredentialException {
        String username = "mduser";
        loginManger.login(username, "");
    }
}