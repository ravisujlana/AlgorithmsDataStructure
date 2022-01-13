import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    int current_gcd = 1;
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
    return current_gcd;
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));
  }
}
