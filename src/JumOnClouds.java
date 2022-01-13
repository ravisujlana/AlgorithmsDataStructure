
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class JumOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int startInt = c[0];
        int counter = 0;
        for(int i=0;i<c.length-1;i++) {
        	System.out.println("i: "+i);
           // 0 0 1 0 0 1 0
            if(i >c.length)
                break;
            if((i+2) < c.length && c[i] == c[i+1] && c[i] == c[i+2] ){
            	System.out.println("1: c[i]: "+c[i] + " c[i+1]: "+c[i+1] + "c[i+2]:"+ c[i+2]);
                counter++;
                i=i+1;
            } else if((i+2) < c.length && c[i] == c[i+1] && c[i] != c[i+2] ){
            	System.out.println("2: c[i]: "+c[i] + " c[i+1]: "+c[i+1] + "c[i+2]:"+ c[i+2]);
                counter++;
            } else if((i+2) < c.length && c[i] != c[i+1] && c[i] == c[i+2] ){
            	System.out.println("3: c[i]: "+c[i] + " c[i+1]: "+c[i+1] + "c[i+2]:"+ c[i+2]);
                counter++;
                i=i+1;
            
            } else if( ( i+1 < c.length) && c[i] == c[i+1]){
            	counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
    
    public static void main(String args[]) {
    	jumpingOnClouds(new int[] {0, 0, 0,  1,0, 0});
    	
    }
        
}

