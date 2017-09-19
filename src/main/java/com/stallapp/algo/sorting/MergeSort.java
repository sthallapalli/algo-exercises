package com.stallapp.algo.sorting;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] a = { 4, 2, 6, 1, 5, 3 };
		long start = System.nanoTime();
		mergeSort(a);
		long end = System.nanoTime();
		System.out.println("After Sort: " + Arrays.toString(a) + " in " + (end - start) + "ns");
	}

	private static void mergeSort(int[] a) {

		if (a.length < 2)
			return;

		int mid = a.length / 2;

		int[] leftA = new int[mid];
		int[] rightA = new int[a.length - mid];

		for (int i = 0; i < mid; i++) {
			leftA[i] = a[i];
		}

		for (int i = mid; i < a.length; i++) {
			rightA[i - mid] = a[i];
		}

		mergeSort(leftA);
		mergeSort(rightA);

		merge(leftA, rightA, a);

	}

	private static void merge(int[] leftA, int[] rightA, int[] a) {
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < leftA.length && j < rightA.length) {
			if (leftA[i] <= rightA[j]) {
				a[k] = leftA[i];
				i++;
				k++;
			} else {
				a[k] = rightA[j];
				j++;
				k++;
			}
			// k++, we can increment k here also, by ,making it common instead
			// having in if else.
		}

		// This loop is for copying leftovers in leftA
		while (i < leftA.length) {
			a[k] = leftA[i];
			i++;
			k++;
		}

		// This loop is for copying leftovers in rightA
		while (j < rightA.length) {
			a[k] = rightA[j];
			j++;
			k++;
		}
	}
}
