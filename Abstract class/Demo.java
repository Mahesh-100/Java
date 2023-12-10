public class Demo {
    public static void main(String[] args) {
        Bank b;
        b=new SBI();
        System.out.println("SBI's Rate of Interest is:"+b.getRateOfInterest()+"%");
        b=new UNB();
        System.out.println("UNB's Rate of Interest is:"+b.getRateOfInterest()+"%");
    }
}
