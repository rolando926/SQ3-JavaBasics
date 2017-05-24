package JavaExercises;

/**
 * Created by RXC8414 on 5/23/2017.
 */
public class FizzBuzzTernary {
    public static void main(String[] args) {
        String str;
        for(int i = 1; i<=100; i++){
            str = (i%3 == 0)?((i%5 == 0)?"-FizzBuzz":"-Fizz"):((i%5 == 0)?"-Buzz":"");
            System.out.println(i+str);
        }
    }
}
