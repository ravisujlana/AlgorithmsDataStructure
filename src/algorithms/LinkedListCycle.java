package algorithms;

class ListNode {
	  int value = 0;
	  ListNode next;

	  ListNode(int value) {
	    this.value = value;
	  }
	}

public class LinkedListCycle {

	  public static int findCycleLength(ListNode head) {
	    
		  ListNode slow = head;
		  ListNode fast = head;
		  while (fast != null && fast.next != null) {
			  slow = slow.next;
			  fast = fast.next.next;
			  if(slow == fast)
				  break;
		  } 
		  int length = findLength(slow);
		  findStartOfCycle(head, length);
		  return length;
	  }
	  
	  static int findLength(ListNode slow) {
		  ListNode cycle = slow;
		  int counter=0;
		  do {
			  cycle = cycle.next;
			  counter++;
		  } while(slow != cycle);
		  return  counter;
	  }
	  
	  public static void findStartOfCycle(ListNode head, int length) {
		  ListNode pointer1 = head, pointer2 = head;
		  while(length > 0) {
			  pointer2 = pointer2.next;
			  length--;
		  }
		  
		  while(pointer1 != pointer2) {
			  pointer1 = pointer1.next;
			  pointer2 = pointer2.next;
		  }
		  System.out.println(pointer1.value + " start of cycle");
	  }

	  public static void main(String[] args) {
	    ListNode head = new ListNode(1);
	    head.next = new ListNode(2);
	    head.next.next = new ListNode(3);
	    head.next.next.next = new ListNode(4);
	    head.next.next.next.next = new ListNode(5);
	    head.next.next.next.next.next = new ListNode(6);
	    head.next.next.next.next.next.next = head.next.next;
	    System.out.println("LinkedList cycle length: " + LinkedListCycle.findCycleLength(head));

	    head.next.next.next.next.next.next = head.next.next.next;
	    System.out.println("LinkedList cycle length: " + LinkedListCycle.findCycleLength(head));
	    
	    head.next.next.next.next.next.next = head;
	    System.out.println("LinkedList cycle start: " + LinkedListCycle.findCycleLength(head));
	 
	  }
	}
