package com.abc;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
     
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number");
		  int num=sc.nextInt();
		//int num =12345;
		int reverse=0;
		while(num!=0)
		{
			int remainder= num%10;  //4
			reverse=reverse*10+remainder;
			num = num/10;
			
		}
		system.out.println("The reverse of number is "+ reverse);
		
	
		
		
	}

}
