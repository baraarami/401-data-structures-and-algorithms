package graph.graph;

import linkedList.Node;
import stacksandqueues.Node;
import stacksandqueues.Queue;
import java.util.*;

public class BreadthFirst extends Graph {
    public ArrayList breadthFirst(Vertex vertex){
        ArrayList nodes = new ArrayList<>();
        Queue breadth = new Queue();
        Set visited = new HashSet();
        breadth.enqueue(vertex);
        visited.add(vertex);
        while (!breadth.isEmpty()){
            Vertex front = (Vertex) ((Node) breadth.dequeue()).getValue();
            nodes.add(front.getValue());
            for (Object child : this.getNeighbores(front)){
                Vertex currentVertex = ((Edge) child).getVertex();
                if (!visited.contains(currentVertex)){
                    visited.add(currentVertex);
                    breadth.enqueue(currentVertex);
                }
            }
        }
return nodes;
    }
}
