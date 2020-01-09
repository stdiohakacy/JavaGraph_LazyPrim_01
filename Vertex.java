package SpanningTree.LazyPrim._01;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private String name;
	private boolean isVisited;
	private Vertex previousVertex;
	private List<Edge> adjacencies;

	public Vertex(String name) {
		super();
		this.name = name;
		this.adjacencies = new ArrayList<Edge>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVisited() {
		return isVisited;
	}

	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}

	public Vertex getPreviousVertex() {
		return previousVertex;
	}

	public void setPreviousVertex(Vertex previousVertex) {
		this.previousVertex = previousVertex;
	}

	public List<Edge> getAdjacencies() {
		return adjacencies;
	}

	public void setAdjacencies(List<Edge> adjacencies) {
		this.adjacencies = adjacencies;
	}

	public void addEdge(Edge edge) {
		this.adjacencies.add(edge);
	}

	@Override
	public String toString() {
		return "Vertex [name=" + name + "]";
	}

}
