package SpanningTree.LazyPrim._01;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Algorithm {
	private List<Vertex> unVisitedVertexes;
	private List<Edge> spanningTree;
	private PriorityQueue<Edge> edgeHeap;
	private double fullCost;
	
	

	public Algorithm(List<Vertex> unVisitedVertexes) {
		super();
		this.unVisitedVertexes = unVisitedVertexes;
		this.spanningTree = new ArrayList<Edge>();
		this.edgeHeap = new PriorityQueue<Edge>();
	}

	public void primsAlgorithm(Vertex vertex) {
		this.unVisitedVertexes.remove(vertex);
		while (!unVisitedVertexes.isEmpty()) {
			for (Edge edge : vertex.getAdjacencies()) {
				if (this.unVisitedVertexes.contains(edge.getTargetVertex())) {
					this.edgeHeap.add(edge);
				}
			}

			Edge minEdge = this.edgeHeap.remove();

			this.spanningTree.add(minEdge);
			this.fullCost += minEdge.getWeight();

			vertex = minEdge.getTargetVertex();
			this.unVisitedVertexes.remove(vertex);
		}

	}

	public void showMST() {
		System.out.println("The minimum spanning tree cost : " + this.fullCost);
		for (Edge edge : spanningTree) {
			System.out.println(edge.getStartVertex() + " - " + edge.getTargetVertex());
		}
	}

}
