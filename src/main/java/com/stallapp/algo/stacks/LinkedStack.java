package com.stallapp.algo.stacks;

import com.stallapp.algo.queue.Node;

public class LinkedStack {

    /**
     * @param args
     */
    
    Node top = null;    
    
    private void push(String str) {
        Node newNode = new Node(str);
        newNode.setNext(top);
        top = newNode;
    }
    
    private Object pop() {        
        if (top == null) {
        	return null;
        }
    	String obj = top.getItem().toString();
        top = top.getNext();
        return obj;
    }
    
    private boolean isEmpty(){
        return top==null;
    }
    
    
    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack();
        
        System.out.println("Is Empty..? " + stack.isEmpty());
        
        stack.push("str1");
        stack.push("str2");
        stack.push("str3");
        
        System.out.println("Is Empty..? " + stack.isEmpty());
        
        System.out.println("Popped from stack..." + stack.pop());
        
        
        
        
        
        

    }

}
