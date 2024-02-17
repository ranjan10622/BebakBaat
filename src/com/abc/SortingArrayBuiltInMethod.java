package com.abc;

import java.util.Arrays;

public class SortingArrayBuiltInMethod {

	public static void main(String[] args) {
		
		int a[]= {20,12,34,5,17,19,45};
		
		System.out.println("Array Before soring "+ Arrays.toString(a));
	           Arrays.parallelSort(a);

		System.out.println("Array after sorting "+ Arrays.toString(a));
	}

}
