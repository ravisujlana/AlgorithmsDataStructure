package algorithms;

public class SmallestSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findMinSubArray(7, new int[]{2, 1, 5, 2, 8}));

	}
	
	public static int findMinSubArray(int sum, int[]arr) {
		int currentSum = 0;
		int minSize = Integer.MAX_VALUE;
		int start=0;
		
		for(int i=0;i<arr.length;i++) {
			currentSum += arr[i];
			if(currentSum >= sum) {
				minSize = Math.min(minSize, i-start +1);
				currentSum -= arr[start];
				start++;
				
			}
			
		}
		return minSize;
	}
	/**
	 * int currentMax = 0;
    int start = 0;
    int globalSize = Integer.MAX_VALUE;
    //findMinSubArray(7, [2, 1, 5, 2, 8])
    for(int i=0;i<arr.length;i++){
        currentMax+=arr[i];
        while(currentMax >= S){
          globalSize = Math.min(globalSize,i-start +1);
          currentMax -= arr[start];
          start++;
        }
    }
    return globalSize;
	 */

}
