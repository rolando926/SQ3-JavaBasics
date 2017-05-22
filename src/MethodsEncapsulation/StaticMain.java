package MethodsEncapsulation;

/**
 * Created by RXC8414 on 5/19/2017.
 */
public class StaticMain {
    public static void main(String[] args) {
        Static mark = new Static();
        Static charles = new Static();

        // Print initial values for x and y
        System.out.println("Mark    ==> x:"+ mark.x +"  y:"+mark.y);
        System.out.println("Charles ==> x:"+ charles.x +"  y:"+charles.y);

        // Charles and Mark are going to initialize x
        System.out.println("------------------");
        mark.setX(10);
        charles.setX(20);
        System.out.println("Mark    ==> x:"+ mark.x +"  y:"+mark.y);
        System.out.println("Charles ==> x:"+ charles.x +"  y:"+charles.y);

        // Charles and Mark are going now to initialize y
        System.out.println("------------------");
        mark.setY(100);
        System.out.println("Mark    ==> x:"+ mark.x +"  y:"+mark.y);
        System.out.println("Charles ==> x:"+ charles.x +"  y:"+charles.y);
        charles.setY(200);
        System.out.println("Mark    ==> x:"+ mark.x +"  y:"+mark.y);
        System.out.println("Charles ==> x:"+ charles.x +"  y:"+charles.y);
    }
}
