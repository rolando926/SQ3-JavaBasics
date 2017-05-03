package JavaBasics;

/**
 * Created by RXC8414 on 5/3/2017.
 */
public class Grades {
    public static void main(String[] args) {
        int score = 67;
        if(score >= 90){
            System.out.println("Your go an A!");
        }
        else if(score >= 80 && score < 90){
            System.out.println("You got a B!");
        }
        else if(score >= 70 && score < 80){
            System.out.println("You got a C!");
        }
        else if(score >= 60 && score < 70){
            System.out.println("You got a D!");
        }
        else{
            System.out.println("You got a F!");
        }
    }
}
