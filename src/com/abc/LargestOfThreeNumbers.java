package com.abc;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
	/*	
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the first number");
		 int a = sc.nextInt();
		 
		 System.out.println("Enter the Second number");
		 int b = sc.nextInt();
		 
		 System.out.println("Enter the Third number");
		 int c = sc.nextInt();	
		   
		 if(a>b && a>c)
		 {
			 System.out.println(a+ "is the largest nuumber");
		 }
		 else if(b>a && b>c){
			  System.out.println(b+ "is the largest number");
			  
			  }
		 else
			  System.out.println(c+ "is largest number");
		*/
		   int a=10,b=20,c=30;
		   int min = Math.min(c,Math.min(a, b));  
		   System.out.println(min);
		
	}

	

}
