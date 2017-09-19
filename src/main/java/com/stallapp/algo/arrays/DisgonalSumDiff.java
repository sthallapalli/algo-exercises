package com.stallapp.algo.arrays;

import java.util.Scanner;

public class DisgonalSumDiff {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	        int size = Integer.valueOf(scanner.nextLine());
	        
	        int[][] a = new int[size][size];
	        
	        for(int i = 0; i<size; i++) {
	        	String numberStr = scanner.nextLine();
	        	String[] numArr = numberStr.split(" ");
	        	for(int j = 0; j < size;j++){
	        		a[i][j] = Integer.valueOf(numArr[j]);
	        	}
	        }
	        
	        int d1sum = 0;
	        for (int i = 0,  j = 0; i < size && j<size; i++, j++) {
	        	d1sum += a[i][j];
	        }
	        
	        int d2sum = 0;
	        for (int i = 0,  j = size-1; i < size && j>=0; i++, j--) {
	        	d2sum += a[i][j];
	        }
	        
	        System.out.println(Math.abs((d1sum - d2sum)));
	        
	}

}
