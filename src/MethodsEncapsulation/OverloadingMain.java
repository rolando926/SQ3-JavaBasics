package MethodsEncapsulation;

/**
 * Created by RXC8414 on 5/19/2017.
 */
public class OverloadingMain {
    public static void main(String[] args) {
        Overloading over = new Overloading();

        over.calledMethod(3.2,2.1);
        over.calledMethod();
        over.calledMethod(2,4);
        over.calledMethod(4.4,2);
        over.calledMethod(4,2.2); // This one will work because int can be promoted to double
        over.calledMethod(2,'C'); // This will try to execute but will cause a runtime exception
    }
}
