package com.conditions;

public class SumDigits {
	public int sumdigits(int n) {
		int sum=0;
		while(n!=0) {
			sum+=n%10;
			n/=10;
			
		}
		return sum;
	}

}

