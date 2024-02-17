package com.abc;

public class SumOfDigitInNumber {

	public static void main(String[] args) {
		
		//number =123456
		int number=1234567;
		int sum=0;
		
		 while(number>0) {
			 
			 sum=sum+number%10;
			 
			 number=number/10;
		}
		 System.out.println("sum of digit of the number is"+ sum);
	}

}
