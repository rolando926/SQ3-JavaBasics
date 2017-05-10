package ClassesObjects;

/**
 * Created by RXC8414 on 5/9/2017.
 */
public class Shirt {
    char colorCode;
    double price;
    String itemId;

    public Shirt(){}

    public Shirt(char color, double thePrice, String Id) {
        colorCode = color;
        price = thePrice;
        itemId = Id;

        printFields();
        System.out.println("----------------");
    }

    public void printFields(){
        System.out.println("colorCode = "+colorCode);
        System.out.println("itemId = "+itemId);
        System.out.println("price = "+price);
    }
}
