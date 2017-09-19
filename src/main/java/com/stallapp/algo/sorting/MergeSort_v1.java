package com.stallapp.algo.sorting;

import java.util.Arrays;

public class MergeSort_v1 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] a = {4, 9,1, 13, 5, 55, 23};
        MergeSort_v1 sorter = new MergeSort_v1();
        sorter.sort(a);
        
        System.out.println(Arrays.toString(numbers));
        
    }
    
    
    private static int[] numbers;
    private static int[] helper;
    
    
    private void sort(int[] arr) {
        MergeSort_v1.numbers = arr;
        MergeSort_v1.helper = new int[arr.length];
        
        mergeSort(0, arr.length-1);
        
    }


    private void combine(int low, int mid, int high) {
        
     // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
          helper[i] = numbers[i];
        }

        int i = low;
        int j = mid + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= mid && j <= high) {
          if (helper[i] <= helper[j]) {
            numbers[k] = helper[i];
            i++;
          } else {
            numbers[k] = helper[j];
            j++;
          }
          k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= mid) {
          numbers[k] = helper[i];
          k++;
          i++;
        }        
    }


    private void mergeSort(int low, int high) {
        if(low >= high) {
            return;
        }
        
        int mid = (low + high)/2;
        
        mergeSort(low, mid);
        mergeSort(mid + 1, high );
        
        combine(low, mid, high);
        
        
        
    }

}
