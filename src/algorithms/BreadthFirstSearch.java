package algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {

	public static void main(String[] args) {
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		Vertex g = new Vertex("G");
		Vertex h = new Vertex("H");
		
		a.addVertex(b);
		a.addVertex(g);
		a.addVertex(f);
		
		b.addVertex(c);
		b.addVertex(a);
		b.addVertex(d);
		
		d.addVertex(b);
		d.addVertex(e);
		
		f.addVertex(a);
		
		g.addVertex(a);
		g.addVertex(h);
		
		h.addVertex(g);
		breadthFirstSearch(a);

	}

	public static void breadthFirstSearch(Vertex root) {
		Queue<Vertex> queue = new LinkedList<Vertex>();
		
		root.setVisited(true);
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Vertex v = queue.remove();
			
			System.out.print(" " + v.getName());
			
			for(Vertex x: v.getAdjacentList()) {
				if(!x.isVisited()) {
					x.setVisited(true);
					queue.add(x);
				}
			}
		}
		
		
		
	}
}
