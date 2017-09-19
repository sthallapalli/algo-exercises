package com.stallapp.algo.sorting;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 4, 2, 6, 1, 5, 3 };
		long start = System.nanoTime();
		quickSort(a, 0, a.length -1);
		long end = System.nanoTime();
		System.out.println("After Sort: " + Arrays.toString(a) + " in " + (end - start) + "ns");

	}

	private static void quickSort(int[] a, int start, int end) {
		if (start < end) {
			int p = getPartition(a, start, end);
			quickSort(a, start, p - 1);
			quickSort(a, p + 1, end);
		}
	}

	private static int getPartition(int[] a, int start, int end) {
		int pivot = a[end];
		int pIndex = start;
		for (int j = start; j < end; j ++ ) {
			if (a[j] <= pivot) {
				int temp = a[pIndex];
				a[pIndex] = a[j];
				a[j] = temp;
				pIndex++;
			}
		}
		int temp = a[pIndex];
		a[pIndex ] = a[end];
		a[end] = temp;
				
		return pIndex;
	}

}
