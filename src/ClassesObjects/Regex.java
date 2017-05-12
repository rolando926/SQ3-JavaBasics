package ClassesObjects;

/**
 * Created by RXC8414 on 5/12/2017.
 */
public class Regex {

    // Create a method that returns if full name is valid or not
    public void verifyFullName(String name){
        String regex = "^[A-Z][A-Za-z]+ [A-Z][A-Za-z]+";
        if(name.matches(regex)){
            System.out.println(name+" is a valid name.");
        }
        else{
            System.out.println(name+" is not a valid name.");
        }
    }
}
