package com.stallapp.algo.strings;

import java.util.Scanner;


public class ReducedString {

	   static String super_reduced_string(String s){
	       
		   if (s.isEmpty()) {
			   return "Empty String";
		   }
	   
		   char[] charArray = s.toCharArray();
		   
	        for (int i = 1; i< charArray.length; i++) {
	            if (charArray[i-1] == charArray[i]) {
	                charArray[i-1] = ' ';
	                charArray[i] = ' ';
	            }
	        }
	        
	        String ans = new String(charArray).trim();
	        String test = ans.replaceAll("\\s","");
	        /*Set<Character> charSet = new HashSet<>();
	        for(char ch : test.toCharArray()) {
	        	charSet.add(ch);
	        }*/
	        
	        if (test.isEmpty()) {
	        	return "Empty String";
	        }
	        
	        char[] testChars = test.toCharArray();
	        
	        boolean flag = true;
	        for (int i = 1; i< testChars.length; i++) {
	            if (testChars[i-1] == testChars[i]) {
	            	flag = false;
	            }
	        }
	        
	        return (flag) ?  test : super_reduced_string(test);
	    }
	   
	   /*
	    *           Scanner stdin = new Scanner(System.in);
        String s = stdin.nextLine();
        String acc = "";
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(acc.length() > 0 && acc.charAt(acc.length() - 1) == c) {
                acc = acc.substring(0, acc.length() - 1);
            } else {
                acc += c;
            }
        }
        System.out.println(acc.isEmpty() ? "Empty String" : acc);
        stdin.close();
	    */
	   

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String s = in.next();
	        String result = super_reduced_string(s);
	        System.out.println(result);
	    }
}
