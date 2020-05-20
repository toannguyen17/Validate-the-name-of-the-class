import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClass {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String EMAIL_REGEX = "^[ACP][0-9]{4}[GHIKLM]$";

    public ValidateClass() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
