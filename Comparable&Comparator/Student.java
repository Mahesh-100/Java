
public class Student implements Comparable<Student>{
    
     int id;
    String name;
    int age;
    Student(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;

    }
    public int compareTo(Student student) {
        return Integer.compare(this.id,student.id);
        
        
        
    }
    

}
