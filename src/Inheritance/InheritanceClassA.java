package Inheritance;

/**
 * Created by RXC8414 on 5/25/2017.
 */
public class InheritanceClassA extends InheritanceClassB {
    String subMessage;
    int subCounter;
    //InheritanceClassB obj = new InheritanceClassB();

    InheritanceClassA(){
        super("This is super",100);
        subMessage = "Sub";
        subCounter = 1;
    }

    public void identifyClass(){
        System.out.println("This is the sub Class.");
        //superDoSomething();
        //super.identifyClass();
    }

    public void getSuperIdentifyClass(){
        super.identifyClass();
        System.out.println(superMessage);
        System.out.println(superCounter);
    }
}
