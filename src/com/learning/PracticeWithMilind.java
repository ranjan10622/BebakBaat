package com.learning;

import java.util.Arrays;

public class PracticeWithMilind {

	public static void main(String[] args) {
       // Use i,j - Reverse , Start,end-swap 
	   int [] abc = {10,20,30,40,50,60};      
       int start = 0;
       int end = abc.length-1;
       int rev = 0;
       for(int i= start,j=end; i<j; i++,j--) {
    	   rev = abc[start];
    	   abc[start] = abc[end];
    	   abc[end]=rev;	   
       }
      System.out.println(Arrays.toString(abc));
       
       
	}
}
