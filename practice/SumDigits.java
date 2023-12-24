package com.practice;

public class SumDigits {
	int sum=0;
	
     public int sumdigits(long num) {
    	 
    	 while(num!=0){
    		 sum+=num%10;
    		 num/=10;
    	 }
    	return sum; 
     }
}
