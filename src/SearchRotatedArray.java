
public class SearchRotatedArray {

	static int binarySearchRotated(int[] arr,int num) {
		int start = 0;
		int end = arr.length -1;
		while(start <= end) {
			int mid = start + (end-start)/2;
			// if len = 7, then 0 + (7-0)/2 = 3
			//    arr[2] = 2
			//    3 > 2 && 3 < 5 && 2 < 5 then start - mid + 1
			// s = 3, e = 7, mid = 4 + (7 - 4)/2 = 5
			//    arr[mid] = 4
			//    
			if(arr[mid] == num)
				return mid;
			else if(num < arr[mid] && num <= arr[end] && arr[mid] < arr[end]) {
				end = mid -1;
			} else if(num < arr[mid] && num <= arr[end] && arr[mid] < arr[end]) {
				start = mid + 1;
			} else if(num > arr[mid] && num <= arr[end] && arr[mid] < arr[end]) {
				start = mid + 1 ;
			}else if(num > arr[mid] && num >= arr[start] && arr[mid] < arr[end]) {
				end = mid - 1 ;
			} else if(num < arr[mid] && num <= arr[end] && arr[mid] > arr[end]) {
				start = mid + 1;
			} else if(num < arr[mid] ) {
				end = mid - 1;
			} else if(num > arr[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}
	

	public static void main(String []args){
	    int[] v1 = {6, 7, 1, 2, 3, 4, 5};
	    System.out.println("Key(3) found at: " + binarySearchRotated(v1, 3));
	    System.out.println("Key(6) found at: " + binarySearchRotated(v1, 6));
	    System.out.println("Key(7) found at: " + binarySearchRotated(v1, 7));
	    System.out.println("Key(5) found at: " + binarySearchRotated(v1, 5));
	    
	    int[] v2 = {4, 5, 6, 7, 1, 2, 3};
	    System.out.println("Key(3) found at: " + binarySearchRotated(v2, 3));
	    System.out.println("Key(4) found at: " + binarySearchRotated(v2, 4));
	    System.out.println("Key(7) found at: " + binarySearchRotated(v2, 7));
	    System.out.println("Key(6) found at: " + binarySearchRotated(v2, 6));    
	  }
}
