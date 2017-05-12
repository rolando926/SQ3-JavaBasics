package ClassesObjects;

/**
 * Created by RXC8414 on 5/11/2017.
 */
public class PromotingCasting {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        // Demonstrate that the division will return an integer and not a double
        System.out.println("No Promotion: x/y="+(x/y));

        // Demonstrate promotion by changing one value to double
        System.out.println("Promotion: x/2.0="+(x/2.0));

        // Demonstrate Casting
        System.out.println("Casting: (double)x/y="+((double)x/y));

        // Force Casting into the result x/y
        System.out.println("Casting: (double)(x/y)="+((double)(x/y)));
    }
}
