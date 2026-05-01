import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=[a-zA-Z0-9]*[^a-zA-Z0-9][a-zA-Z0-9]*$).{8,}$";
        System.out.println(Pattern.matches(regex, "Password@123")); // true
        System.out.println(Pattern.matches(regex, "Pass@word@123")); // false
        System.out.println(Pattern.matches(regex, "password@123")); // false (no upper)
        System.out.println(Pattern.matches(regex, "Password@")); // false (no numeric)
        System.out.println(Pattern.matches(regex, "Pass@12")); // false (len < 8)
    }
}
