package graph;

import graph.graph.Graph;
import graph.graph.Vertex;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testGraph(){
        Graph classUnderTest = new Graph();
        assertEquals(true , classUnderTest instanceof Graph);
    }

    @Test
    public void testAddNode(){
        Graph classUnderTest = new Graph();
        Vertex vertex0 = new Vertex(1);
        assertEquals(1 , classUnderTest.addNode(vertex0).getValue());
        assertEquals("{Vertex { value = 1 } = []}" , classUnderTest.getVertices().toString());

    }

    @Test
    public void testAddEdge(){
        Graph classUnderTest = new Graph();
        Vertex vertex = new Vertex(1);
        Vertex vertex1= new Vertex(2);
        System.out.println(classUnderTest.addNode(vertex).getValue());
        System.out.println(classUnderTest.addNode(vertex1).getValue());
        classUnderTest.addEdge(vertex , vertex1 , 3);

        assertEquals("[Edge { vertex = Vertex { value = 2 } , wight =3 } ]" , classUnderTest.getVertices().get(vertex).toString());

    }

@Test
public void testGetVertices(){}


    @Test
    public void testOneGetNeighbors(){
        Graph classUnderTest = new Graph();
        Vertex vertex01 = new Vertex(1);
        Vertex vertex02 = new Vertex(2);
        System.out.println(classUnderTest.addNode(vertex01).getValue());
        System.out.println(classUnderTest.addNode(vertex02).getValue());
        classUnderTest.addEdge(vertex01 , vertex02 , 3);

        assertEquals("[Edge { vertex = Vertex { value = 2 } , wight =3 } ]" , classUnderTest.getNeighbores(vertex01).toString());

    }

    @Test
    public void testGetNeighborso(){
        Graph classUnderTest = new Graph();
        Vertex vertex01 = new Vertex(1);
        Vertex vertex02 = new Vertex(2);
        Vertex vertex03 = new Vertex(3);

        System.out.println(classUnderTest.addNode(vertex01).getValue());
        System.out.println(classUnderTest.addNode(vertex02).getValue());
        classUnderTest.addNode(vertex03).getValue();
        classUnderTest.addEdge(vertex01 , vertex01 , 3);
        classUnderTest.addEdge(vertex01 , vertex03 , 1);

        assertEquals("[Edge{vertex=Vertex{value=2}, wight=3}, Edge{vertex=Vertex{value=3}, wight=1}]", classUnderTest.getNeighbores(vertex01).toString());
    }

    @Test
    public void testSize(){
        Graph classUnderTest = new Graph();
        Vertex vertex01 = new Vertex(1);
        Vertex vertex02 = new Vertex(2);
        Vertex vertex03 = new Vertex(3);
        System.out.println(classUnderTest.addNode(vertex01).getValue());
        System.out.println(classUnderTest.addNode(vertex02).getValue());
        classUnderTest.addNode(vertex03).getValue();
        assertEquals(3 , classUnderTest.size());
    }


}

















