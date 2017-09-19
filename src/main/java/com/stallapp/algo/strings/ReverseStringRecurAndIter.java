package com.stallapp.algo.strings;

public class ReverseStringRecurAndIter {

	public static void main(String[] args) {
		System.out.println(reverseByIterate("Srinivas"));
		System.out.println(reverseRecursively("Srinivas"));
	}
	
	private static String reverseByIterate(String str) {
		char[] arr = str.toCharArray();
		char[] rev = new char[arr.length];
		for (int i = arr.length; i > 0; i--) {
			rev[arr.length - i] = arr[i-1];
		}
		return new String(rev);
	}
	
	public static String reverseRecursively(String str) {

        if (str.length() < 2) { // or length is 1
            return str;
        }
        return reverseRecursively(str.substring(1)) + str.charAt(0);
    }
}
