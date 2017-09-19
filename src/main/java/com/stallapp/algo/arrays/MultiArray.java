package com.stallapp.algo.arrays;

public class MultiArray {
    
    public static void main(String[] args) {
        
        int a[][] = new int[10][5];
        
        int k = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <5; j++) {
                a[i][j] = k;
                k++;
            }
        }
        
        print(a);
        
        //sum of the first row        
        printRowSum(a, 0);
        
        
        //row average for each row.
        printColumnAverage(a, 2);
        
        
        
        
    }
    
    
    private static void printColumnAverage(int[][] a, int j) {
        int size  = a.length;
        System.out.println("The size to be calculate is " +size);
        double average = 0;
        for (int i = 0; i < size; i++) {
            average = average + a[i][j];
        }
        
        if(size !=0) {
            average = average/size;
        }
        
        System.out.println("THe average value of the column " + j + " is " + average);
        
        
    }


    private static void printRowSum(int[][] a, int ix){
        System.out.println("THe length " + a[ix].length);
        int total = 0;
        for (int j=0; j<a[ix].length;j++) {
            total = total + a[ix][j];
            
        }
        System.out.println("Printing sum of row "  + ix + " is " + total);
    }
    
    
    private static void print(int[][] a) {
        for(int i=0; i<a.length; i++) { 
            for(int j=0; j<a[i].length; j++) 
            System.out.print(a[i][j] + " "); 
            System.out.println(); 
        } 
    }

    
    
}
