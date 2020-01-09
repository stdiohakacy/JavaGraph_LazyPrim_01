package SpanningTree.LazyPrim._01;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Vertex> vertexList = new ArrayList<Vertex>();
		
		Vertex vertex0 = new Vertex("A");
		Vertex vertex1 = new Vertex("B");
		Vertex vertex2 = new Vertex("C");
		
		vertexList.add(vertex0);
		vertexList.add(vertex1);
		vertexList.add(vertex2);
		
		vertex0.addEdge(new Edge(1, vertex0, vertex1));
		vertex0.addEdge(new Edge(1, vertex0, vertex2));
		vertex0.addEdge(new Edge(10, vertex1, vertex2));
		
		vertex1.addEdge(new Edge(1, vertex1, vertex0));
		vertex2.addEdge(new Edge(1, vertex2, vertex0));
		vertex2.addEdge(new Edge(10, vertex2, vertex1));
		
		Algorithm algorithm = new Algorithm(vertexList);
		
		algorithm.primsAlgorithm(vertex2);
		algorithm.showMST();
		
		
	}
}
