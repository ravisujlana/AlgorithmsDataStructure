package algorithms;

public class SortedSquare {

	
	public static int[] makeSquares(int[] arr) {
	
		int[] sqArray = new int[arr.length ];
		int sqCounter =0, right=arr.length-1, left = 0;
		while(left <= right) {
			int leftSquare = arr[left] * arr[left];
			int rightSquare = arr[right] * arr[right];
			if(leftSquare > rightSquare) {
				sqArray[sqCounter++] = leftSquare;
				left++;
			}else {
				sqArray[sqCounter++] = rightSquare;
				right--;
			}
		}
		return sqArray;
	}
	
	public static void main(String[] args) {

	    int[] result = SortedSquare.makeSquares(new int[] { -2, -1, 0, 2, 3 });
	    for (int num : result)
	    System.out.print(num + " ");
	    System.out.println();

	    result = SortedSquare.makeSquares(new int[] { -3, -1, 0, 1, 4 });
	    for (int num : result)
	    System.out.print(num + " ");
	    System.out.println();
	  }

}
