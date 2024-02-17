package com.abc;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a string");
			   String str=sc.next();
			  String org_str=str;
			   
			   //logic for reverse a string //ABBA or RANJAN
			     String rev="";
			    for(int i=((str.length())-1);i>=0;i-- )
			    {
			          rev=rev+str.charAt(i);         	
			    }
			    System.out.println(rev);

			    if(org_str.equals(rev)) {
			    	
			    	System.out.println("The string is a palindrome"+ org_str);
			    }
			    else {
			    	
			    	System.out.println("The string is not a palindrome");
			    }
		}
            
	}            
	 
                 
	  
}
