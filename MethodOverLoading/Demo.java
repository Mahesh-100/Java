public class Demo {
    public static void main(String[] args) {
    int a=3;
    int b=4;
    int c=5;
    MethodOverLoading m=new MethodOverLoading();
    int res=m.add(a,b,c);
    System.out.println(res);
    int re=m.add(a,b);
    System.out.println(re);
   }
}
