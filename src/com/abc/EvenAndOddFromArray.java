package com.abc;

public class EvenAndOddFromArray {

	public static void main(String[] args) {
		//{2,3,5,7,9} even=2 ,odd=3,5,7,9
		
		 int a[]= {2,4,6,3,5,9,7};
		  
		  System.out.println("Even numbers in the array are :");
		  for(int i=0;i<a.length;i++) {
			  
			  if(a[i]%2==0) 
				  
				 System.out.println(a[i]);
			  }
			  
			System.out.println("odd numbers in the array are:");	  
		   for(int i=0;i<a.length;i++)
		          {
			   
			   if(a[i]%2!=0) {
				   
				   System.out.println(a[i]);
			   }
		   }
			  
		  }

	}


