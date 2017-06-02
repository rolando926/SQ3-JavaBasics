package Lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by RXC8414 on 6/2/2017.
 */
public class ListCollection {
    public static void main(String[] args) {

        // Defining array of all students in class
        String[] students = {"Issac","Charles","Danny","Nathan",
                            "Juanita","Michael","Dan"};
        // print out the array
        System.out.print("Array: ");
        for (String temp:students) {
            System.out.print(temp+" ");
        }

        // Convert this array into a list
        List<String> myList = Arrays.asList(students);
        System.out.print("\nmyList: ");
        for (String temp:myList) {
            System.out.print(temp+" ");
        }

        // Convert the initial array into an ArrayList
        ArrayList<String> myArrayList = new ArrayList<>(myList);
        System.out.print("\nmyArrayList: ");
        for (String temp:myArrayList) {
            System.out.print(temp+" ");
        }

        // Example of using replaceAll with Lambdas
        //myList.replaceAll(str -> str+"!");
        myList.replaceAll(str -> (str.length() > 5)?str+"!":str );
        System.out.print("\nmyList(replaceAll): ");
        for (String temp:myList) {
            System.out.print(temp+" ");
        }

        // Example of using removeIf with Lambdas
        // Note: removeIf only works with ArrayLists
        //myArrayList.removeIf(str -> str.charAt(0) == 'M');

        // Exercise: Create a lambda expression for removing any name
        // with more than one 'a' vowel
        myArrayList.removeIf(str -> {
            int count = 0;
            for(int i = 0; i < str.length(); i++){
                // By popular demand!!! Regex...
                if((Character.toString(str.charAt(i))).matches("[aA]")){
                    count++;
                }
            }
            return (count > 1)?true:false;
        });

        System.out.print("\nmyList(removeIf): ");
        for (String temp:myArrayList) {
            System.out.print(temp+" ");
        }
        System.out.println();
    }
}
