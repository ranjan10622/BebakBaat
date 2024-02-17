package com.abc;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		 //1!=1 ,2!=2*1 ,3!=3*2*1, 4!=4*3*2*1 ,5!=5*4*3*2*1
		
		
		int num=10;
		long factorial=1;
		 
		for(int i=1;i<=num;i++)
		{
			 factorial= factorial*i;
		
		
	}
		
    System.out.println("The factorial of a number is "+ factorial);
}
}