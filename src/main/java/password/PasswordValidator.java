package password;

public class PasswordValidator {
    public static int upCount = 0;
    public static int lowCount = 0;
    public static int digit = 0;
    public static int special = 0;

    public boolean isValid(String modepass) {

        if (modepass.length() >= 8 && modepass.length() <= 16) {

            for (int i = 0; i < modepass.length(); i++) {
                char c = modepass.charAt(i);

                if (Character.isUpperCase(c)) {
                    upCount++;
                }
                if (Character.isLowerCase(c)) {
                    lowCount++;
                }
                if (Character.isDigit(c)) {
                    digit++;
                }
                if (c >= 33 && c <= 46 || c == 64) {
                    special++;
                }

                if (special >= 1 && upCount >= 1 && lowCount >= 1 && digit >= 1) {
                    return true;
                }

            }

        }
        return false;
    }
}
