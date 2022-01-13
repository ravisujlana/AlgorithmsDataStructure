package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ArraySmallestNumber {

	public static void main(String[] args) {
		System.out.println(minimumAbsoluteDifference(new int[] {3,-7,0}));

	}
	
	static int minimumAbsoluteDifference(int[] arr) {

		int smallest = Integer.MAX_VALUE;
        int firstValue = 0;
        int secondValue = 0;
        Arrays.parallelSort(arr);
        for(int i=0;i<arr.length-1;i++) {
        	firstValue = arr[i];
        	for(int j=i+1;j<arr.length;j++) {
        		secondValue = arr[j];
        		int diff = firstValue - secondValue;
        		diff = Math.abs(diff);
        		if(diff < smallest)
        			smallest = diff;
        	}
        }
        
        return smallest;

    }

}
