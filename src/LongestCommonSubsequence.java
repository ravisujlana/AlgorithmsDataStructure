
public class LongestCommonSubsequence {
	
	public static void main(String args[]) {
		
		int[] first = {0,0,1,1,2,3,4,2,3,7};
		int[] second = {0,1,2,3,4,4,5,6};
		System.out.println(LCS(first, second, first.length,second.length));
	}

	private static int LCS(int[] first,int[] second,int fLen, int sLen) {
		
		if(fLen == 0 || sLen == 0)
			return 0;
		if(first[fLen-1] == second[sLen -1]) {
			return LCS(first,second,fLen-1,sLen -1) +1;
		}else { 
			return Math.max(LCS(first,second,fLen-1,sLen ),
					LCS(first, second, fLen, sLen-1));
		}
		
	}
}
