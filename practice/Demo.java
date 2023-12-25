package com.practice;
public class Demo {

	public static void main(String[] args) {
		BinaryConvertor bn= new BinaryConvertor();
        bn.binaryConvertor(32);	
        SumDigits sd= new SumDigits();
        SmallestNumber sm= new SmallestNumber();
        System.out.println("the sum of digits:" +sd.sumdigits(345));
        System.out.println("The smallest number is:"+sm.smallestnumber(2,99,14));
        VowelsCount VC=new VowelsCount();
        System.out.println("The number of vowels are:"+VC.vowels_count("the iiqqee"));
        Quadratic eq=new Quadratic();
        eq.solveEquation(1, 2, 1);
        Table t=new Table();
        t.table(4);
        BankAccount b=new BankAccount();
        b.setAccountNumber("ACC001");
        b.setAccounBalance("899900");
        System.out.println("the bank account number:"+b.getAccountNumber()+" with Balance :"+b.getAccounBalance());
        Circle circle=new Circle(7);
    	System.out.println("Area of circle:"+circle.calculateArea());
    	Rectangle rectangle=new Rectangle(4,6);
    	System.out.println("Area of rectangle:"+rectangle.calculateArea());

    	Triangle triangle=new Triangle(5,10);
    	System.out.println("Area of triangle:"+triangle.calculateArea());

	
	
	};
	
		
		
		

}
