import java.util.PriorityQueue;

public class PriorityQueueHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq = 
			new PriorityQueue<>((x,y) -> Integer.compare(y, x) );
		pq.add(8);
		pq.add(10);
		pq.add(6);
		pq.add(4);
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		System.out.println(Integer.compare(10,8));
		System.out.println(Integer.compare(8,10));
	}
}
