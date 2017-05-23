package MethodsEncapsulation;

/**
 * Created by RXC8414 on 5/22/2017.
 */
public class NestedConditionals {
    private int month;
    private boolean isLeapYear = true;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        daysInTheMonth(month);
    }

    private void daysInTheMonth(int month){
        String strMessage;
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 ||
                month == 10 || month == 12){
            strMessage = "This is a 31 days month.";
        }
        // This is the portion that we have a nested conditional
        else if (month == 2){
            if(isLeapYear) {
                strMessage = " This is a 29 days month.";
            }
            else{
                strMessage = " This is a 28 days month.";
            }
        }
        else if (month == 4 || month == 6 || month == 9 || month == 11){
            strMessage = "This is a 30 days month.";
        }
        else{
            strMessage = "This is an invalid month.";
        }

        System.out.println(strMessage);
    }
}
