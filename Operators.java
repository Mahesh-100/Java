public class Operators {
    public static void main(String[] args) {
        
                // Arithmetic operators
                int a = 10, b = 5;
                System.out.println("Arithmetic Operators:");
                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " + (a - b));
                System.out.println("a * b = " + (a * b));
                System.out.println("a / b = " + (a / b));
                System.out.println("a % b = " + (a % b));
        
                // Relational operators
                System.out.println("\nRelational Operators:");
                System.out.println("a > b: " + (a > b));
                System.out.println("a < b: " + (a < b));
                System.out.println("a >= b: " + (a >= b));
                System.out.println("a <= b: " + (a <= b));
                System.out.println("a == b: " + (a == b));
                System.out.println("a != b: " + (a != b));
        
                // Logical operators
                boolean x = true, y = false;
                System.out.println("\nLogical Operators:");
                System.out.println("x && y: " + (x && y));
                System.out.println("x || y: " + (x || y));
                System.out.println("!x: " + !x);
        
                // Bitwise operators
                int num1 = 5, num2 = 3;
                System.out.println("\nBitwise Operators:");
                System.out.println("num1 & num2: " + (num1 & num2));
                System.out.println("num1 | num2: " + (num1 | num2));
                System.out.println("num1 ^ num2: " + (num1 ^ num2));
                System.out.println("~num1: " + (~num1));
        
                // Assignment operators
                System.out.println("\nAssignment Operators:");
                a += b;
                System.out.println("a += b: " + a);
        
                // Conditional (Ternary) operator
                int max = (a > b) ? a : b;
                System.out.println("\nConditional Operator:");
                System.out.println("Maximum value: " + max);
    }
    
}
