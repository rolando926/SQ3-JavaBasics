package Polymorphism;

import java.sql.Driver;

/**
 * Created by RXC8414 on 5/26/2017.
 */
public class AbstractMain extends AbstractSQLClass {

    public String instantiateSQLDriver(String connString){
        return "Some String";
    }

    public static void main(String[] args) {
        // Call the instantiation of the driver....
        System.out.println(selectStatement("Select..."));
        System.out.println(updateStatement("Update..."));
        System.out.println(insertStatement("Insert..."));
        System.out.println(deleteStatement("Delete..."));
    }

}
