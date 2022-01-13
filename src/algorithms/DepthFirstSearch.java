package algorithms;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DepthFirstSearch {

	public static void main(String[] args) {
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		Vertex g = new Vertex("G");
		Vertex h = new Vertex("H");
		Vertex i = new Vertex("I");
		Vertex j = new Vertex("J");
		Vertex k = new Vertex("K");
		Vertex l = new Vertex("L");

		a.addVertex(b);
		a.addVertex(g);
		a.addVertex(f);
		
		b.addVertex(c);
		b.addVertex(a);
		b.addVertex(d);
		
		d.addVertex(b);
		d.addVertex(e);
		
		f.addVertex(a);
		f.addVertex(j);
		f.addVertex(k);
		
		g.addVertex(a);
		g.addVertex(h);
		g.addVertex(l);
		
		h.addVertex(g);
		h.addVertex(i);
		
		depthFirstSearch(a);

	}

	public static void depthFirstSearch(Vertex root) {
		Stack<Vertex> stack = new Stack<>();
		stack.add(root);
		
		root.setVisited(true);
		
		while(!stack.isEmpty()) {
			
			Vertex v = stack.pop();
			System.out.print(" " + root.getName());
			for(Vertex x: v.getAdjacentList()) {
				if(!x.isVisited()) {
					
					x.setVisited(true);
					depthFirstSearch(x);
				}
			}
		}
		
		
		
	}
}
