import java.util.Scanner;
public class CondtionStatements{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=s.nextInt();
        // Simple if-else statements
        if(num>0){
            System.out.println(num+" The number is positive number");
        }
        else if(num<0){
            System.out.println(num+" The number is negative number");
        }
        else {
            System.out.println(num+" The number is zero number");
        }
        //switch statement
        switch (num%2) {
            case 0:
            System.out.println(num+" The number is even number");
             break;
            case 1:
            System.out.println(num+" The number is odd number");
            break;
            default:
            System.out.println("inavalid input");
                break;
        }
        // Nested if statements
        if(num>=0){
            if(num==0){
             System.out.println(num+" The number is zero number");   
            }
            else{
              System.out.println(num+" The number is positive number");  
            }
        }
        else{
             System.out.println(num+" The number is negative number");
  
        }
        // ternary operator
        String res=(num==0)?"zero":((num%2==0)?"even":"odd");
        System.out.println(res+" using ternary operator");
    }
}