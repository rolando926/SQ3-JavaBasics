package JavaExercises;

/**
 * Created by RXC8414 on 5/23/2017.
 */
public class RandomMain {
    public static void main(String[] args) {
        RandomString random = new RandomString();

        // Boundary tests
        System.out.println(random.randomString(5));
        System.out.println(random.randomString(10));

        // Mid range test
        System.out.println(random.randomString(7));

        // Invalid lengths
        System.out.println(random.randomString(4));
        System.out.println(random.randomString(15));
        System.out.println(random.randomString(11));
        System.out.println(random.randomString(-5));

    }
}
