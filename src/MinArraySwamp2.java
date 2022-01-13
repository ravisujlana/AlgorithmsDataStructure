
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinArraySwamp2 {

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
    	int count = 0;
       
       for(int i = 0; i < arr.length; i++) {
           int temp = 0;
           int index = 0;
           if(arr[i] != i + 1) {
               for(int j = i + 1; j < arr.length; j++) {
                   if(arr[j] == i + 1) {
                       index = j; break;
                   }
               }
               temp = arr[i];
               arr[i] = arr[index];
               arr[index] = temp;
               count++;
           }
       }
       return count;

    }

  
    public static void main(String[] args) throws IOException {
//    	System.out.println(minimumSwaps(new int[] {4,3,2,1}));
//    	System.out.println(minimumSwaps(new int[] {2, 3, 4, 1, 5}));
    	System.out.println(minimumSwaps(new int[] {8, 5, 11, 4, 6}));
  
    }
}
