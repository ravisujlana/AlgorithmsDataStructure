
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Chaotic {

	    // Complete the minimumBribes function below.
	    static void minimumBribes(int[] q) {
	        int counter = 0;
	        int maxLength = q.length;
	        boolean printCounter = true;
	        boolean swapRequired = true;		
			while(swapRequired) {
				swapRequired = false;
				for(int i= 0;i<q.length -1; i++) {
					if(q[i] > q[i+1] ) {
						if (q[i] - (i + 1) > 2 ){
							printCounter = false;
			                break;
			            }
						swapRequired = true;
						counter++;
						int temp = q[i+1];
						q[i+1] = q[i];
						q[i] = temp;
					}
				}
			}

	        if(printCounter)
	        	System.out.println(counter);
	        else
	        	System.out.println("Too chaotic");

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	    	minimumBribes(new int[] {2,1,5,3,4});
	    	minimumBribes(new int[] {2,5,1,3,4});
	    	minimumBribes(new int[] {5 ,1 ,2, 3, 7, 8 ,6 ,4});
	    	minimumBribes(new int[] {1 ,2 ,5 ,3 ,7 ,8 ,6 ,4});
	    	
//	        outer:for(int i=0; i < maxLength-1; i++){
//            if(q[i] > q[i+1])
//                counter++;
//            if(i < maxLength-2){
//                if(q[i] > q[i+2] )
//                  counter++;
//            }
//            if(i < maxLength-3){
//                if(q[i] > q[i+3]){
//                    System.out.println("Too chaotic");
//                    printCounter = false;
//                    break outer;
//                }
//            }
//        }
//	        int t = scanner.nextInt();
//	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	        for (int tItr = 0; tItr < t; tItr++) {
//	            int n = scanner.nextInt();
//	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	            int[] q = new int[n];
//
//	            String[] qItems = scanner.nextLine().split(" ");
//	            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//	            for (int i = 0; i < n; i++) {
//	                int qItem = Integer.parseInt(qItems[i]);
//	                q[i] = qItem;
//	            }
//
//	            minimumBribes(q);
//	        }
//
//	        scanner.close();
	    }
	}
