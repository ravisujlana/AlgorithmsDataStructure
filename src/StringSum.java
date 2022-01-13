
public class StringSum {

	static String sumTwoStrings(String sOne, String sTwo) {
		
		int result = convert_String_To_Number(sOne) + 
						convert_String_To_Number(sTwo);
		System.out.println("result:" +result);
		
		return  convertNumToString(result);
	}
	
	public static int convert_String_To_Number(String numStr){
		char ch[] = numStr.toCharArray();
		int sum = 0;
		int zeroAscii = (int)'0';
		for(char c:ch){
			int tmpAscii = (int)c;
			sum = (sum*10)+(tmpAscii-zeroAscii);
			System.out.println("IN while loop : sum > "+ tmpAscii +" < : >"+ sum);
			}
			return sum;
	}
	
	static int  getNumberLength(int num) {
		int length = 0;
		int sNUm = num;
		while(sNUm /10 != 0) {
			length++;
			sNUm = sNUm / 10;
		}
		return length+1;
	}
	public static String convertNumToString(int numStr){
		char ch[] = new char[getNumberLength(numStr)];
		int zeroAscii = (int)'0';
		int sNumStr = numStr;
		for(int i = ch.length-1; i>=0; i--){
			ch[i] = (char) ((sNumStr % 10) + zeroAscii);
			sNumStr = sNumStr /10;
		}
		System.out.println("new String(ch)" + new String(ch));
		return new String(ch);
	}
	
	public static void main(String[] args) {
		//System.out.println( convert_String_To_Number("1234"));
		System.out.println(sumTwoStrings("67890", "12345"));
		//convertNumToString(2);
	}

}
