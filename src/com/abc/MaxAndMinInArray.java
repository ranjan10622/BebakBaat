package com.abc;

public class MaxAndMinInArray {

	public static void main(String[] args) {
		
		// a[] = {-1,2,5,3,4,8,2}
		
		int a[] = {2,5,3,71,4,8,46,35};
		 int max=a[0];
		 int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				
				max=a[i];
				
			}
			
		}	
	System.out.println("The max number in the array is "+ max);
			
			for (int i=0;i<a.length;i++) {
				
				if(a[i]<min) {
					
					a[i]=min;
				}
			}
	    System.out.println("The min number in the array is "+ min);
	
	}

	

}
