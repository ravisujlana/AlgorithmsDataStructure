package algorithms;

import java.util.HashMap;

public class LongestSubStringWithUniqueChars {
	
	public static void main(String[] args) {
	
		System.out.println(getLongestSubString("aaaa"));
		
	}
	
	static int getLongestSubString(String str){
		
		int maxLength = 0, windowStart = 0;
		HashMap<Character,Integer> characterMap = new HashMap<>();
		for(int windowEnd =0;windowEnd < str.length();windowEnd++) {
			char rightChar = str.charAt(windowEnd);
			if(characterMap.containsKey(rightChar)) {
				windowStart = Math.max(windowStart, characterMap.get(rightChar)+1);
			}
			characterMap.put(rightChar, windowEnd);
			maxLength = Math.max(maxLength, windowEnd - windowStart +1 );
		}
		return maxLength;
	}

}
