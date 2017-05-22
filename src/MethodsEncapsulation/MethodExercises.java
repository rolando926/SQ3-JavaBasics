package MethodsEncapsulation;

/**
 * Created by RXC8414 on 5/18/2017.
 */
public class MethodExercises {
    public static void main(String[] args) {
        // Instantiate my Exercises class
        Exercises myExercises = new Exercises();

        // Generate Random Number
        int number = myExercises.randomNumber(100);
        System.out.println(number);

        // Print all number divisible by 3 and 5
        myExercises.divisibleBy3And5(100);

        // Add all numbers from an array through method call
        int[] numbers = {1,4,7,11,2,3,21,17,15,7};
        number = myExercises.addAllValuesFromArray(numbers);
        System.out.println("\nSum="+number);

        // Find vowels in String through method
        String str = "Three eyes have I, all in a row; when the red one opens, all freeze.";
        number = myExercises.countVowelsString(str);
        System.out.println("Vowels = "+number);

        myExercises.replaceCharInString(str,"$");
    }
}
