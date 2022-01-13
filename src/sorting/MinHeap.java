package sorting;

public class MinHeap {

	int[] heap;
	int size;
	int maxSize;
	
	MinHeap(int maxSize){
		heap = new int[maxSize];
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {-11,2,-7,-6,4,-23};
		MinHeap sort = new MinHeap(arr.length);
		sort.quickSort(arr, 0, arr.length-1);
		sort.printArray(arr);
		arr = new int[] {7,2,9,20,50,15,16,20,40,1,22,3,4};
		sort.quickSort(arr, 0, arr.length-1);
		sort.printArray(arr);
	}
	
	 void quickSort(int[] arr,int low, int size) {
		// Index of last non-leaf node 
		int length = arr.length/2;
		// Perform reverse level order traversal 
        // from last non-leaf node and heapify 
        // each node 
		for(int i= 0;i <=length;i++) {
			heapify(arr,i,size);
		}
		 
	}
	
	public  void heapify(int[] arr,int pos, int size) {
		int min = size;
		int l = pos *2;
		int r = (2*pos)+1;
		if(l < size && arr[l] < arr[min]) {
			min = l;
		}
		if(r<size && arr[r] < arr[min]) {
			min = r;
		}
		if(min != pos) {
			swap(arr, pos, min);
			heapify(arr, min, size);
		}
		
	}
	
	void swap(int[] arr, int low, int high) {
		int temp = arr[low];
		arr[low] = arr[high];
		arr[high] = temp;
		
	}
	
	 /* A utility function to print array of size n */
     void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 

}
