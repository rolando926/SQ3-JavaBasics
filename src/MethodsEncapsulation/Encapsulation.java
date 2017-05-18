package MethodsEncapsulation;

/**
 * Created by RXC8414 on 5/17/2017.
 */
public class Encapsulation {
    private String message = "Encapsulation Hello";

    /// The encapsulation methods
    public String getMessage() { ///get + field name; does not require an argument
        return message; // Only returns the value of the private field
    }

    public void setMessage(String value) {/// set + field name; requires an
        // argument of the same data type as the private field
        // argument name can be anything

        // We are going to set some rules
        // Rule: if the new message does not contains the word 'No' it will accept the changes
        if(value.toUpperCase().contains("NO")) {
            message = message;
        }
        else{
            message = value;
        }

        /* This code works the same as the above
        if(!value.toUpperCase().contains("NO")){
            message = value;
        }
         */
    }

    /// End encapsulation methods

    public void printMessage(){
        System.out.println(message);
    }
}
