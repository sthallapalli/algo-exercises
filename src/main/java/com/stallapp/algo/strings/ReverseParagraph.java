package com.stallapp.algo.strings;

public class ReverseParagraph {

	public static void main(String[] args) {
		String str = "Hi";
		
		String[] arr = str.split("\\s");
		
		StringBuilder builder = new StringBuilder();
		for (int i = arr.length; i > 0 ; i--) {
			builder.append(arr[i-1]);
		}
		System.out.println(builder.toString());
		
		
		System.out.println(recursive(str));
		
	}
	
	
	private static String recursive(String str) {
		if (str.length() == 0) {
			return str;
		}
		return recursive(str.substring(1)) + str.charAt(0);
		
	}
}
