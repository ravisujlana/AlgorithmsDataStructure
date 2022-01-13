
public class MergeSort {

	public static void main(String args[]) {
		System.out.println("MergeSort");
		int[] str = {43,23,4,3,42,12,21,54,87,100,132,213,145,
					46,43,23,5,4,3};
		mergeSort(str,str.length);
		System.out.println("Sorted:"+isSorted(str));
		printArray(str);
	}
	
	private static void mergeSort(int[] arr,int length) {
		
		if(length < 2)
			return;
		int mid = (length)/2;
		int[] leftArray = new int[mid];
		int[] rightArray = new int[length -mid];
		for(int i=0;i<mid;i++) {
			leftArray[i] = arr[i];
		}
		for(int i= mid;i<=arr.length-1;i++) {
			rightArray[i-mid] = arr[i];
		}
		
		mergeSort(leftArray,leftArray.length);//can use mid
		mergeSort(rightArray,rightArray.length);//can use length - mid
		
		merge(arr,leftArray,rightArray,mid,length-mid);
	}
	private static void merge(int[] arr,int[] leftArray, int[] rightArray,
					int leftMid , int rightMid) {
		int i=0,j=0, k=0;
		while(i < leftMid && j < rightMid) {
			if(leftArray[i] < rightArray[j]) {
				arr[k++] = leftArray[i++];
			}else {
				arr[k++] = rightArray[j++];
			}
		}
		while(i < leftMid) {
			arr[k++] = leftArray[i++];
		}
		while(j < rightMid) {
			arr[k++] = rightArray[j++];
		}
		
	}
	
	 /* A utility function to print array of size n */
    static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
    
    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i-1]) return false;
        return true;
    }
}
