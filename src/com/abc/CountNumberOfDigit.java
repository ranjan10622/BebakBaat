package com.abc;

public class CountNumberOfDigit {

	public static void main(String[] args) {
		
		/*Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a Number");
		  int num = sc.nextInt();// 
		    int total= num;
		 // int count=0;
		    */
		    int num=856796888;
		    int count=0;
		    
		     while(num>0) {
		    	 
		    	 num=num/10;
		    	 count++;
		     }
		     System.out.println("The number of digit in the number is "+ count);
	}

}
