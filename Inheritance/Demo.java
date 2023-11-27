public class Demo {
 
  public static void main(String[] args) {


    // single inheritance
    Student student= new Student("Mahesh", 20, "19031A0513");
    student.displayStudentInfo();



   // Multiple inheritance
   Teacher teacher=new Teacher("Raji", 33,"Java");
   teacher.displayInfo();
   teacher.work();



   // Hierarchical inheritance
   Athlete athlete=new Athlete("Harsha", 20, "Volleyball");
   athlete.displayInfo();
   athlete.playSport();
   
   }
}
