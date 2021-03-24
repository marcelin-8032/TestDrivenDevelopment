package LoginManager;

import java.util.Map;

public class LoginManger {

    private final Map<String, String> userRepo;

    public LoginManger(Map<String, String> userRepo) {
        this.userRepo = userRepo;
    }

    public boolean login(String username, String modePass) throws EmptyPasswordException, InvalidCredentialException {
        if (userRepo.containsKey(username) && userRepo.get(username) == modePass) {
            return true;
        }

        if (modePass.isEmpty()) {
            throw new EmptyPasswordException();
        }

        throw new InvalidCredentialException();

    }
}
