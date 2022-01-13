import java.util.*;
import java.io.*;

public class MaxPairwise {


	    static long getMaxPairwiseProduct(int[] numbers) {
	    	int firstIndex=-1;
	    	int secondIndex = -1;
	    	int currentMax = 0;
	    	for(int i=0;i<numbers.length;i++) {
	    		if(numbers[i] >= currentMax) {
	    			firstIndex = i;
	    			currentMax = numbers[i];
	    		}
	    	}
	    	currentMax = 0;
	    	for(int i=0;i<numbers.length;i++) {
	    		if(numbers[i] >= currentMax && firstIndex != i) {
	    			secondIndex = i;
	    			currentMax = numbers[i];
	    		}
	    	}
	    	return ((long)numbers[firstIndex]) * ((long)numbers[secondIndex]);

	    }

	    public static void main(String[] args) {
	        FastScanner scanner = new FastScanner(System.in);
	        int n = scanner.nextInt();
	        int[] numbers = new int[n];
	        for (int i = 0; i < n; i++) {
	            numbers[i] = scanner.nextInt();
	        }
	        System.out.println(getMaxPairwiseProduct(numbers));
	    }

	    static class FastScanner {
	        BufferedReader br;
	        StringTokenizer st;

	        FastScanner(InputStream stream) {
	            try {
	                br = new BufferedReader(new
	                    InputStreamReader(stream));
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
	        }

	        String next() {
	            while (st == null || !st.hasMoreTokens()) {
	                try {
	                    st = new StringTokenizer(br.readLine());
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	            return st.nextToken();
	        }

	        int nextInt() {
	            return Integer.parseInt(next());
	        }
	    }

	}
