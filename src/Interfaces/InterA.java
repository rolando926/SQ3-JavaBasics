package Interfaces;

/**
 * Created by RXC8414 on 6/2/2017.
 */
public interface InterA {

    // Interfaces are good for declaring Constants
    // Note: Interfaces cannot have fields; only constants
    String strMessage = "Interface A";

    // This is an example of an empty (abstract) method
    void displayInfo(String value);

    // This is an example of a fully implemented (default) method
    // Note: You must use the keyword "default" to identify any fully implemented method
    default String identifyInterface(){
        return modifyMessage();
    }

    // This is an example of a static method
    // Note: static methods can only serve the purpose of helping default methods
    static String modifyMessage(){
        return "This is "+strMessage;
    }
}
