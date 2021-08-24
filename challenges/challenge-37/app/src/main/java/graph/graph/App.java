package graph.graph;

import graph.graph.Edge;
import graph.graph.Graph;
import graph.graph.Vertex;

public class App {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex vertex = new Vertex(1);
        Edge edge = new Edge(vertex , 3);
        graph.addNode(vertex);

        System.out.println(graph);
    }
}
