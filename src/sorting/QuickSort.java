package sorting;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {7,9,1,2,5,8,10};
		quickSort(arr, 0, arr.length-1);
//		arr = new int[] {7,2,9,20,50,15,16,-20,-40,1,-2,3,4};
//		quickSort(arr, 0, arr.length-1);
	}
	
	static void quickSort(int[] arr,int low, int high) {
		System.out.println("low:"+ low + ":high :" +high);
		
		if(low > high) {
			return;
		}
		if(arr == null || arr.length ==0) {
			return;
		}
		
		int pivot = arr[new Random().nextInt(high)];
		
		int i=low, j = high;
		System.out.println("pivot = "+pivot);
		printArray(arr);
		
		// 0, 5
		while(i<=j) {
			while(arr[i] < pivot) {
				i++;
			}
			
			while(arr[j] > pivot){
				j--;
			}
			if(i<=j) {
				System.out.println("i "+i + " : j: "+j );
				swap(arr,i,j);
				i++;
				j--;
			}
			printArray(arr);
		}

		if(low < j) {
			System.out.println("low < jow < jow < jow < jow < jow < Low");
			quickSort(arr, low, j);
		}
		if(high > i) {
			System.out.println("high > i >high > i>high > i>high > i>high > i ");
			quickSort(arr, i, high);
		}
	}
	
	static void swap(int[] arr, int x, int y) {
		int temp = arr[y];
		arr[y] = arr[x];
		arr[x] = temp;
		
	}
	
	 /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

}
