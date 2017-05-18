package MethodsEncapsulation;

/**
 * Created by RXC8414 on 5/18/2017.
 */
public class Exercises {

    public int randomNumber(int limit){
        int number;
        number = (int)(Math.random() * limit) + 1;
        return number;
    }

    public void divisibleBy3And5(int limit){
        for(int i = 0; i <= limit; i++){
            if( i % 3 == 0 && i % 5 == 0){
                System.out.print(i+" ");
            }
        }
    }

    public int addAllValuesFromArray(int[] numbers){
        int sum = 0;
        for (int temp:numbers) {
            sum += temp;
        }
        return sum;
    }

    public int countVowelsString(String str){
        int counter = 0;
        String vowels = "aeiouAEIOU";
        char[] vowelsAry = str.toCharArray();
        for(int i = 0; i < str.length(); i++){

            // Solution #1
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A' ||
                str.charAt(i) == 'e' || str.charAt(i) == 'E' ||
                str.charAt(i) == 'i' || str.charAt(i) == 'I' ||
                str.charAt(i) == 'o' || str.charAt(i) == 'O' ||
                str.charAt(i) == 'u' || str.charAt(i) == 'U'){
                //counter++;
            }

            // Solution #2
            if(vowels.contains(Character.toString(str.charAt(i)))){
                counter++;
            }
        }
        return counter;
    }
}
