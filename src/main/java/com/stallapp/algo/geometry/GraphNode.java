package com.stallapp.algo.geometry;

public class GraphNode {
    private char id;
    private boolean visited;
    
    public GraphNode(char id) {
        this.id = id;
    }
    
    public char get() {
        return id;
    }
    
    public void setVisited(boolean visited) {
        this.visited = visited;
    }
    
    public boolean isVisited() {
        return this.visited;
    }
}
