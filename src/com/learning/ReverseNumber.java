package com.learning;

public class ReverseNumber {

	public static void main(String[] args) {
		//123456
		
		int num = 1234567;
		 
		int count= 0;
		
	   while(num>0){
		  num=num/10;
		  count++;
		}
		System.out.println(count);
		
		/*int rev=0;
	    while(num>0) {
	    rev = rev*10 + num%10;
	    num=num/10;
	    }
	    System.out.println(rev);
	     */

	    }

}
