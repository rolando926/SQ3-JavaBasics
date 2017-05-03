package JavaBasics;

/**
 * Created by RXC8414 on 5/3/2017.
 */
public class DoWhileLoop {
    public static void main(String[] args) {
        // Declare and initialize counter
        int i = 0;
        // Do-while that loops from 0-10
        do{
            System.out.println("Counter = "+i);
            i++;
        }while(i <= 10);
    }
}
