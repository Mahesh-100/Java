public class Demo {

    public static void main(String[] args) {
        String name=" the result is ";
        A a= new A();
        B b=new B();
        a.add(name,12,34);
        b.mul(name,21,11);
       System.out.println(B.mul(2,8,9));
        Demo.info();
    }
     public static void info(){
        System.out.println("this is static method");
     }
}