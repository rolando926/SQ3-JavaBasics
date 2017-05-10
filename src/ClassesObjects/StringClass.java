package ClassesObjects;

/**
 * Created by RXC8414 on 5/10/2017.
 */
public class StringClass {
    public static void main(String[] args) {
        String str = "My name is Rolando.";

        // Let take a peek at all String methods
        System.out.println(str);

        // Lets change to Upper Case
        System.out.println(str.toUpperCase());

        // Lets change it to lower case
        System.out.println(str.toLowerCase());

        // Let see how long it is
        System.out.println(str.length());

        //Find me the first occurrence of the letter 'o'
        System.out.println(str.indexOf('o'));

        // Lets change this to an array
        char[] strAry = str.toCharArray();
        for(int i = 0; i < strAry.length; i++){
            if(strAry[i] == 'o'){
                strAry[i] = '*';
                break;
            }
        }
        str = String.valueOf(strAry);
        System.out.println(str);

        // Comparing 2 strings
        String str2 = "My name is R*lando.";
        if(str.equals(str2)){
            System.out.println("The 2 strings are the same.");
        }
        else{
            System.out.println("The 2 strings are not the same.");
        }

        // Contains
        if(str.contains("R*lando")){
            System.out.println("The second string is inside the first string.");
        }
        else{
            System.out.println("The second string is not inside the first string.");
        }

        // Removing a portion of the string
        System.out.println(str.substring(0,12));
        System.out.println(str.substring(0,str.indexOf('o')));
        System.out.println(str.substring(3,str.length()));
    }
}
