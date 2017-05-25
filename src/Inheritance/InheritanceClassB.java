package Inheritance;

/**
 * Created by RXC8414 on 5/25/2017.
 */
public class InheritanceClassB {
    String superMessage;
    int superCounter;

    public InheritanceClassB(String str, int val){
        superMessage = str;
        superCounter = val;
    }

    public void superDoSomething(){
        System.out.println("This is the super method in action.");
    }

    public void identifyClass(){
        System.out.println("This is the super class.");
    }
}
