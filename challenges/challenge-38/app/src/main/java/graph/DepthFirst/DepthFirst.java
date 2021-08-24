package graph.DepthFirst;

import graph.graph.Edge;
import graph.graph.Graph;
import graph.graph.Vertex;
import graph.stacksandqueues.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DepthFirst extends Graph {
    public static void main(String[] args) {

    }

    public ArrayList<Vertex> depthFirst (Vertex vertex){
        ArrayList nodes = new ArrayList<>();
        Stack depth = new Stack();
        Set visited = new HashSet();
        depth.push(vertex);
        visited.add(vertex);
        while (!depth.isEmpty()){
            Vertex front = (Vertex) ((Node) depth.pop()).getValue();
            nodes.add(front.getValue());
            for (Object child : this.getNeighbores(front)){
                Vertex currentVertex = ((Edge) child).getVertex();
                if (!visited.contains(currentVertex)){
                    visited.add(currentVertex);
                    depth.push(currentVertex);
                }
            }
        }
        return nodes;
    }
}
