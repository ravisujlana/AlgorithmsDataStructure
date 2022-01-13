import java.util.Arrays;

public class SumMaxSubArrayKadane {

	public static int findMaxSumSubArray(int[] arr) {
		int currentMax = arr[0];
		int globalMax = arr[0];
		for(int i=1;i<arr.length ; i++) {
			if(currentMax < 0) {
				currentMax = arr[i];
			}else {
				currentMax += arr[i];
			}
			if(currentMax > globalMax) {
				globalMax = currentMax;
			}
		}
		return globalMax;
	}
    public static void main( String args[] ) {
        int[] arr1 = {1, 7, -2, -5, 10,1, -1};
        int[] arr2 = {-4,2,-5,1,2,3,6,1,-5,1};
        System.out.println(-2 * -2);

        System.out.println("Array: "+ Arrays.toString(arr1));
        System.out.println("Sum: " + findMaxSumSubArray(arr1));
        System.out.println("Array: "+ Arrays.toString(arr2));
        System.out.println("Sum: " + findMaxSumSubArray(arr2));
    }

}
