package com.abc;

public class NumberOfEvenAndOdd {

	public static void main(String[] args) {
		 
		int num=1235884;
		  int even_count=0;
		  int odd_count=0;
		 
		  while(num>0) {
			  
			  int extract= num/10;
			  
			  if(extract%2==0)
			  {
				  even_count++;
				 
			  }
			  else {
				  odd_count++;
			  }
			num=num/10;
		  }
		  System.out.println("The number of even count"+ even_count);
		  System.out.println("The number of odd count"+ odd_count);
		  
	}

}
