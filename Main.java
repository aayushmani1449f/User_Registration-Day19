public class Main {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        System.out.println(registration.validateFirstName("Aayush"));
        System.out.println(registration.validateFirstName("aa"));
        System.out.println(registration.validateLastName("Mani"));
        System.out.println(registration.validateLastName("ma"));
        System.out.println(registration.validateEmail("abc.xyz@bl.co.in"));
        System.out.println(registration.validateEmail("abc@bl.co"));
        System.out.println(registration.validateMobile("91 9919819801"));
        System.out.println(registration.validateMobile("919919819801"));
        System.out.println(registration.validatePasswordRule1("password123"));
        System.out.println(registration.validatePasswordRule1("pass"));
        System.out.println(registration.validatePasswordRule2("Password123"));
        System.out.println(registration.validatePasswordRule2("password123"));
        System.out.println(registration.validatePasswordRule3("Password123"));
        System.out.println(registration.validatePasswordRule3("Password"));
        System.out.println(registration.validatePasswordRule4("Password@123"));
        System.out.println(registration.validatePasswordRule4("Password123"));

        String[] validEmails = {
            "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", 
            "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", 
            "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"
        };
        System.out.println("\nValid Emails:");
        for (String sample : validEmails) {
            System.out.println(sample + " : " + registration.validateEmail(sample));
        }

        String[] invalidEmails = {
            "abc", "abc@.com.my", "abc123@gmail.a", "abc123@.com", 
            "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com", 
            "abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", 
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"
        };
        System.out.println("\nInvalid Emails:");
        for (String sample : invalidEmails) {
            System.out.println(sample + " : " + registration.validateEmail(sample));
        }
    }
}
