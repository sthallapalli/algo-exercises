package com.stallapp.algo.geometry;

public class StackRevStr {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String s = "srinivas";        
        System.out.println("String: " + s);
        int length = s.length();
        
        Stack stack = new Stack(length);
        for (int i = 0; i <length; i++) {
            char c = s.charAt(i);
            stack.push(c);
            
        }
        
        System.out.println("Is Stack Full .. " +stack.isFull());
        
        System.out.println("Reverse String : " + reverse(stack));
     } 
    
     /**
     * @param stack
     * @return
     */
    private static String reverse(Stack stack) {
         String rev = "";
         
         while(!stack.isEmpty()) {
             rev = rev + stack.pop();
         }         
         return rev;
     }

}
