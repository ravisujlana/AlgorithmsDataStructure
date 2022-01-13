import java.util.*;

public class LCM {

private static long lcm_naive(int a, int b) {
    int current_gcd = 1;
    int orgA = (a>b?a:b);
    int orgB = (a>b?b:a);
    if(a%b==0)
	    current_gcd = a;
    else {
	    while((a%b)>0){
		    int tempB = b;
	    	b=a%b;
	    	a=tempB;
	    	current_gcd = b;
	    }
	}

    return ((long)orgA * (long)orgB)/(long)current_gcd;
  }
 

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}
//761457 614573