
public class FindSmallestCommon {
	
	static Integer findLeastCommonNumber(int[] a, int[] b, int[] c) {
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while( i < a.length && j < b.length && k < c.length) {
			
			if(a[i] == b[j] && a[i] == c[k])
				return a[i];
			if(a[i] <= b[j] && a[i] <= c[k]) {
				i++;
			}else
			if (b[j] <= a[i] && b[j] <= c[k]) {
				j++;
			}else
			if(c[k] <= a[i] && c[k] <= b[j]) {
				k++;
			}
		}
		return -1;
		
	}

	public static void main(String []args){
	    int[] v1 = new int[]{6, 7, 10, 25, 30, 63, 64};
	    int[] v2 = new int[]{1, 4, 5, 6, 7, 8, 50};
	    int[] v3 = new int[]{1, 6, 10, 14};

	    Integer result = findLeastCommonNumber(v1, v2, v3);
	    System.out.println("Least Common Number: " + result);
	  }
}
