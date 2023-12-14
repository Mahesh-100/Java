import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Compare based on student name
        return s1.name.compareTo(s2.name);
    }
}
