package com.stallapp.algo.strings;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		int intValue = Integer.valueOf(value);
		
		System.out.println(getSum(intValue));
		
	}

	private static int getSum(int value) {
		int sum = value % 10;
		
		if (value == 0) {
			return 0;
		} else {
			sum = sum + getSum(value/10);
		}
		
		return sum;
		
	}
	
}
