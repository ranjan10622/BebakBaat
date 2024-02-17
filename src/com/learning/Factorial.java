package com.learning;

public class Factorial {

	public static void main(String[] args) {
		
		int fact=1;
		int num=8;
		
		
		for(int i=1;i<num;i++)
		{
			fact=fact+fact*i;
				
		}
		System.out.println("Factorial of a number"+ fact);

	}

}
