import java.text.DecimalFormat;
import java.util.HashMap;

public class Fibonacci {

	static int counter;
	static int memoCounter;
	static long start ;
	static DecimalFormat df = new DecimalFormat("#############################");
	static HashMap<Double,Double> memoization = new HashMap<Double,Double> ();
	static String argu = "";
	public static Double printSumFib(Double arg) {	
		 start = System.currentTimeMillis();
		if(arg <= 1)
			return 1d;
		argu += ":"+arg+":,";
		if(memoization.containsKey(arg)) {
			memoCounter++;
			return memoization.get(arg);
		}
		
		Double returnVal = new Double(printSumFib(arg -2)) + new Double(printSumFib(arg - 1));
		memoization.put(arg, returnVal);
		counter++;
		return returnVal;
	}
	public static void main(String[] args) {
		System.out.println(""+df.format(printSumFib(10d)));
		long end = System.currentTimeMillis();
		System.out.println("Time taken:"+( end - start));
		System.out.println("argu:"+argu);
		String pat = "ACCCBBBC";
		computeLPSArray(pat, pat.length(), new int[pat.length()]);
		System.out.println("Fib counter"+counter + " : MemoCounter :" +memoCounter);
	}
	
	static void computeLPSArray(String pat, int M, int lps[]) 
    { 
        // length of the previous longest prefix suffix 
        int len = 0; 
        int i = 1; 
        lps[0] = 0; // lps[0] is always 0 
  
        // the loop calculates lps[i] for i = 1 to M-1 
        while (i < M) { 
        	// 1st iteration A = A
        	//2nd iteration A= A
        	//3rd iteration A = B
            if (pat.charAt(i) == pat.charAt(len)) { 
                len++;
                //len = 1
                //len = 2
              
                lps[i] = len; 
                i++; 
            } 
            else // (pat[i] != pat[len]) 
            { 
                // This is tricky. Consider the example. 
                // AAACAAAA and i = 7. The idea is similar 
                // to search step. 
                if (len != 0) { 
                    len = lps[len - 1]; 
  
                    // Also, note that we do not increment 
                    // i here 
                } 
                else // if (len == 0) 
                { 
                    lps[i] = len; 
                    i++; 
                } 
            } 
        } 
    } 
}
