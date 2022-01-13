import java.util.Arrays;
import java.util.List;

public class FindLowHighIndex {

	
	public static void main(String[] args) {
	    List<Integer> array = Arrays.asList(1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6);
	    int key = 6;
	    int low = findLowIndex(array, key);
	    System.out.println("Low Index of " + key + ": " + low);
	    int high = findHighIndex(array, key);
	    System.out.println("High Index of " + key + ": " + high);

	    key = 5;
	    high = findHighIndex(array, key);
	    low = findLowIndex(array, key);
	    System.out.println("Low Index of " + key + ": " + low);
	    System.out.println("High Index of " + key + ": " + high);
	  }

	private static int findHighIndex(List<Integer> array, int key) {
		Integer[] a = new Integer[array.size()];
		array.toArray(a);
		int start = 0;
		int end =array.size()-1;

		int mid = start + (end-start)/2;
		while(start <= end && mid >=0) {
			int current = array.get(mid);
			if(current <= key ) {
				start = mid+1;
			}else {
				end = mid-1;
			}
			mid = start + (end - start) / 2;
		}
		if(end == -1)
			return end;
		if(end < array.size() && array.get(end) == key)
			return end;
		return -1;
	}

	private static int findLowIndex(List<Integer> array, int key) {
		Integer[] a = new Integer[array.size()];
		array.toArray(a);
		int start = 0;
		int end =array.size()-1;

		int mid = end/2;
		while(start <= end) {
			int current = array.get(mid);
			if(current < key ) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
			mid = start + (end - start) / 2;
		}
		if(start == -1)
			return start;
		if(start < array.size() && array.get(start) == key)
			return start;
		return -1;
	}
}
