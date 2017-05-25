package DataManipulation;

/**
 * Created by RXC8414 on 5/24/2017.
 */
public class DoubleArray {
    public static void main(String[] args) {
        // Initializing double dimension array when don't know the values but do know the size
        String[][] numbers = new String[3][7];

        //Double for loop in order to traverse the double dimension array
        for (int row = 0; row < numbers.length; row++){ //outer loop for rows, which are 3
            for (int col = 0; col < numbers[row].length; col++){ // loop for cols, which are 7
                // String.valueOf ==> changes number into String
                numbers[row][col] = String.valueOf(row)+String.valueOf(col);
                System.out.print(numbers[row][col]+" "); // prints sequentially sideways
            }
            System.out.println(); // for each row I create a new line
        }


        // Exercise: Create a random double dimension array
        // Minimum size = 5x5 Maximum = 10x10 => randomly generated
        // Fill the array with random numbers 0-100
        // Print out the largest number

        // int Random = (int) (Math.random() * 6) + 5; return a number from 5-10
    }
}
