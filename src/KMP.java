
public class KMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ABCABABFABCDEG";
		String pat = "ABA";
		int patL = pat.length();
		int[] LPS = new int[patL];
		
		boolean found = findPatternMatch(text, pat, LPS);
		System.out.println("Found: "+found);

	}
	
	static boolean findPatternMatch(String text, String pat, int[] LPS) {
		boolean found = false;
		
		
		return found;
	}
	static int[] calculateLPS(String pat, int patL,int[] LPS) {
		
		int i=1;
		int len=0;
		while(i<patL) {
			// A = A for 0,1
			if(pat.charAt(i) == pat.charAt(len)) {
				len++;
				LPS[i] = len;
				i++;
			}else { //A<>B
				if(len!= 0)  { //since previous items were same
					//decrease length
					// don't change i since same characters will be compared again
					len = LPS[len-1];
				} else {
					// if len = 0
					LPS[i] = len;
					i++;
				}
			}
		}
		return LPS;
	}

}
