package graph.graph;

public class Edge {
    private Vertex vertex;
    private Object wight;
    public Edge(Vertex vertex , Object wight){
        this.vertex=vertex;
        this.wight=wight;
    }
    public  Edge (Vertex vertex){
        this.vertex=vertex;
    }

    @Override
    public String toString(){
        return "Edge { " + " vertex= " + vertex + " , wight =" + wight + " }";
    }

    public Vertex getVertex(){
        return vertex;
    }

    public void setVertex(Vertex vertex){
        this.vertex = vertex;
    }

    public Object getWight(){
        return wight;
    }

    public void setWight(Object wight){
        this.wight = wight;
    }
}
