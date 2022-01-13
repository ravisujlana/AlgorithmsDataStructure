package algorithms;

import java.util.ArrayList;
import java.util.List;

public class MinimumSwapBalanceoddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intList = new ArrayList<Integer>();
		moves(intList);

	}
	
	public static int movesRecursion(List<Integer> arr) {
        // Write your code here
            int moves = 0;
            Integer[] array = arr.toArray(new Integer[arr.size()]);
            int jStartIndex = array.length-1;
            int iStartIndex = 0;
            //increment i counter starting from zero
            swapElements(array, iStartIndex, jStartIndex);
	}
	public static int moves(List<Integer> arr) {
        // Write your code here
            int moves = 0;
            Integer[] array = arr.toArray(new Integer[arr.size()]);
            int reverseIndex = array.length-1;
            //increment forward counter starting from zero
            for(int forward=0;forward<array.length;forward++){
                //if even number, continue with next array element
                if((array[forward] % 2 )== 0)
                    continue;
                // found odd element, check if starting from the back of 
                // array for even element
                // memorize J index to avoid unnecessary checks
                for(int backward=reverseIndex;backward>forward;backward--){
                    // decrement counter starting from the end
                    // check if element is even
                    if(array[backward] %2 ==0){
                        // swap values
                        swapArrayValues(array,forward,backward);
                        //remember reverse counter
                        reverseIndex = backward;
                        //increment move count
                        moves++;
                        // break if swap is completed and continue
                        // with next forward element check
                        break;
                    }
                }
            }
            return moves;
        }
        /**
        * method to swap array values
        */
        static void swapArrayValues(Integer[] array,int iIndex, int jIndex){
            // swap values
                        int tempValue = array[iIndex];
                        array[iIndex] = array[jIndex];
                        array[jIndex] = tempValue;
                        //remember J counter
        }
		
		static int swapElements( Integer[] array, int i, int j) {
			if(array[i]%2 == 0)
				i++;
			if(array[j] %2 == 0) {
				int tempValue = array[i];
				array[j] = array[i];
				array[i] = tempValue;
			}
			return swapElements(array, i, j);
		}
	
}
