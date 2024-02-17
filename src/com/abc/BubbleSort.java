package com.abc;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		// {9,2,4,3,6,8}
		
		int a[]= {9,2,40,3,34,56,17,6,8,};
		System.out.println("Array before sorting "+ Arrays.toString(a));
		 int n=a.length;
		
		for(int i=0;i<n-1;i++)   //number of passes
		{
			for(int j=0;j<n-1;j++) //iterations in each parse
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
			
		}
		
		System.out.println("Array after sorting "+ Arrays.toString(a));
	}

}
