package com.stallapp.algo.stacks;

public class ArrayStack {

    /**
     * @param args
     */
    
    private int[] stack;
    private int top = 0;
    private int max = 0;
    
    public ArrayStack(int max) {
        this.stack = new int[max];
        this.top = -1;
        this.max = max;
        
    }
    
    private boolean isEmpty(){
        return top==0;
    }
    
    private boolean isFull() {
        return top == max -1;
    }    
    
    private void push(int x) {
        if (!isFull()) {
	    	top = top + 1;
	        stack[top] = x;
        }
        
    }
    
    private int pop(){
    	int x =-1;
    	if (!isEmpty()) {
	    	x = stack[top];
	        top = top-1;
        }
        return x;
                
    }    
    
    public static void main(String[] args) {
        ArrayStack s = new ArrayStack(5);
        
        System.out.println("Is Empty.. " + s.isEmpty());
        System.out.println("Is Full.. " + s.isFull());
        
        s.push(1);
        s.push(2);
        s.push(3);
        
        //System.out.println("Popped item is.. " + s.pop());
        
        //s.push(3);
        //s.push(4);
        s.push(5);
        s.push(6);
        System.out.println("Is Full.. " + s.isFull());
        s.push(7);

        
        //System.out.println("Popped item is.. " + s.pop());
        
        
    }

}
