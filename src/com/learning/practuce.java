package com.learning
;

public class practuce {

	public static void main(String[] args) {
	String str = "RanjanMohan";
	   int capCount=0;
	   int lowerCount=0;
	  for(int i=0; i<str.length();i++) {
		if(Character.isLowerCase(str.charAt(i))) {
			lowerCount++;
		 }if(Character.isUpperCase(str.charAt(i))) {
			 capCount++;
		 }
		}
		 System.out.println(capCount + " : " + lowerCount);
	  }
	}
	


