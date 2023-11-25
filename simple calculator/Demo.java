import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner z= new Scanner(System.in);
        System.out.println("Enter a:");
        int x=z.nextInt();
        System.out.println("Enter b:");
        int y=z.nextInt();
        System.out.println("Enter the operator(+,-,*,/):");
        String op=z.next();
        int c=0;
        Calculater calc=new Calculater(x,y);
        
        switch (op) {
            case "+":c=calc.add();break;
            case "-":c=calc.sub();break;
            case "*":c=calc.mul();break;
            case "/":c=calc.div();break;
            default:
            System.out.println("Invalid");
                break;
        }
        System.out.println(x+op+y+"="+c);
    }
}
