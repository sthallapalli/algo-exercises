package com.stallapp.algo.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SparseArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> name=new ArrayList<String>();
        for(int i=0;i<n;i++)
            name.add(sc.next());
        int q=sc.nextInt();
        for(int i=0;i<q;i++)
            System.out.println(Collections.frequency(name,sc.next()));
        
        sc.close();
    }
}
