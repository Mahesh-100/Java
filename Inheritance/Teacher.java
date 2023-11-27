// Subclass-->Multiple inheritance
public class Teacher extends Person implements Employee  {
    String subject;

    Teacher(String name, int age,String subject) {
        super(name, age);
        this.subject=subject;
        
    }

    @Override
    public void work() {
        System.out.println(name+"  is teaching   "+subject);
    }
    
}
