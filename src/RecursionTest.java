
public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursive(3);

	}
	
	private  static int recursive(int n) {
		if(n<=2) {
			System.out.println(n+ ": n :" + 1);
			return 1;
		}
		int count = 0;
		count++;
		int ret =  recursive(n-2) + recursive(n-1);
		System.out.println(n + ": n :" + ret);
		return ret;
	}

}
