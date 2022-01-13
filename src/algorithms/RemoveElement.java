package algorithms;

public class RemoveElement {

	  public static int remove(int[] arr) {
	    int nonDuplicate = 1;
	    for(int i=1;i<arr.length;i++) {
	    	if(arr[nonDuplicate-1] != arr[i]) {
	    		arr[nonDuplicate] = arr[i];
	    		nonDuplicate++;
	    	}
	    }
	    return nonDuplicate;
	  }
	  public static int remove(int[] arr,int key) {
		    int replaceIndex = 0;
		    for(int i=0;i<arr.length;i++) {
		    	if(key != arr[i]) {
		    		arr[replaceIndex] = arr[i];
		    		replaceIndex++;
		    	}
		    }

		    return replaceIndex;
		  }

	  public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
	    System.out.println(RemoveElement.remove(arr));

	    arr = new int[] { 2, 2, 2, 11 };
	    System.out.println(RemoveElement.remove(arr));
	    
		arr = new int[] { 2, 3, 3, 3, 6, 9, 9 };
		System.out.println(RemoveElement.remove(arr,3));

		arr = new int[] { 2, 11,2, 2, 1 };
		System.out.println(RemoveElement.remove(arr,2));
	  }
	}
