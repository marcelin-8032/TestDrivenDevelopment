package password;

public class PasswordValidator {
    public static int count = 0;

    public boolean isValid(String modepass) {

        if (modepass.length() > 8) {

            for (int i = 0; i < modepass.length(); i++) {
                char c = modepass.charAt(i);
                if (!Character.isLetterOrDigit(c)) {
                    return false;
                } else {
                    if (Character.isDigit(c)) {
                        count++;
                    }
                }
            }

            if (count < 2) {
                return false;
            }
        }

        return false;
    }

}