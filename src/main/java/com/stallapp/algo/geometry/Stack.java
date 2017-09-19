package com.stallapp.algo.geometry;

public class Stack {
    private int max;
    private int top; // behaves like index
    private char[] stack;
    
    public Stack(int max) {
        this.max = max;
        stack = new char[max];
        top =-1;
    }
    
    public void push(char c) {
        stack[++top] = c;
    }
    
    
    public char pop() {        
        return stack[top--];
    }
    
    public char peek() {
        return stack[top];
    }
    
    public boolean isEmpty() {
       return (top == -1);
    }
    
    
    public boolean isFull() {
        return top == (max-1);
    }
}
