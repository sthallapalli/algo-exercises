package com.stallapp.algo.strings;

import java.util.ArrayList;
import java.util.List;

public class VowelVsConsonantsCount {

	public static void main(String[] args) {
		List<Character> vowels = new ArrayList<>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');

		char[] nameArr = "Srinivas".toCharArray();
		
		for (Character ch : nameArr) {
			if (vowels.contains(Character.toLowerCase(ch))){
				System.out.println("Vowel Found  " +  ch);
			} else {
				System.out.println("Consonant found " + ch);
			}
		}
		
	}
	
}
