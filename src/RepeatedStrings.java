
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class RepeatedStrings {

	    // Complete the repeatedString function below.
	    static long repeatedString(String s, long n) {
	        long sLength = s.length();
	        if(!s.contains("a"))
	            return 0;
	        if(sLength == 1)
	            return n;
	        long aCounts = 0 ;
	        int fromIndex =0;
	        while((fromIndex = s.indexOf("a", fromIndex)) != -1){
	        	fromIndex++;
	            aCounts++;
	        }
	        long totalLength = n/sLength;
	        totalLength = totalLength * aCounts ;
	        int mod = (int) (n % sLength);
	        String subS = s.substring(0,mod);
	        aCounts = 0;
	        while((fromIndex = subS.indexOf("a", fromIndex)) != -1){
	            aCounts++;
	            fromIndex++;
	        }
	        return totalLength + aCounts;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        System.out.println(repeatedString("aba", 10));
	    }
	}
