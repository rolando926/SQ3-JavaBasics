package JavaBasics;

/**
 * Created by RXC8414 on 5/8/2017.
 */
public class ForEach {
    public static void main(String[] args) {
        double[] numbers = {5.6,4.5,13.2,4.0,34.33,34.0,45.45,3.3,99.993,11123};

        //Use the for each to traverse all elements of the array
        for (double temp:numbers){
            System.out.println(temp);
        }
    }
}
