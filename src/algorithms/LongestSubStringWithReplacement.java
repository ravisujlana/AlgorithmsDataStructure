package algorithms;

import java.util.HashMap;

public class LongestSubStringWithReplacement {
	
	public static void main(String[] args) {
		findMaxReplacement("aabccbb", 2);
		
	}
	
	static int findMaxReplacement(String str, int k) {
		int maxLength = 0, windowStart = 0;
		HashMap<Character, Integer> characterMap = new HashMap<>();
		for(int windowEnd = 0;windowEnd < str.length();windowEnd++) {
			char rightChar = str.charAt(windowEnd);
			characterMap.put(rightChar, characterMap.getOrDefault(rightChar, 0) + 1);
			while(characterMap.size() > k) {
				
			}
			maxLength = Math.max(maxLength, windowEnd - windowStart+1);
			
		}
		return maxLength;
	}

}
