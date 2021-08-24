package graph;

public class App {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex vertex = new Vertex(1);
        Edge edge = new Edge(vertex , 3);
        graph.addNode(vertex);

        System.out.println(graph);
    }
}
