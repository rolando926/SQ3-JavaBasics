package ClassesObjects;

/**
 * Created by RXC8414 on 5/9/2017.
 */
public class ShirtArray {
    public static void main(String[] args) {
        /*
        Shirt nathan = new Shirt();
        Shirt michael = new Shirt();
        Shirt reginald = new Shirt();
        */

        Shirt[] designers = {new Shirt(),new Shirt(), new Shirt()};

        //need to assign Nathan's info
        /*
        nathan.colorCode = 'B';
        nathan.itemId = "A12345";
        nathan.price = 21.99; */

        designers[0].colorCode = 'B';
        designers[0].itemId = "A12345";
        designers[0].price = 21.99;

        // need to assign Michael's info
        /*
        michael.colorCode = 'G';
        michael.itemId = "A34567";
        michael.price = 19.99; */

        designers[1].colorCode = 'G';
        designers[1].itemId = "A34567";
        designers[1].price = 19.99;

        // need to assign reginald's info
        /*
        reginald.colorCode = 'W';
        reginald.itemId = "A98765";
        reginald.price = 25.99; */

        designers[2].colorCode = 'W';
        designers[2].itemId = "A98765";
        designers[2].price = 25.99;

        //Verify all people's designs
        /*
        nathan.printFields();
        System.out.println("----------");
        michael.printFields();
        System.out.println("----------");
        reginald.printFields();


        designers[0].printFields();
        System.out.println("----------");
        designers[1].printFields();
        System.out.println("----------");
        designers[2].printFields();
        */

        for (Shirt temp:designers) {
            temp.printFields();
            System.out.println("----------");
        }
    }


}
