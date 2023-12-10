import mahesh.myfiles.Public;

public class Demo{
    public static void main(String[] args) {
        Default d=new Default();
        
        Public p=new Default();
        d.info();
        p.info1();
        d.show();//--->protected method-->since outside the package by sub class 
      //  p.print();//--->defualt method-->compile time error--> since outiside the package 
    }
}
