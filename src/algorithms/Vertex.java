package algorithms;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	String name = null;
	List<Vertex> adjacentList = new ArrayList<>();
	boolean visited;
	boolean beingVisited;
	
	Vertex(String name){
		this.name = name;
	}
	
	public void addVertex(Vertex addV) {
		getAdjacentList().add(addV);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Vertex> getAdjacentList() {
		return adjacentList;
	}

	public void setAdjacentList(List<Vertex> adjacentList) {
		this.adjacentList = adjacentList;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}
}
