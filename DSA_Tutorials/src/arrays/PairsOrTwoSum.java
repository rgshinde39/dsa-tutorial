package arrays;

import java.util.Arrays;

public class PairsOrTwoSum {
	
	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		int[] pair = new PairsOrTwoSum().twoSum(nums, target);
		System.out.println(Arrays.toString(pair));
	}
	
	
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if(i < nums.length - 1) {
				if((nums[i]+nums[i+1]) == target) {
					return new int[]{i, i+1};
				}
			}
		}
		return null;
	}
}
