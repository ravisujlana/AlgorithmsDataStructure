import java.util.HashMap;
import java.util.Map;

public class CanSum {

	public static void main(String[] args) {
		// given an input of a number and an array,
		//determine if we can arrive at sum
		//[7, [5,3,4,7]
		int target = 500;
		int[] nums = new int[] {7,14};
		Map<Integer,Boolean> map = new HashMap<>();
		System.out.println(canSum(target, nums, map));
	}
	
	static boolean canSum(int target, int[] nums, Map<Integer,Boolean> map) {
		if(map.get(target) != null) return map.get(target);
		if(target < 0) return false;
		if(target ==0) return true;
		for(int num : nums) {
			int newS = target - num;
			boolean canS = canSum(newS,nums,map);
			if(canS) {
				map.put(target, canS);
				return canS;
			}
		}
		map.put(target,false);
		return false;
	}

}
