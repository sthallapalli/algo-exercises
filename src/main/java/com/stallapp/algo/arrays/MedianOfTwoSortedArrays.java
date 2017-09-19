package com.stallapp.algo.arrays;

import java.util.HashMap;
import java.util.Map;
 
public class MedianOfTwoSortedArrays
{
    public static void main(String[] args) 
    {
        int[] arr1 = {2,3,5};
        int[] arr2 = {5,8,12};
       
        
        int med = median(arr1, arr2);
        System.out.println("Median = "+ med);
        
        int[] a = {4,2,8, 5,1};
        findSum(a,9);
        findSum_V1(a, 9);
        reverseStr("Sriniavas");
        
     }
    
    // Complexity of this is O(n^2)
     private static void findSum(int[] a, int n) {

         for (int i=0; i<a.length; i++) {
             for (int j = 0; j < a.length; j++) {
               if((a[i] + a[j]) == n) {
                   System.out.println("(" + a[i]+ ", "+ a[j] +" )");
               }
               
           }
         }
        
    }
     
     private static void findSum_V1(int[] a,int n) {
         Map<Integer, Integer> map = new HashMap<Integer, Integer>();
         for (int i = 0; i < a.length; i++) {
            int complement = n - a[i];
            map.put(a[i], i);
            
            if (map.containsKey(complement)) {
                System.out.println("The indexes are ("  + map.get(complement) + "," + i +")");
            }
        }
     }
     
     
     private static void reverseStr(String str) {
         char[] chars = str.toCharArray();
         char[] charset =  new char[chars.length];
         for (int i =chars.length-1; i >=0 ; i--) {
           
             charset[(chars.length-1) - i]  = chars[i];             
             
        }
         
         System.out.println(new String(charset));
     }
     
     
     
    public static int median(int[] arr1, int[] arr2)
     {
         int N = arr1.length;
         return median(arr1, 0, N -1 , arr2, 0, N - 1);
         
        // return getMedian(arr1, arr2, N);
     }
     public static int median(int[] arr1, int l1, int h1, int[] arr2, int l2, int h2)
     {
         int mid1 = (h1 + l1 ) / 2;
         int mid2 = (h2 + l2 ) / 2;
 
         if (h1 - l1 == 1)
             return (Math.max(arr1[l1] , arr2[l2]) + Math.min(arr1[h1] , arr2[h2]))/2;
         else if (arr1[mid1] > arr2[mid2])
             return median(arr1, l1, mid1, arr2, mid2, h2);    
         else
             return median(arr1, mid1, h1, arr2, l2, mid2 );    
     }
     
     
     
     /* This function returns median of ar1[] and ar2[].
     Assumptions in this function:
     Both ar1[] and ar2[] are sorted arrays
     Both have n elements */
  private static int getMedian(int ar1[], int ar2[], int n)
  {
      int i = 0;  /* Current index of i/p array ar1[] */
      int j = 0; /* Current index of i/p array ar2[] */
      int count;
      int m1 = -1, m2 = -1;
   
      /* Since there are 2n elements, median will be average
       of elements at index n-1 and n in the array obtained after
       merging ar1 and ar2 */
      for (count = 0; count <= n; count++)
      {
          /*Below is to handle case where all elements of ar1[] are
            smaller than smallest(or first) element of ar2[]*/
          if (i == n)
          {
              m1 = m2;
              m2 = ar2[0];
              break;
          }
   
          /*Below is to handle case where all elements of ar2[] are
            smaller than smallest(or first) element of ar1[]*/
          else if (j == n)
          {
              m1 = m2;
              m2 = ar1[0];
              break;
          }
   
          if (ar1[i] < ar2[j])
          {
              m1 = m2;  /* Store the prev median */
              m2 = ar1[i];
              i++;
          }
          else
          {
              m1 = m2;  /* Store the prev median */
              m2 = ar2[j];
              j++;
          }
      }
   
      return (m1 + m2)/2;
  }
  
  
}
