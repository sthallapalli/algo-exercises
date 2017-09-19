package com.stallapp.algo.geometry;

import java.util.ArrayList;
import java.util.List;

public class GraphNode1 {
    private char id;
    private boolean visited;
    private List<GraphNode1> links= null;
    
    public GraphNode1(char id) {
        this.id = id;
        this.links = new ArrayList<GraphNode1>();
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
    
    public void addLink(GraphNode1 node) {
        links.add(node);        
    }
    
    public List<GraphNode1> getLinks() {
        return this.links;
    }
     
    
}
