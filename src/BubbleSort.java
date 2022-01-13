
public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {3,4,2,1,23,6,43,7,1,10,1,1,1,1,45,22,21,3};
		boolean swapRequired = true;		
		while(swapRequired) {
			swapRequired = false;
			for(int i= 0;i<array.length -1; i++) {
				if(array[i] > array[i+1] ) {
					swapRequired = true;
					int temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
				}
			}
		}
		for(int j=0;j<array.length;j++) {
			System.out.print(array[j]+",");
		}
		System.out.println("\n");
	}

}
