package com.stallapp.algo.arrays;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); scanner.nextLine();
        scanner.close();
        for (int i =1; i <= n; i++) {
            int spaces = n-i;
           /* String hashes =  String.join("", Collections.nCopies(i, "#"));
            System.out.println(hashes); 

            String spaceStr = String.format("%"+spaces+"s", hashes);
            */
            // System.out.println(spaceStr);
            
            String space = "";
            for (int j= 0; j< spaces; j++) {
            	space = space + " ";
            }
            
            String hashes = "";
            
            for (int k = 0; k <i; k++) {
            	hashes = hashes+ "#";
            }
            
            System.out.println(space + hashes);
        }
    }
	}

