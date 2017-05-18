package MethodsEncapsulation;

/**
 * Created by RXC8414 on 5/17/2017.
 */
public class MethodsMain {
    public static void main(String[] args) {
        // First thing is to instantiate
        MathUtils math = new MathUtils();

        // I save the value into a variable of the same data type as the method
        int sum = math.add(100, 28);

        // I do some manipulation with my new value
        System.out.println(sum);

        // I can also call methods inside another method as long as the method
        // data type is of the signature as the argument being passed
        System.out.println(math.add(math.add(20, 40), 40));

        // Verify access modifiers from instantiation
        // First: we need to instantiate the newly created class
        DataVisibility data = new DataVisibility();

        // Second: We need to use our newly created object
        data.message = "No Hello"; // Reassigning values to public fields
        System.out.println(data.message);
        data.printMessage();

        // In order to avoid direct access to data we then use encapsulation
        // you hide data while providing back doors with rules
        Encapsulation enc = new Encapsulation();

        // Without any rules
        System.out.println(enc.getMessage());
        enc.setMessage("No Encapsulation Hello");
        System.out.println(enc.getMessage());
    }
}