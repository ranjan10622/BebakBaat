package com.abc;

public class SumOfArray {

	public static void main(String[] args) {
		// [56789] =5+6+7+8+9
		
	   int	a[]= {5,2,7,9,6};
	  int sum=0;
	      
	      for(int i=0;i<a.length;i++) {
	    	  
	    	  sum=sum+a[i];
	      }
            System.out.println("The sum of array is "+ sum);
	}

}
