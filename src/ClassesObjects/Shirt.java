package ClassesObjects;

/**
 * Created by RXC8414 on 5/9/2017.
 */
public class Shirt {
    char colorCode;
    double price;
    String itemId;

    public void printFields(){
        System.out.println("colorCode = "+colorCode);
        System.out.println("itemId = "+itemId);
        System.out.println("price = "+price);
    }
}
