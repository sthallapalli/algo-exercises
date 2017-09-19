package com.stallapp.algo.arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TwoAltChars {

	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	        int len = in.nextInt();
	        String s = in.next();
	        in.close();
	        char[] inputChars = s.toCharArray();
	        Set<Character> candidateChars = new HashSet<>();
	        char prevChar = s.charAt(0);
	        candidateChars.add(prevChar);
	        for(int i = 1; i < s.length(); i++){
	            char c = s.charAt(i);
	            if(c == prevChar){
	                candidateChars.remove(c);
	            } else {
	                candidateChars.add(c);
	            }
	            prevChar = c;
	        }
	        candidateChars.forEach(System.out::print);
	        Character[] chars = candidateChars.toArray(new Character[0]);
	        
	        
	        
	      /*  System.out.print("Unique chars : ");
	        charSet.forEach(System.out::print);
	        Set<Character> charToDelete = new HashSet<>();
	        
	        
	        
	        charSet.forEach((ch) -> {
	        	for (int i = 1; i < len ; i++) {
	        		if (ch == chars[i-1] && chars[i-1] == chars[i]) {
	        			charToDelete.add(ch);
	        		}
	        	}
	        	
	        	if (len > 2) {
	        		
	        	}
	        });
	        
	        
	        for (char ch : charToDelete) {
	        	System.out.println("\nDeleting char " + ch);
	        	//String r = s.replaceAll(""+ch, "");
	        }
	        
	        */
	        
	}

}
