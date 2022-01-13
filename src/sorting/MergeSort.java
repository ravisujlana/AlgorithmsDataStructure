package sorting;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = new int[] {-1,2,7,-6,4,3};
		sort(arr,  arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}
	
	public static void sort(int[] arr,  int length) {
		if(length < 2)
			return;
		int mid = length /2;
		int[] left = new int[mid];
		int[] right = new int[length-mid];
		//
		for(int i=0;i<mid;i++) {
			left[i] = arr[i];
		}
		//
		for(int i= mid;i<=arr.length-1;i++) {
			right[i-mid] = arr[i];
		}
		
		sort(left,left.length);
		sort(right,right.length);
		
		merge(arr,left,right,mid,length-mid);

	}
	
	//merge 2 arrays in ascending order
	public static void merge(int[] arr,int[] leftArray, int[] rightArray
			,int mid, int length) {
		int [] test = new int[leftArray.length + rightArray.length];
		int i=0,j=0,k=0;
		while(i < mid && j < length) {
			if(leftArray[i] < rightArray[j]) {
				arr[k++] = leftArray[i++];
				test[k-1] =  leftArray[i-1];
			}else {
				arr[k++] = rightArray[j++];
				test[k-1] =  rightArray[j-1];
							
			}
		}
		while(i<mid) {
			arr[k++] = leftArray[i++];
			test[k-1] =  leftArray[i-1];
		}
		while(j<length) {
			arr[k++] = rightArray[j++];
			test[k-1] =  rightArray[j-1];
		}
		printArray(test);
	}
	 /* A utility function to print array of size n */
    static void printArray(int arr[]) 
   { 
       int n = arr.length; 
       System.out.print("Test array : ");
       for (int i=0; i<n; ++i) 
           System.out.print(arr[i] + " "); 
       System.out.println(); 
   } 


}
