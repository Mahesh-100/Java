// Subclass--> single inheritance
public class Student extends Person {
    String studentId;

    Student(String name, int age,String studentId) {
        super(name, age);// call the constructor of the superclass(person)
        this.studentId=studentId;
    }
    public void displayStudentInfo(){
        displayInfo();  // Access method from the super class
        System.out.println("student ID:"+studentId);
    }
    
}
