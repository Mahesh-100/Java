package com.practice;

public class BinaryConvertor {
	int i=1,j;
    int bin_Num[]=new int[100];
    public void binaryConvertor(int num){
        while (num!=0) {
            bin_Num[i++]=num%2;
            num=num/2;
        }
         System.out.println("The binary number is:");
        for(j=i-1;j>0;j--){
            System.out.println(bin_Num[j]);
  
        }
        
        
    }


}
