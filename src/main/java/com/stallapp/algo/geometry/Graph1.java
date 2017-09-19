package com.stallapp.algo.geometry;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


/*
 * http://www.codeproject.com/Articles/32212/Introduction-to-Graph-with-Breadth-First-Search-BF
 * THis is using Adjacency List approach 
 */
/**
 * @author admin
 *
 */
public class Graph1 {
    
    private GraphNode1 rootNode;
    private List<GraphNode1> nodes = new ArrayList<GraphNode1>();
            
    public void setRootNode(GraphNode1 rootNode) {
        this.rootNode = rootNode;
    }
    
    public GraphNode1 getRootNode() {
        return this.rootNode;
    }
    
    public void addNode(GraphNode1 node) {
        nodes.add(node);
    }
        
    public void connectNode(GraphNode1 startNode, GraphNode1 endNode) {
        startNode.addLink(endNode);
        endNode.addLink(startNode);
    }
    
    public GraphNode1 getUnvisitedLink(GraphNode1 node) {
       for (GraphNode1 link : node.getLinks()) {
           if(link!=null && !link.isVisited()) {
               return link;
           }
       }
       return null;
    }
    
    
    public void bfs() {
        Queue<GraphNode1> queue = new LinkedList<GraphNode1>();
        queue.add(rootNode);
        rootNode.setVisited(true);
        System.out.println(rootNode.get());
        
        while(!queue.isEmpty()) {
            GraphNode1 node = queue.remove();
            GraphNode1 link =null;
            while((link= getUnvisitedLink(node))!=null) {
                queue.add(link);
                link.setVisited(true);
                System.out.println(link.get());
            }
        }
        
        clearNodes();
    }
    
    private void clearNodes() {
       for (GraphNode1 graphnode : nodes) {
           graphnode.setVisited(false);
       }
        
    }

    public void dfs() {
        Stack<GraphNode1> stack = new Stack<GraphNode1>();
        stack.push(rootNode);
        System.out.println(rootNode.get());
        rootNode.setVisited(true);
        
        while(!stack.isEmpty()) {
            GraphNode1 node = stack.peek();
            GraphNode1 link = getUnvisitedLink(node);
            
            if(link!=null) {
                System.out.println(link.get());
                link.setVisited(true);
                stack.push(link);
            } else {
                stack.pop();
            }
        }
        clearNodes();
    }
    
    public static void main(String[] args) {
        GraphNode1 a = new GraphNode1('A');
        GraphNode1 b = new GraphNode1('B');
        GraphNode1 c = new GraphNode1('C');
        GraphNode1 d = new GraphNode1('D');
        
        Graph1 graph = new Graph1();
        graph.setRootNode(a);
        graph.addNode(a);
        graph.addNode(b);
        graph.addNode(c);
        graph.addNode(d);
        
      /*  graph.connectNode(a,b);
        graph.connectNode(a,c);
        
        graph.connectNode(b,d);
        graph.connectNode(b,a);
        
        graph.connectNode(c,d);
        graph.connectNode(c,a);
        
        graph.connectNode(d,b);
        graph.connectNode(d,c);
        can be replaced with endNode.addLink(startNode); in connectNode() for bidirectional link
        */
        
        
        graph.connectNode(a,b);
        graph.connectNode(a,c);
        graph.connectNode(b,d);
        graph.connectNode(c,d);
        
        System.out.println("DFS : \n");
        graph.dfs();
        
        System.out.println("BFS : \n");        
        graph.bfs();
    }
    
    
}
