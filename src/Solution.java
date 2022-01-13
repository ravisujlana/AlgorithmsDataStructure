import java.util.HashMap;

class Solution {
    
    public static int  lengthOfLongestSubstring1(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        System.out.println(ans);
        String a = "asdasda";
        String b = "asdasdav";
        char[] c = a.toCharArray();
        HashMap<Character,Integer> mapFirst = new HashMap<Character,Integer>();
        HashMap<Character,Integer> mapsecond = new HashMap<Character,Integer>();
        for (int i= 0;i<c.length ;i++) {
        	Integer existingNum = mapFirst.get(c[i]);
        	if(existingNum == null)
        		existingNum = 0;
        	mapFirst.put(c[i],  (existingNum + 1));
        }
        for (int i= 0;i<b.toCharArray().length ;i++) {
        	Integer existingNum = mapFirst.get(c[i]);
        	if(existingNum == null)
        		existingNum = 0;
        	mapFirst.put(c[i],  (existingNum + 1));
        }
        return ans;
    }
    public static void main(String args[]) {
    	lengthOfLongestSubstring1("abcdefghijkalabcdefghijklmnabcdefgahijklmanopqr");
    }
}