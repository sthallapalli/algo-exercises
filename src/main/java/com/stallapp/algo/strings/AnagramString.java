package com.stallapp.algo.strings;

import java.util.HashSet;
import java.util.Set;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println(isAnagramV1("srinivas", "isrvsain"));
	}
	
	private static boolean isAnagram(String str1, String str2) {
		char[] alphabet = new char[26];
		
		if (str1.equalsIgnoreCase(str2))
			return true;
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		char[] str1A = str1.toLowerCase().toCharArray();
		char[] str2B = str2.toLowerCase().toCharArray();
		
		for (int i = 0; i < str1A.length; i++) {
			alphabet[str1A[i] - 97] += 1;
			alphabet[str2B[i] - 97] -= 1; 
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			if (alphabet[i] != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	private static boolean isAnagramV1(String str1, String str2) {
		
		if (str1.equalsIgnoreCase(str2))
			return true;
		
		if (str1.length() != str2.length()) {
			return false;
		}
		
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();

		char[] chars1 = str1.toCharArray();
		char[] chars2 = str2.toCharArray();
		
		for(int i = 0; i < chars1.length; i++) {
			set1.add(chars1[i]);
		}
		
		
		for(int i = 0; i < chars2.length; i++) {
			set2.add(chars2[i]);
		}
		

		for (char ch : set1) {
			set2.remove(ch);
		}
		
		if (set2.size() != 0) {
			return false;
		}
		return true;
	}

}
