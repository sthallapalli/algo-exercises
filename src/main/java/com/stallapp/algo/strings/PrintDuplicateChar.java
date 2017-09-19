package com.stallapp.algo.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicateChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		printDuplicateChars(str);
	}

	private static void printDuplicateChars(String str) {
		if (str == null || str.isEmpty()) {
			throw new RuntimeException("Null or empty");
		}
		
		char[] charArr = str.toCharArray();
		Set charSet = new HashSet();
		for (char c : charArr){
			if (!charSet.add(c)) {
				System.out.println("Duplicate char found :  " + c);
			}
		}
	}
	
}
