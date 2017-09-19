package com.stallapp.algo.queue;

public class Node {
    
    private Object item;
    private Node next;
    
    public Node(Object item ) {
        this.item = item;
    }
    
    public Node(Object item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
       
}
