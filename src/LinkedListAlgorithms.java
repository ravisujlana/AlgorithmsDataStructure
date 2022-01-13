import java.util.HashMap;

class NodeN {
	int value;
	NodeN next;
	NodeN(int num) {
		value = num;
		next = null;
	}
}

public class LinkedListAlgorithms {
	
	NodeN head = null;

	void add(int value ) {
		
		if(head == null) {
			head = new NodeN(value);
			return;
		}
		NodeN next = head;
		while(next.next != null) {
			next = next.next;
		}
		next.next = new NodeN(value);
	}
	void printList() {
		NodeN next = head;
		System.out.print(" [ ");
		while(next != null) {
			System.out.print(" "+next.value);
			next = next.next;
		}
		System.out.println(" ]");
	}
	boolean isMatch(int value) {
		NodeN next = head;
		while(next != null) {
			if(next.value == value)
				return true;
			next = next.next;
		}
		return false;
	}
	boolean delete(int value) {
		if(head == null)
			return false;
		NodeN next = head;
		NodeN prev = null;
		while(next != null) {
			if(next.value == value ) {
				prev.next = next.next;
				return true;
			}
			prev = next;
			next = next.next;
		}
		return false;
	}
	public static void main(String[] args) {
		LinkedListAlgorithms n =  new LinkedListAlgorithms();
		n.add(2);
		n.add(3);
		n.add(4);
		System.out.println(n.isMatch(3));
		System.out.println(n.delete(4));
		n.printList();
		n.add(4);
		n.add(5);
		n.add(5);
		n.add(6);
		n.add(6);
		n.add(7);
		
		n.reverse();
		//n.head.next.next.next = n.head;
		System.out.println("cycle"+n.detectCycle());
		//System.out.println("mid:" + n.findMidOfList());
		n.removeDuplicatesBetter();
		n.add(5);
		n.add(6);
		n.add(6);
		n.add(7);
		n.removeDuplicates();
	}
	void reverse() {
		if(head == null)
			return;
		NodeN current = head;
		NodeN node = head.next;
		NodeN temp = head;
		NodeN next = null;
		while(node != null) {
			next = node.next;// 4 |
			node.next = current;//3 -> 2 |
			current = node;
			node = next; // 4 |
		}
		temp.next = null;
		head = current;
		printList();
	}
	
	int detectCycle() {
		NodeN slow = head;
		NodeN fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast)
				return fast.value;
			
		}
		return -1;
	}
	int findMidOfList() {
		NodeN mid = head;
		NodeN fast = head;
		while(mid!=null && fast !=null && fast.next != null) {
			fast = fast.next.next;
			if(fast !=null)
				mid = mid.next;

		}
		return mid.value;
		
	}
	
	void removeDuplicates() {
		this.printList();
		NodeN current = head;
		NodeN compare = null;
		HashMap<Integer,Integer> map = new HashMap<>();
		while(current !=null && current.next != null) {
			compare = current;
			while(compare.next != null) {
				if(current.value == compare.next.value) {
					map.put(compare.value, compare.value);
					compare.next = compare.next.next;
				}else {
					compare = compare.next;
				}
			}
			current = current.next;
		}
		this.printList();
	}
	void removeDuplicatesBetter() {
		this.printList();
		NodeN current = head;
	
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(head.value,head.value);
		while(current !=null && current.next != null) {
			if(map.containsKey(current.next.value)) {
				map.put(current.next.value, current.next.value);
				current.next = current.next.next;
			}else {
				map.put(current.next.value, current.next.value);
				current = current.next;
			}
		}
		this.printList();
	}
}
