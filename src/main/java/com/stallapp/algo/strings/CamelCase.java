package com.stallapp.algo.strings;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        char[] chars = s.toCharArray();
        
        int count = 1;
        for (char ch : chars) {
        	if (Character.isUpperCase(ch)) {
        		count++;
        	}
        }
        
        System.out.println(count);
	}

}
