package JavaExercises;

/**
 * Created by RXC8414 on 5/23/2017.
 */
public class RandomString {

    public String randomString(int number){
        String str = "";
        if(number < 5 || number > 10){
            number = 5;
        }
        for(int i = 0; i < number; i++){
            str+=genChar();
        }
        return str;
    }

    public String genChar(){
        return Character.toString((char) ((int)(Math.random()*93)+33));
    }

}
