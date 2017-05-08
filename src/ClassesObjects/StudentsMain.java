package ClassesObjects;

/**
 * Created by RXC8414 on 5/8/2017.
 */
public class StudentsMain {
    public static void main(String[] args) {
        //Instantiate against the newly created Students class
        Students myStudents = new Students();

        // Students = class name
        // new = implies new object to be created
        // Students() = a call to the Students constructor

        // I want to reach out to the fields and methods inside the Students
        // class through the myStudents object
        System.out.println(myStudents.studentsArr[4]);

        // I want to reach out to the Student's helper class
        System.out.println(myStudents.type.employeeType[0]);

    }
}