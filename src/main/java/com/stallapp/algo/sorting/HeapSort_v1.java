package com.stallapp.algo.sorting;

import java.util.Arrays;

public class HeapSort_v1 {

    /**
     * @param args
     */
    
    
    private int a[] = new int[]{10, 8, 14, 15, 12, 5, 6, 1};
    
    
    private void addRoot(int index, int length) {
        int j = 2*index;
        
        if(j <= length) {
            
            if(j < length && a[j] < a[j + 1] ) {
                j = j + 1;
                if(a[index] < a[j]) {
                    int temp = a[index];
                    a[index] = a[j];
                    a[j] = temp;
                    addRoot(j, length);
                }
            }
        }
        
        //System.out.println(Arrays.toString(a));
    }
    
    private void buildHeap() {
        int length = a.length;
        
        for (int k =length/2 ; k >=0; k--) {
            addRoot(k, length);
        }
        System.out.println(Arrays.toString(this.a));
        
      
        
    }
    
    private void heapSort(){
        buildHeap();
        for (int k = a.length-1; k >= 0; k--) {
            int temp = a[k];
            a[k] = a[0];
            a[0] =  temp;
            addRoot(0, k-1);
        }
        System.out.println("After sort:  " + Arrays.toString(this.a));
        
        
    }
    
    
    
    
    public static void main(String[] args) {
        new HeapSort_v1().heapSort();
    }

}
