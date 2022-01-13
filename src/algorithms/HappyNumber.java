package algorithms;

public class HappyNumber {

	public static void main(String[] args) {
		System.out.println(happyNumber(12));
		System.out.println(happyNumber(23));
	}
	
	static boolean happyNumber(int num) {
		int slow = num;
		int fast = num;
		do {
			slow= returnNumber(slow,"S");
			fast = returnNumber(returnNumber(fast,"F1"),"F2");
		}	while(slow != fast);
		
		return slow ==1;
	}
	static int returnNumber(int num,String type) {
		
		int sum = 0, digit = 0;;
		while(num > 0) {
			digit = num % 10;
			sum += digit * digit;
			num /= 10;
		}
		System.out.println(sum + " ::::: "+ type);
		return sum;
	}
	
	
}
