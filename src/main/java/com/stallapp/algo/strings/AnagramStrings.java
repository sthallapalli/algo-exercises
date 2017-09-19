package com.stallapp.algo.strings;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AnagramStrings {

	public static void main(String[] args) {
		checkAnagram("aRmy", "mArY");
	}

	private static void checkAnagram(String str1, String str2) {
		char[] arr1 = str1.toLowerCase().toCharArray();
		char[] arr2 = str2.toLowerCase().toCharArray();
		
		Map<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();
		Map<Character, Integer> map2 = new LinkedHashMap<Character, Integer>();
		
		for (char c : arr1) {
			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);
			}
		}
		
		for (char c : arr2) {
			if (map2.containsKey(c)) {
				map2.put(c, map2.get(c) + 1);
			} else {
				map2.put(c, 1);
			}
		}
		
		
		Set<Character> charSet = map1.keySet();
		boolean flag = true;

		for (Character c : charSet) {
			if (map2.containsKey(c)) {
				if (map1.get(c) != map2.get(c)) {
					flag = false;
					break;
				}
			} else {
				System.out.println("No equalant char found in str2, so not anagrams");
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Anagrams to each other :" + str1 +"   " +str2);
		}

	}
	
	 public static boolean checkAnagram_1(String first, String second){
	        char[] characters = first.toCharArray();
	        StringBuilder sbSecond = new StringBuilder(second);
	       
	        for(char ch : characters){
	            int index = sbSecond.indexOf("" + ch);
	            if(index != -1){
	                sbSecond.deleteCharAt(index);
	            }else{
	                return false;
	            }
	        }
	       
	        return sbSecond.length()==0 ? true : false;
	    }

}
