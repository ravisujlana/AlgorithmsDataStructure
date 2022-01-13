package sorting;


public class HeapSortImpl {

	int[] heap;
	int size;
	int maxSize;
	
	HeapSortImpl(int maxSize){
		heap = new int[maxSize+1];
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {-11,2,-7,-6,4,-23,3};
		HeapSortImpl sort = new HeapSortImpl(arr.length);
		sort.buildHeap(arr, 0, arr.length);
		sort.printArray(arr);
		int heapSize = arr.length - 1;
		for(int i=heapSize;i>0;i--) {
			sort.swap(arr,0,i);
			sort.heapify(arr, 0, --heapSize);
		}
		sort.printArray(arr);
	}
	
	 void buildHeap(int[] arr,int low, int size) {
		// Index of last non-leaf node 
		int length = (arr.length-1)/2;
		// Perform reverse level order traversal 
        // from last non-leaf node and heapify  each node 
		for(int i= length;i >=0;i--) {
			heapify(arr,i,size-1);
		}
		 
	}
	
	public  void heapify(int[] arr,int pos, int size) {
		int largest = size;
		int l = (pos *2);
		int r = (2*pos)+1;
		if(l < size && arr[l] > arr[largest]) {
			largest = l;
		}
		if(r<size && arr[r] > arr[largest]) {
			largest = r;
		}
		if(largest != pos) {
			swap(arr, pos, largest);
			heapify(arr, largest, size);
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
