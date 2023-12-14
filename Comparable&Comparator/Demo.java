import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        
        // Adding students to the list
        studentList.add(new Student(101, "Mahesh", 20));
        studentList.add(new Student(102, "Boni ", 22));
        studentList.add(new Student(103, "Charlie", 21));

        // Sorting students based on ID
        Collections.sort(studentList);
       
        // Printing the sorted list
        for (Student student : studentList) {
            System.out.println("ID: " + student.id + ", Name: " + student.name + ", Age: " + student.age);
        }
        System.out.println("// Printing the sorted list baesd on name");
        // Sorting students based on Name
         Collections.sort(studentList, new StudentNameComparator());
         // Printing the sorted list
         for (Student student : studentList) {
            System.out.println("ID: " + student.id + ", Name: " + student.name + ", Age: " + student.age);
        }
    }
}
