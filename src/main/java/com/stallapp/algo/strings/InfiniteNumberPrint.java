package com.stallapp.algo.strings;

import java.util.Scanner;

public class InfiniteNumberPrint {
	public static void main(String[] args) {
		Thread thread = new Thread (new Runnable() {
			
			@Override
			public void run() {
				int i = 0;
				while (true) {
					System.out.println(i);
					++i;
				}
			}
		});
		
		thread.start();
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if (str.equals("i")) {
			thread.stop();
		}
		
		System.exit(1);
	}
}
