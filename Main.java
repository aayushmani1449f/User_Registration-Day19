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

        String[] emailSamples = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        for (String sample : emailSamples) {
            System.out.println(sample + " : " + registration.validateEmail(sample));
        }
    }
}
