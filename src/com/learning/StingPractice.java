package com.learning;

public class StingPractice {

	public static void main(String[] args) {
		
	/*	String s1= "RANJAN MOHAN";
		  s1.length();
		  System.out.println(s1.length());  */
		  
		  char[] c1 = {'R','A','N','J','A','N','M','O','H','A','N'};
		  
		  String s2= new String(c1);
		    
		   System.out.println(s2);
		   
		   for(int i=s2.length()-1;i>=0;i--)
		   {
			   System.out.println(s2.charAt(i));
		   }
		  
		   
		  
		  

	}

}
