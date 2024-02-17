package com.abc;

public class DuplicateNumberInArray {

	public static void main(String[] args) {
		//a[]= {1,2,3,5,4,4,9}
		
		int a[]= {1,2,3,4,4,5,9,9};
		int dup= a[0];

		 for(int i=1;i<a.length;i++) {
			 
			 if(a[i]==dup) {
				  
				 System.out.println("The duplicate number in the array is "+dup);
			 }
			 dup=a[i]++;
		
		 }
	}

}
