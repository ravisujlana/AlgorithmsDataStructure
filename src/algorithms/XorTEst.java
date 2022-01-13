package algorithms;

public class XorTEst {

		  public static int findMissingNumber(int[] arr) {
		    int n = arr.length + 1;
		    // find sum of all numbers from 1 to n.
		    int x1 = 1;
		    for (int i = 2; i <= n; i++){
		      x1 = x1 ^ i;
		      System.out.println("i: "+i);
		      System.out.println("x1: "+x1);
		    }
		    System.out.println("-----");
		    // x2 represents XOR of all values in arr
		    int x2 = arr[0];
		    for (int i = 1; i < n-1; i++){
		      x2 = x2 ^ arr[i];
		      System.out.println("i: "+i);
		      System.out.println("x2: "+x2);
		    }

		    // missing number is the xor of x1 and x2
		    System.out.println("x1 ^ x2 : " + (x1  ^ x2));
		    return x1 ^ x2;
		  }

		  public static int findSingleNumber(int[] arr) {
			    int num = 0;
			    for (int i=0; i < arr.length; i++) {
			    	System.out.println(num + " :::: num " + arr[i]);
			      num = num ^ arr[i];
			    }
			    return num;
			  }
		  public static void main(String[] args) {
		    int[] arr = new int[] { 1, 5, 2, 6, 4 };
		    System.out.print("Missing number is: " + XorTEst.findMissingNumber(arr));
		    System.out.println(findSingleNumber(new int[]{1, 4, 2, 1, 3, 2, 3}));

		  }
		}
