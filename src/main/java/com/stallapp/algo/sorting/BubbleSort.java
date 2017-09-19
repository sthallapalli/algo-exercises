package com.stallapp.algo.sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = { 4, 2, 6, 1, 5, 3 };
		System.out.println("Before Sort: " + Arrays.toString(a));
		long start = System.nanoTime();
		optimizedBubbleSort(a);
		long end = System.nanoTime();
		System.out.println("After Sort: " + Arrays.toString(a) + " in " + (end - start) + "ns");
		
	}

	private static void bubbleSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) { 
				if (a[j-1] > a[j]) {
					int temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	private static void optimizedBubbleSort(int[] a) {
		int n = a.length;
		boolean swapped = true;
		while (swapped) {
			for (int i = 1; i < n; i++) {
				swapped = false;
				if(a[i-1] > a[i]) {
					int temp = a[i-1];
					a[i-1] = a[i];
					a[i] = temp;
					swapped = true;
				}
			}
			n = n-1;
		}
	}
}
