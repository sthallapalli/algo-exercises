package com.stallapp.algo.geometry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


//http://www.codeproject.com/Articles/32212/Introduction-to-Graph-with-Breadth-First-Search-BF
// This is using Adjacency Matrix appproach

public class Graph {
    private GraphNode rootNode = null; 
    private List<GraphNode> nodes = new ArrayList<GraphNode>();
    private int adjMatrix[][] = null;
    private int size;
    
    
    public void setRootNode(GraphNode rootNode) {
        this.rootNode = rootNode;
    }
    
    public GraphNode getRootNode() {
        return this.rootNode;
    }
    
    public void addNode(GraphNode node) {
        nodes.add(node);
    }
    
    public void connnectNode(GraphNode start, GraphNode end) {
        if(adjMatrix == null ) {
            size = nodes.size();
            adjMatrix = new int[size][size];
        }
        
        int startIndex = nodes.indexOf(start);
        int endIndex = nodes.indexOf(end);
        
        adjMatrix[startIndex][endIndex] = 1;
        adjMatrix[endIndex][startIndex] = 1;
    }
    
    public GraphNode getUnvisitedChildNode(GraphNode node){
        int ix = nodes.indexOf(node);
        
        for (int j = 0; j < size; j++) {
            if((adjMatrix[ix][j] == 1) && !(nodes.get(j).isVisited())) {
                return nodes.get(j);
            }
        }
        
        return null;
        
    }
    
    
    public void dfs() {
        Stack<GraphNode> stack = new Stack<GraphNode>();
        stack.push(rootNode);
        System.out.println(rootNode.get());
        
        rootNode.setVisited(true);
        
        while(!stack.isEmpty()) {
            GraphNode node = (GraphNode)stack.peek();
            GraphNode child = getUnvisitedChildNode(node);
            
            if(child!=null) {
                child.setVisited(true);
                System.out.println(child.get());
                stack.push(child);
            } else {
                stack.pop();
            }
        }
        clearNodes();
        
    }
    
    public void bfs(){
        Queue<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(rootNode);
        rootNode.setVisited(true);
        System.out.println(rootNode.get());
        
        while(!queue.isEmpty()) {
            GraphNode node = queue.remove();            
            GraphNode child =null;
            while((child= getUnvisitedChildNode(node))!=null) {
                child.setVisited(true);
                System.out.println(child.get());
                queue.add(child);
                
            } 
        }
        clearNodes();
        
    }
    
    
    private void clearNodes() {
        for (GraphNode node : nodes) {
            node.setVisited(false);
        }
    }
    
    
    
    public static void main(String[] args) {
        GraphNode a = new GraphNode('A');
        GraphNode b = new GraphNode('B');
        GraphNode c = new GraphNode('C');
        GraphNode d = new GraphNode('D');       
        
        Graph graph = new Graph();
        graph.setRootNode(a);
        
        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        
        graph.connnectNode(a,b);
        graph.connnectNode(a,c);
        graph.connnectNode(b,d);
        graph.connnectNode(c,d);
        
        
        System.out.println("DFS\n");
        graph.dfs();
        System.out.println("\n");
        System.out.println("BFS\n");
        graph.bfs();

    }
    
    
    
}
