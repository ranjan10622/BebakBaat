package com.abc;

public class DuplicateStringInArray {

	public static void main(String[] args) {
		String a[] = {"python","c++","ruby","javascript","java"};
		
		
		boolean flag = false;
		for(int i =0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				
				if(a[i]==a[j]) {
					
					System.out.println("The duuplicate value in the array is "+a[i]);
					flag=true;
				}
				
			}
	      
			
			if(flag==false)
				
			{
				System.out.println("There is no duplicate value");
			}
		}
		
		
		
		

	}

}
