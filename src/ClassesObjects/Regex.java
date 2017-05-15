package ClassesObjects;

/**
 * Created by RXC8414 on 5/12/2017.
 */
public class Regex {

    // Create a method that returns if full name is valid or not
    public void verifyFullName(String name){
        String regex = "^[A-Z][A-Za-z]+ [A-Z][A-Za-z]+";
        if(name.matches(regex)){
            System.out.println(name+" is a valid name.");
        }
        else{
            System.out.println(name+" is not a valid name.");
        }
    }

    // Create a method that receives an array of Strings and applies regex to them
    public void applyRgxArrayString(String[] names, int rule){
        String[] regexRules = new String[4];
        String ruleToApply;

        // Regex rule for names less/equal than 5 characters
        regexRules[0] = ".{5}";

        // Regex rule for names greater/equal than 6 but less/equal than 7
        regexRules[1] = ".{6,7}";

        // Regex rule for names that start with the letter B
        regexRules[2] = "^B.*";

        // Regex rule for names that end with 'y'
        regexRules[3] = ".*y$";

        // Conditional for rules
        if(rule == 1){
            ruleToApply = regexRules[0];
        }
        else if(rule == 2){
            ruleToApply = regexRules[1];
        }
        else if(rule == 3){
            ruleToApply = regexRules[2];
        }
        else if(rule == 4){
            ruleToApply = regexRules[3];
        }
        else{
            System.out.println("This rule does not exist. Please select rules 1-4.");
            return;
        }

        // Another way of doing a conditional statement
        switch(rule){
            case 1:
                ruleToApply = regexRules[0];
                break;
            case 2:
                ruleToApply = regexRules[1];
                break;
            case 3:
                ruleToApply = regexRules[2];
                break;
            case 4:
                ruleToApply = regexRules[3];
                break;
            default:
                System.out.println("This rule does not exist. Please select rules 1-4.");
                return;
        }

        // Print out the valid names
        for (String temp:names) {
            if(temp.matches(ruleToApply)){
                System.out.println(temp);
            }
        }


    }


    public void validateEmail(String[] emails){
        String regexRuleApply = "^[^@]{3}[^@]*@[a-zA-Z]+((.com)|(.org)|(.net)|(.gov))$";
        for (String temp:emails) {
            if(temp.matches(regexRuleApply)){
                System.out.println(temp);
            }
        }
    }
}