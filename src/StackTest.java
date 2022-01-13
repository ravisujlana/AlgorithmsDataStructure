import java.util.Arrays;
import java.util.ListIterator;
import java.util.Stack;

class StackTest {
    public static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        int resultIndex = 0;
        Stack<Integer> stack = new Stack<>(); 
        // iterate for rest of the elements
        for (int i = arr.length - 1; i >= 0; i--) {
        	printArray(result);
        	printStack(stack);
            if (!stack.isEmpty()) {
            	System.out.println(stack.peek() + ":"+ arr[i]);
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    System.out.println(stack.pop() + " pop");
                }
            }
            if(stack.isEmpty()){
                result[i] = -1;
            }
            else
                result[i]  = stack.peek();
            stack.push(arr[i]);
        }
        return result;
    }

	public static void main(String[] args) 
	{ 
    	int arr[] = {4,12,9,3,8,1,11}; 
		System.out.println(Arrays.toString(arr));
		int result[] = nextGreaterElement(arr); 
		System.out.println(Arrays.toString(result));
	} 
	
	static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println("]");
	}
	static void printStack(Stack stack) {
		System.out.println("Stack>>> "+stack.toString());
	}
}