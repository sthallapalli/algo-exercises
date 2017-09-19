package com.stallapp.algo.strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String str = "Morning";
		
		Map<Character, Integer> charMap = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			} else {
				charMap.put(c,1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First Unique Char : " + entry.getKey());
				break;
			}
		}
	}

}
