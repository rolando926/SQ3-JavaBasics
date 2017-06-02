package Polymorphism;

import java.sql.Driver;

/**
 * Created by RXC8414 on 5/26/2017.
 */
public abstract class AbstractSQLClass {

    String connectingString;

    // Empty method for instantiating the SQL driver
    // An empty method must have the keyword 'abstract'
    // An empty or abstract method must end with a ';' Note: NO curly braces
    // This method must have the return data type declared as well as any args
    public abstract String instantiateSQLDriver(String connectingString);

    public void initializeDriver(String dbType){
        String driver;
        switch(dbType){
            case "SQL SERVER":
                driver = "I need to use the SQL Server conn string with commands";
                break;
            case "ORACLE":
                driver = "Oracle....";
                break;
            case "MY SQL":
                driver = "MY SQL driver";
                break;
        }
    }

    // Select statement
    public static String selectStatement(String sql){
        return "We ran the select statement....";
    }

    // Update statement
    public static String updateStatement(String sql){
        return "We updated 10 records....";
    }

    // Insert statement
    public static String insertStatement(String sql){
        return "We inserted 20 records....";
    }

    // Insert statement
    public static String deleteStatement(String sql){
        return "We deleted 10 records....";
    }
}
