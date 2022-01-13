
class NodeL {
	int value;
	NodeL next;
	NodeL(int num) {
		value = num;
		next = null;
	}
}

	
public class LinkedList {
	NodeL root = null;
	LinkedList(){
		
	}
	void addNewElement(int num) {
		NodeL newElem = new NodeL(num);
		if(root == null)
			root = newElem;
		else {
			NodeL current = root;
			if(num < current.value) {
				NodeL temp = root;
				root = newElem;
				root.next = temp;
			}else {
				while(current.next != null && num > current.value ) {
					current = current.next;
					if(num < current.value )
						break;
				}
				NodeL temp = current;
				current = newElem;
				newElem.next = current;
			}
		}
	}
	void printList() {
		if(root != null) {
			NodeL current = root;
			do {
				System.out.println(current.value);
				current = current.next;
			}while(current != null);
		}else {
			System.out.println("Empty List");
		}
	}
	public static void main(String[] args) {
		LinkedList lli = new LinkedList();
		lli.createLinkedList();
		lli.printList();
	}
	
	void createLinkedList() {
		int[] arr = new int[]{1,6,3,8,10,14,15};
		NodeL previousNode = null;
		for(int i=0;i<arr.length;i++) {
			NodeL node = new NodeL(arr[i]);
			if(root == null) {
				root = node;
				previousNode = root;
			} else
			if(previousNode != null) {
				previousNode.next = node;
				previousNode = node;
			}
		}
		
	}

}
