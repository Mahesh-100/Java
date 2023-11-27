// subclass--> Hierarchical inheritance
public class Athlete extends Person {
    String sport;
    Athlete(String name, int age,String sport) {
        super(name, age);
        this.sport=sport;
    }
    public void playSport(){
        System.out.println(name+"   is playing   "+sport);
    }

    
}
