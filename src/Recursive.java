
public class Recursive {

	public static void recursiveFunc(int n)
	{
	    if(n == 0)
	    {
	            System.out.print("False");
	            return;
	    }
	    if(n == 1)
	    {
	                System.out.print("True");
	         return;
	    }
	    if(n%2==0)
	    {
	            recursiveFunc(n/2);
	    }
	    else
	    {
	             System.out.print("False");
	         return;
	    }
	}

	public static void main(String args[])
	{
	     recursiveFunc(64);
	}
}
