package com.abc;

import java.util.Arrays;

public class TwoArrayEqual {

	public static void main(String[] args) {
		// a[i]= {1,3,5,7,9]   a[j]= {1,3,4,7,8]
		
		int a[]= {2,4,5,7,9};
		int b[]= {2,4,5,7,9};
		
		   boolean status= Arrays.equals(a,b);
		     
		   if(status==true)
		   {
			   System.out.println("Arrays are equals");
		   }
		   else
			   System.out.println("Arrays are not equals");
	}

}
