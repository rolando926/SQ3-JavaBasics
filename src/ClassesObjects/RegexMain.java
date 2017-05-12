package ClassesObjects;

/**
 * Created by RXC8414 on 5/12/2017.
 */
public class RegexMain {
    public static void main(String[] args) {
        String firstName = args[0];
        String lastName = args[1];
        String fullName = firstName + " " + lastName;

        // First thing is to do instantiation
        Regex myRegex = new Regex();

        // Call my first method - Verify if valid full name.
        myRegex.verifyFullName(fullName);
    }
}
