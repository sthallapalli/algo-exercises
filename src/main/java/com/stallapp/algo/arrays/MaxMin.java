package com.stallapp.algo.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		/*Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] sa = str.split("\\s");
		
		int[] a = new int[sa.length];
		for (int i = 0; i< sa.length ;i++) {
			a[i] = Integer.valueOf(sa[i]);
		}
		
		int sum = 0;
		for (int i = 0; i< a.length; i++) {
			sum = sum + a[i];
		}
		
		Arrays.sort(a);
		System.out.println((sum - a[a.length -1] ) + " " + (sum - (a[0])));*/
		
		 Scanner stdin = new Scanner(System.in);
	        Object[] numbers = Arrays.stream(stdin.nextLine().split(" "))
	                .map(Long::parseLong).toArray();
	        Arrays.sort(numbers);
	        
	       // LongStream.range(0, numbers.length).forEach((number) -> System.out.println(numbers[(int) number]));
	        
	        long minSum = 0;
	        long maxSum = 0;
	        for(int i = 0; i < numbers.length - 1; i++) {
	            minSum += (long) numbers[i];
	            maxSum += (long) numbers[i + 1];
	        }
	 
	        System.out.println(minSum + " " + maxSum);
	        stdin.close();
	        
	        
	        
	        
	        /* Editor solution
	         * 
	         * Scanner scan = new Scanner(System.in);
        long sum = 0;
        long min = 1000000000;
        long max = 0;
        while(scan.hasNext()) {
            long n = scan.nextLong();
            sum = sum + n;
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }
        scan.close();
        
        System.out.println((sum - max) + " " + (sum - min));
	         */
	}

}
