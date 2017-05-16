package ClassesObjects;

/**
 * Created by RXC8414 on 5/12/2017.
 */
public class RegexMain {


    public static void main(String[] args) {
        String[] fruits = {"Apple","Grape","Strawberry","Berry","Banana","Peach","Melon","Mango"};
        String[] emails = {"your.name@gmail.com",
                        "abc.dfg@yahoo.com",
                        "@@@@something.com",
                        "AB@mycompany.org",
                        "abcd@homedepot.info",
                        "your!!!Name123@homedepot.com"};
        String[] passwords = {"pas$word01","Pa$$word01","Pa$$01","Passw0rd01"};

        //String firstName = args[0];
        //String lastName = args[1];
        //String fullName = firstName + " " + lastName;

        // First thing is to do instantiation
        Regex myRegex = new Regex();

        // Call my first method - Verify if valid full name.
        //myRegex.verifyFullName(fullName);

        // Validate Regex rules
        //myRegex.applyRgxArrayString(fruits,-1);

        //Validate Email Regex Rule
        //myRegex.validateEmail(emails);

        // Validate Password Regex Rule
        myRegex.validatePassword(passwords);
    }
}
