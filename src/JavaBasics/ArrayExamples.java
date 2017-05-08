package JavaBasics;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by RXC8414 on 5/4/2017.
 */
public class ArrayExamples {
    public static void main(String[] args) {
        double[] numbers = {5.6,4.5,13.2,4.0,34.33,34.0,45.45,3.3,99.993,11123};

        // 1. Print out all number inside array
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        // 2. Print out the sum of all numbers
        double sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum+=numbers[i]; // sum = sum + number[i]
        }
        System.out.println("sum="+sum);

        // 3. Print out all numbers which are
        // greater than 10 but less than 100
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] > 10 && numbers[i] < 100){
                System.out.println("number:" + numbers[i]);
            }
        }


        // 4. Print out the index occurrence of 34.33
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 34.33){
                System.out.println("index: "+i);
                break;
            }
        }

        // 5. Print out the index and the value of the smallest number
        double smallest = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
                index = i;
            }
        }
        System.out.println("Smallest: "+smallest);
        System.out.println("Index: "+index);

    }
}