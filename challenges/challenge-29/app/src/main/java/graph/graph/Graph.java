package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

public class Graph {

    private HashMap<Vertex  , ArrayList> vertices = new HashMap<Vertex , ArrayList>();
    private int size ;
    public Graph(){}

    public Vertex addNode(Vertex vertex){
        vertices.put(vertex , new ArrayList());
        this.size++;
        return vertex;
    }

    public void addEdge(Vertex start , Vertex end , int wight){
        ArrayList edges = this.vertices.get(start);
        this.vertices.put(start , edges);

        if (this.vertices.containsKey(start) && this.vertices.containsKey(end)) {
            edges.add(new Edge(end, wight));
        }else {
            edges.add(new Edge(start));
        }
    }

    public HashMap<Vertex , ArrayList> getVertices(){
        return vertices;
    }

    public List getNodes(){
        List<Vertex> nodes = new ArrayList<>();
        nodes.forEach((vertex -> nodes.add(vertex)));
        return nodes;
    }




    public List getNeighbores(Vertex vertex){
        if (vertices.containsKey(vertex)){
            return vertices.get(vertex);
        }
        return new ArrayList();
    }


    public void setVertices(HashMap<Vertex , ArrayList> vertices){
        this.vertices=vertices;
    }

    public int size(){
        return this.size;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int size){
        this.size=size;
    }

    @Override
    public String toString() {
        return "Graph{" +
                "vertices=" + vertices +
                ", size=" + size +
                '}';
    }
}
