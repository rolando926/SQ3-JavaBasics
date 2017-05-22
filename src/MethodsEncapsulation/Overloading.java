package MethodsEncapsulation;

/**
 * Created by RXC8414 on 5/19/2017.
 */
public class Overloading {

    public void calledMethod(int x, int y){
        System.out.println("Method: Integer, Integer");
    }

    public void calledMethod(double x, double y){
        System.out.println("Method: Double, Double");
    }

    public void calledMethod(double x, int y){
        System.out.println("Method: Double, Integer");
    }

    public void calledMethod(){
        System.out.println("Method: No Arguments");
    }
}
