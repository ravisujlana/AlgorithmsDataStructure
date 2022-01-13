package algorithms;

import java.util.HashMap;

public class LongestSubstringWithKDistinctCharacters {

	public static void main(String[] args) {
		
		System.out.println(findLength("acbbeeece", 1));
	}
	
	static int findLength(String str, int k) {
		int maxLength = Integer.MIN_VALUE;
		HashMap<Character, Integer> characterMap = new HashMap<>();
		int windowStart = 0;
		for(int windowEnd=0;windowEnd<str.length();windowEnd++) {
			char rightChar = str.charAt(windowEnd);
			characterMap.put(rightChar, 
						characterMap.getOrDefault(rightChar, 0)+1);
			while(characterMap.size() > k) {
				char leftChar = str.charAt(windowStart);
				characterMap.put(leftChar, characterMap.get(leftChar)-1);
				if(characterMap.get(leftChar) == 0){
					characterMap.remove(leftChar);
				}
				windowStart++;
			}
			maxLength = Math.max(maxLength,windowEnd - windowStart + 1);
			
		}
		
		
		return maxLength;
	}
}
