package com.stallapp.algo.arrays;

import java.util.Objects;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Objects.requireNonNull(scanner, "Console can not be null");
		System.out.print("Enter array size: ");
		String sizeStr = scanner.nextLine();
	
		int size = Integer.valueOf(sizeStr);
		
		System.out.print("Enter array element separated by space : ");
		String elements = scanner.nextLine();
		
		
		int[] array = new int[size];
		String[] elementString = elements.split(" ");
		for (int i = 0; i < elementString.length; i++) {
			array[i] = Integer.valueOf(elementString[i]);
		}
		
		for (int i = array.length -1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
