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
    }
}
