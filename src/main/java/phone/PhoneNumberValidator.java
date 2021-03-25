package phone;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator implements Predicate<String> {

    @Override
    public boolean test(String phoneNumber) {
        String regex = "(0/91)?[7-9][0-9]{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(phoneNumber);

        return (m.find() && m.group().equals(phoneNumber));
    }
}
