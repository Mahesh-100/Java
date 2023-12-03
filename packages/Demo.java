import myfiles.Parent;
public class Demo {
    public static void main(String[] args) {
        Parent p=new Sub();
        Child ch= new Child();
        Sub s= new Sub();
        int res=p.add(3,2);
        System.out.println(res);
        double re=ch.mul(3,2);
        System.out.println(re);
        int r=s.add(3,2,5);
        System.out.println(r);
    
    }
}

