package com.stallapp.algo.sorting;

public class Test {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int array[] = {12,9,4,99,120,1,3,10};
        System.out.println("Values Before the Bubble sort:\n");
        for(int i = 0; i < array.length; i++)
        System.out.print( array[i]+"  ");
        System.out.println();
        sortNumber(array);
        System.out.print("Values after the Bubble sort:\n");
        for(int i = 0; i <array.length; i++)
        System.out.println(array[i]+"  ");
        
        
        
        
        int a[] = {100,20,30,10,35,25};
        System.out.println("Values Before the Insertion sort:\n");
        for(int i = 0; i < a.length; i++)
            System.out.print( a[i]+"  ");
        System.out.println();
        insertionSort(a);
        System.out.print("Values after the Insertion sort:\n");
        for(int i = 0; i <a.length; i++)
            System.out.println(a[i]+"  ");
        
        
        
        int a1[] = {100,20,30,10,35,25};
        System.out.println("Values Before the selection sort:\n");
        for(int i = 0; i < a1.length; i++)
            System.out.print( a1[i]+"  ");
        System.out.println();
        selectionSort(a1);
        System.out.print("Values after the selection sort:\n");
        for(int i = 0; i <a1.length; i++)
            System.out.println(a1[i]+"  ");
            
        
        
        
        
        
        if(binarySearchIterative(array, 10)!=0) {
            System.out.println("number found from iterative" + binarySearchIterative(array, 10));
        }
        
       int f =  binarySearchRecursive(array, 3, 0, array.length-1);
       
       if(f!=0) {
           System.out.println("number found from recursive " + f);
       }

        
        checlPalidrome(151);
        checlPalidrome(160);
        
        checkArmstrong(153);
        
        checkArmstrong(151);
        
        swap(2,1);
        
        StringRev1("Srinivas");
        StringRev2("Thallapalli");
        StringRev3("Progress");
        checkStrPalindrome("liril");
        
        for (int i=0; i<=10; i++)
            System.out.print(fibb(i)+", ");
        
        System.out.println("Factorial of 5 is "  + fact(5));
        
        
        
        System.out.println("Factorial of 5 is " + factorial(5));
                                                            
    }
    
    
    private static int[] selectionSort(int[] a) {
        for (int i = 0; i < a.length-1; i++) {
            //assume first item is min
            int iMin = i;
            
            //iterate through the remaingin items and get the min item index
            for(int j = i+1; j< a.length ; j++) {
                // get the minimum item index
                if(a[j] < a[iMin]) {
                    iMin = j;
                }
            }
            
            if(i != iMin) {
                int temp = a[iMin];
                a[iMin] = a[i];
                a[i] = temp;
            }
            
        }
        
        return a;
    }
    
    private static int[] insertionSort(int[] a){
        
        int size = a.length;
        
        for (int i = 1; i < size; i++) {
            int valueToInsert = a[i];            
            int holePos = i;
            
            //move down until the valueToInsert is larger than
            while(holePos>0 && valueToInsert < a[holePos-1]) {
                //if the before value is larger, move the before value to up 
                a[holePos] = a[holePos-1];
                holePos = holePos-1;
            }
            a[holePos] = valueToInsert;
        }
        
        return a;
    }
    
    
    
    
    //Bubble sort
    private static int[] sortNumber(int[] a) {
       
        for(int i=0; i<a.length; i++) {
       
            for(int j=1; j<(a.length-i); j++) {
       
                if(a[j-1]> a[j] ) {
       
                    int temp = a[j-1];
       
                    a[j-1] = a[j];
       
                    a[j] = temp;
       
                }
            }
        }
       
       
        return a;
    }
    
    
    private static void checlPalidrome(int n) {
        int number = n;
        int reverse = 0;
                
        while(n> 0) {
            int remainder = n%10;
            reverse = (reverse*10) + remainder;
            n = n/10;
        }
        
        if(reverse == number) {
            System.out.println( number + "is palindrome");
        } else {
            System.out.println( number + "is not a palindrome");
        }
        
    }
    
    private static void checkArmstrong(int n) {
        int org = n;
        int result = 0;
                
        while(n>0) {
            int remainder = n%10;
             result = result + (remainder * remainder * remainder);
             n = n/10;
        }
        
        if(org == result) {
            System.out.println(org + " is an armstrong");
        } else {
            System.out.println(org + " is not an armstrong");
        }
        
    }
    
    private static void swap(int a, int b) {
        
        System.out.println("Before Swap: \na is " + a);
        System.out.println("b is " + b);
        
        a = a*b;
        b = a/b;
        a = a/b;
        
        System.out.println("After swap: \na is " + a);
        System.out.println("b is " + b);
    }
    
    private static void StringRev1(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reverse of " + str + "is " + sb.reverse().toString());
      
    }
    
    private static void StringRev2(String str) {
        char[] strArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        
        for(int i= (strArr.length-1) ; i>= 0; i--) {
            sb.append(strArr[i]);
        }
        
        System.out.println("Reverse: StringREv2 is " + sb.toString());
    }
    
    
    private static String StringRev3(String str) {
      
        StringBuilder sb = new StringBuilder();
        
        for(int i= (str.length()-1) ; i>= 0; i--) {
            sb.append(str.charAt(i));
        }
        
        System.out.println("Reverse: StringREv3 is " + sb.toString());
        
        return sb.toString();
    }
    
    private static void checkStrPalindrome(String str) {
        if(str.equals(StringRev3(str))) {
            System.out.println(str + " is a palindrome string");
        }
    }
    
    private static int fibb(int n) {
        if(n<2) {
            return n;
        } else { 
            return fibb(n-1) + fibb(n-2);
         }  
    }
    
    private static int fact(int n) {
        if(n<2) {
            System.out.println("recursive call"+n);
            return 1;
            
        } else {
            System.out.println("recursive call " + n);
            return (n *fact(n-1));
        }
    }
    
    
    private static int factorial(int n) {
        
        int fact = 1;
        
        for (int i = 1; i <= n; i++) {
            
            System.out.println("iteration call" + i);
            fact = fact*i;
        }
        return fact;
    }
    
    private static int binarySearchIterative(int[] arr, int n) {
        int[] sortedArray = sortNumber(arr);
        
        int minIndex = 0;
        int maxIndex = arr.length -1;        
        
        while(maxIndex >= minIndex) {            
            int mid = (minIndex + maxIndex)/2;
            if(sortedArray[mid] > n) {
                maxIndex = mid-1;
            } else if(sortedArray[mid] <n) {
                minIndex = mid+1;
            } else if(sortedArray[mid]==n) {
                return sortedArray[mid];
               
            }
        }        
        return 0;
    }
    
    private static int binarySearchRecursive(int arr[], int n, int minIndex,int maxIndex) {
        int[] sortedArray = sortNumber(arr);         
        
        if(minIndex > maxIndex) {
            System.out.println(n + " does not exist!!");
            return 0;
        } else {
            int mid = (minIndex + maxIndex)/2;
            
            if(sortedArray[mid] > n) {
               return binarySearchRecursive(sortedArray, n, minIndex, mid -1);
            } else if(sortedArray[mid] <n) {
               return binarySearchRecursive(sortedArray, n, minIndex+1, maxIndex);
            } else {
                return sortedArray[mid];
            }
        }
       
    }
    

}
