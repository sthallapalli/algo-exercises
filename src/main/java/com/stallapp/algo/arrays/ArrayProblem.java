package com.stallapp.algo.arrays;

import java.util.Arrays;

/*
 *  
consider an array1={1,1,1,1,1,1,1,1,1,1}
if n=4 add first four elements and next four elements
result : array1={4,4,2}
if n=3 add first three elements and next three elements repeat process untill size of array <=n
result1:
array1={3,3,3,1}
result2 : array1={6,4}
 */

public class ArrayProblem {

	public static void main(String[] args) {
		int[] array1 = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		int n = 4;
		int[] result1 = new int[(array1.length/n) + 1];
		int k = 0;
		for (int i = 0; i < array1.length; i++) {
			int sum = 0;
			int j;
			
			for (j= i; j<n ; j++) {
				sum = sum + array1[j];
			}
			result1[k] = sum;
			k ++;
			i = j-1;
			n = (n+j) > array1.length ? array1.length : n+j;
		}
		System.out.println(Arrays.toString(result1));
		
		
		
		int [] array = {1,1,1,1,1,1,1,1,1,1,1};		
		int m = 3;
		for( int i = 0; i < array.length; i = i + m ){			
			System.out.println( addArrayItems ( i, (( array.length - i) < m ) ? array.length: i + m,  array ));
		}
	}	
	
	
	
	private static int addArrayItems( int start, int end, int [] arrays ){
		int sum = 0;
		for( int i = start; i < end; i++ ){
			sum += arrays[i];
		}
		return sum;
	}
}
