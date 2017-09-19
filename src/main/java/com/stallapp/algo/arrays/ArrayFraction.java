package com.stallapp.algo.arrays;

import java.util.Scanner;


/*
 * Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667
Explanation

There are  positive numbers,  negative numbers, and  zero in the array. 
The respective fractions of positive numbers, negative numbers and zeroes are 3/6, 2/6 and 1/6, respectively.
 */
public class ArrayFraction {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt(); scanner.nextLine();
		
		int[] a = new int[size];
		for (int i = 0; i< size ; i++) {
			int x = scanner.nextInt();
			a[i] = x;
		}
		
		scanner.close();
		int p = 0;
		int n = 0;
		int z = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				p = p+1;
			} else if (a[i] < 0) {
				n = n+1;
			} else {
				z = z+1;
			}
		}
		
	
		String formattedNum1 = String.format("%.6f", (float)p/size);
		String formattedNum2 = String.format("%.6f", (float)n/size);
		String formattedNum3 = String.format("%.6f", (float)z/size);
		
		System.out.println(formattedNum1);
		System.out.println(formattedNum2);
		System.out.println(formattedNum3);
	}
}
