package com.abc;

public class PrimeNumber {

	public static void main(String[] args) {
		// no. divides from itself  like,2,3,5,7,11,13,17...
		
		int num=15;
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
			} 
			if(count==2)
			{
				System.out.println("prime number");
			}
		
			else {
				
				System.out.println("Not a prime number");
			}
			
				
		}

	}

}
