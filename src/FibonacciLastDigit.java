import java.util.*;

public class FibonacciLastDigit {
  static  Map<String, Long> map = new HashMap<>();
  
  private static Long calc_fib(long n) {
    if (n <= 1)
      return 1l;
    String key = ""+n;
    if(map.containsKey(key)) {
    	return map.get(key);
    }
    
	Long sum = new Long(calc_fib(n - 2)) + new Long(calc_fib(n - 1));
	map.put(key, sum);
    
    return sum;
  }
      
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long c = calc_fib(n);
        c = c%10;
        System.out.println(c);
    }
}

