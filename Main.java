public class Main {
    public static void main(String[] args) {
        UserRegistration registration = new UserRegistration();
        System.out.println(registration.validateFirstName("Aayush"));
        System.out.println(registration.validateFirstName("aa"));
        System.out.println(registration.validateLastName("Mani"));
        System.out.println(registration.validateLastName("ma"));
        System.out.println(registration.validateEmail("abc.xyz@bl.co.in"));
        System.out.println(registration.validateEmail("abc@bl.co"));
    }
}
