public class MaxZeros {
  
  static void moveZerosToLeft(int[] A) {
	  int countZero = 0;
	    int length = A.length-1;
    int zeroIndex = -1;
    while(length >= 0){
        if(A[length] == 0 && length >0){
        	zeroIndex = length;
           countZero++;
        }else {
        	int indexSwap = length;
        	for(int i=0;i<countZero;i++) {
        		swapElement(A, indexSwap+1, indexSwap);
        		indexSwap++;
        	}
        }
        --length;
    }
  }
  static void swapElement(int[] A,int indexLast, int indexNext){
    int temp = A[indexLast];
    A[indexLast] = A[indexNext];
    A[indexNext] = temp;
  }
  public static void main(String[] args) {
	  int[] arr = new int[] {1,2,0,3,4,9,0,20,0};
	  moveZerosToLeft(arr);
	  printArray(arr);
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

