package MethodsEncapsulation;

/**
 * Created by RXC8414 on 5/19/2017.
 */
public class ArgumentMain {
    public static void main(String[] args) {
        Arguments arg = new Arguments();

        // You can send as many arguments as needed and they don't
        // have to be of the same data type
        // NOTE: this method MUST receive one String, one String, one int and one char
        // in that same order
        arg.personInfo("Rolando","Colon",43,'M');
    }
}
