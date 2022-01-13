

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class RotateLeftArray {

	    // Complete the rotLeft function below.
	    static int[] rotLeft(int[] a, int d) {
	        for(int i=1;i<=d;i++){
	           arotateLeftByOne(a);
	        }
	        return a;
	    }
	    static int[] rotateLeftByOne(int[]a){
	        int temp = a[0];
	        for(int i= 0;i< a.length-1;i++){
	            a[i] = a[i+1];
	        }
	        a[a.length-1] = temp;
	        return a;
	    }
	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	
	    	rotLeft({1,2,3,4,5},4);
//	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//	        String[] nd = scanner.nextLine().split(" ");
//
//	        int n = Integer.parseInt(nd[0]);
//
//	        int d = Integer.parseInt(nd[1]);
//
//	        int[] a = new int[n];
//
//	        String[] aItems = scanner.nextLine().split(" ");
//	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	        for (int i = 0; i < n; i++) {
//	            int aItem = Integer.parseInt(aItems[i]);
//	            a[i] = aItem;
//	        }
//
//	        int[] result = rotLeft(a, d);
//
//	        for (int i = 0; i < result.length; i++) {
//	            bufferedWriter.write(String.valueOf(result[i]));
//
//	            if (i != result.length - 1) {
//	                bufferedWriter.write(" ");
//	            }
//	        }
//
//	        bufferedWriter.newLine();
//
//	        bufferedWriter.close();
//
//	        scanner.close();
	    }
	}
