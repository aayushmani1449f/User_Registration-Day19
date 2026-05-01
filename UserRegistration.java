import java.util.regex.Pattern;

public class UserRegistration {
    public boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z][a-zA-Z]{2,}$", lastName);
    }
}
