package com.abc;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		
		int sear =9;
		boolean flag =false;
		int a[]= {2,9,4,6,8,5,12,54,23};
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==sear)
			{
				
				System.out.println("Element found in the array "+ i);
			}
			
		}
		  
			System.out.println("Element not found in the array");
			
			
		}
	} 


