public class ArrayManipulation {
	/** 
	 *      A b k
     *		1 5 3
     * 		4 8 7
     *		6 9 1
	 * index->	 1 2 3  4  5 6 7 8 9 10
				[0,0,0, 0, 0,0,0,0,0, 0]
				[3,3,3, 3, 3,0,0,0,0, 0]
				[3,3,3,10,10,7,7,7,0, 0]
				[3,3,3,10,10,8,8,8,1, 0].
	 */

    public static long arrayManipulation(int n, int[][] queries) {
    	long[] zeroArray = new long[n];
    	
    	long largestNum = 0L;
    	
    	for(int i=0;i<queries.length;i++) {
    		int startindex = queries[i][0];
    		int endIndex = queries[i][1];
    		int sumValue = queries[i][2];
    		for(int k=startindex;k<=endIndex;k++) {
    			zeroArray[k] = zeroArray[k] + sumValue;
    			if(zeroArray[k] > largestNum) {
					largestNum = zeroArray[k];
				}
    		}
    		System.out.println(startindex + ":" + endIndex +":"+ sumValue);
    	}
    	return largestNum;
    }
    
	public static void main(String args[]) {
		System.out.println(arrayManipulation(10,new int[][]{ {2,6,8} ,{3,5,7},{1,8,1},{5,9,15}}));
	}
}
