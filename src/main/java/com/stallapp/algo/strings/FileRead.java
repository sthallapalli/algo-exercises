package com.stallapp.algo.strings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileRead {

	public static void main(String[] args) {
		FileInputStream iStream = null;
		Scanner sc = null;
		
		try {
			iStream = new FileInputStream(new File(""));
			sc = new Scanner(iStream, "UTF-8");
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				System.out.println(str);
			}
		} catch (Throwable th) {
			
		} finally {
			if (iStream != null) {
				try {
					iStream.close();
				} catch (Throwable th){}
			}
			if (sc != null) {
				try {
					sc.close();
				} catch (Throwable th){}
			}
		}
	}

	
	private void read() {
		InputStream in = null;
		BufferedReader reader = null;
		try {
			in = new FileInputStream(new File(""));
			reader = new BufferedReader(new InputStreamReader(in));
			while (reader.readLine() != null) {
				System.out.println(reader.readLine());
			}
			
		} catch (Throwable th) {
			
		} finally {
			//Close streams/readers
			
		}
		
		
	}
}
