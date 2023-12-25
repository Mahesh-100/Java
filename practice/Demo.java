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
        Quadrilateral eq=new Quadrilateral();
        eq.solveEquation(1,-2,1);
        Table t=new Table();
        t.table(4);
        
	}

}
	