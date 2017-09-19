package com.stallapp.algo.queue;


public class LinkedList {
    private Node head;    
    
    public void initialize(){
        head = null;
    }
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void addOneNodeAfter(Node p, Node newNode){
        newNode.setNext(p.getNext());
        p.setNext(newNode);
    }
    
    public void addOneBeforeNode(Node previous, Node p, Node newNode) {
        previous.setNext(newNode);
        newNode.setNext(p);
    }
    
    public void addOneBeforeHead(Node newNode) {
        newNode.setNext(head);
        head = newNode;
    }
    
    public void deleteOneAfterNode(Node p) {
        p.setNext(p.getNext().getNext());
    }
    
    public void addNodeAtEnd(Node newNode) {
        Node node = head;
        
        while(node.getNext()!= null) {
            node = node.getNext();            
        }        
        node.setNext(newNode);
    }
    
    public void print() {
        Node p = head;
        System.out.println("The list items are: \n");
        while(p!=null) {
           System.out.println("Item:  " + p.getItem());
           p = p.getNext();
        }
    }
    
    public void findMiddle(Node n) {
    	Node current = n;
    	Node middle = n;
    	
    	int length = 0;
    	
    	while (current.getNext() != null) {
    		length ++ ;
    		if (length % 2 == 0) {
    			middle = middle.getNext();
    		}
    		current = current.getNext();
    	}
    	
    	System.out.println("Middle : " + middle.getItem());
    }
    
    
    public void printFromEnd(Node head) {
    	Node current = head;
    	Node prev = null;
    	
    	while (current != null) {
    		Node next = current.getNext();
    		current.setNext(prev);
    		prev = current;
    		current = next;
    	}
    	
    }
    
    
    private void printFromEndRecursive(Node head) {
    	if (head == null) {
    		return;
    	}
    	
    	printFromEndRecursive(head.getNext());
    	System.out.println(head.getItem());
    }
       
    /**
     * @param args
     */
    public static void main(String[] args) {
       LinkedList list = new LinkedList();
       list.initialize();       
       System.out.println("Is list Empty?  " + list.isEmpty());
       
       Node n = new Node("1");
       list.head = n;
       
       System.out.println("Is list Empty?  " + list.isEmpty());
                     
       list.print();
       
       
       Node n1 = new Node("2");
       list.addOneNodeAfter(n, n1);
       list.print();
       
       Node n2 = new Node("3");      
       list.addOneNodeAfter(n1, n2);
       list.print();
       
       Node n3 = new Node("4");       
       list.addOneBeforeNode(n1, n2, n3);
       list.print();
       
       Node n4 = new Node("5");
       list.addOneBeforeHead(n4);
       list.print();
       
       Node n5 = new Node("6");
       list.addNodeAtEnd(n5);
       list.print();
       
       
       list.printFromEndRecursive(n1);
       
    }

}
