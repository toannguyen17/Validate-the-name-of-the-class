public class ValidateClassTest {
    public static void main(String[] args) {
        String[] validClass = {"C0318G", "A1702M", "P0303H"};
        String[] invalidClass = {"M0318G", "P0323A", "p8888M"};

        ValidateClass matcherClass = new ValidateClass();

        for (String email : validClass) {
            boolean isvalid = matcherClass.validate(email);
            System.out.println("Class is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidClass) {
            boolean isvalid = matcherClass.validate(email);
            System.out.println("Class is " + email +" is valid: "+ isvalid);
        }
    }
}
