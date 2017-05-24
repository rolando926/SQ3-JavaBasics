package ClassesObjects;

/**
 * Created by RXC8414 on 5/9/2017.
 */
public class ShirtMain {
    public static void main(String[] args) {
        // Creating 2 instantiations of the Shirt class
        Shirt myShirt = new Shirt();
        Shirt yourShirt = new Shirt();

        // Assignments to the class field
        myShirt.colorCode = 'G';
        yourShirt.colorCode = 'R';

        // Print out the values for each object
        System.out.println("myShirt colorCode = "+myShirt.colorCode);
        System.out.println("yourShirt colorCode = "+yourShirt.colorCode);
        System.out.println("-----------Realignment------------");

        // Do some realignment
        myShirt = yourShirt;

        // Do some new assignments
        myShirt.colorCode = 'G';
        System.out.println("myShirt colorCode (before) = "+myShirt.colorCode);
        yourShirt.colorCode = 'R';
        System.out.println("myShirt colorCode (after) = "+myShirt.colorCode);
        System.out.println("yourShirt colorCode (after) = "+yourShirt.colorCode);

    }
}
