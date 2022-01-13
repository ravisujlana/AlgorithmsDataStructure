package algorithms;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("fib of 9:"+ fib(28));
	}
	static Map<Integer,Integer> memo = new HashMap<>();
	public static int fib(int n) {
		
		if(n<3)
			return 1;
		int fib1 = 0;
		int fib2 = 0;
		
		if(memo.containsKey(n-1)) {
			fib1 = memo.get(n-1);
		} 
		if(memo.containsKey(n-2)) {
			fib2 = memo.get(n-2);
		} 
		int returnV =  
				(fib1 > 0?fib1:fib(n-1))
				+ 
				(fib2 > 0?fib2:fib(n - 2));
		memo.put(n, returnV);
		return returnV;
	}
}
