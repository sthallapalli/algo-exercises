package com.stallapp.algo.queue;

public class LinkedQueue {

    /**
     * @param args
     */
    
    private Node front = null;
    private Node rear = null;
    
    private int size = 0;
    private int max = 0;
    
    
    public LinkedQueue(int max) {
        this.max = max;
    }
    
    public void enqueue(String str) {
        if(!isFull()) {
            Node newNode = new Node(str);
            if(rear != null) {
                rear.setNext(newNode);
                rear = newNode;
            } else {
                rear = newNode;
                front = newNode;
            }
            size = size + 1;
        }
    }
    
    public String dequeue() {
        String res = null;
        
        if(!isEmpty()) {
            res = (String)front.getItem();
            front = front.getNext();
            size = size - 1;
        }
        
        return res;
    }
    
    
    public boolean isFull() {
        return size == max;
    }
    
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    
    
    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue(5);
        
        System.out.println("Is Empty??? " + queue.isEmpty());
        
        queue.enqueue("str1");
        queue.enqueue("str2");
        queue.enqueue("str3");
        queue.enqueue("str4");
        queue.enqueue("str5");
        
        System.out.println("Is Empty??? " + queue.isEmpty());
        System.out.println("Is Full??? " + queue.isFull());
        
        System.out.println("Dequeue operation : " + queue.dequeue());
        System.out.println("Dequeue operation : " + queue.dequeue());
        
        
    }

}
