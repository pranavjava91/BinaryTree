package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;

public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {

		Map<Integer, List<Integer>> resultMap = new HashMap<Integer, List<Integer>>();

		int[] dp = new int[nums.length + 1];

		int[] result = new int[nums.length + 1];

		dp[0] = nums[0];

		for (int i = 0; i < nums.length; i++) {
			List<Integer> numList = new ArrayList<Integer>();

			for (int j = 0; j <= i; j++) {
				if ((nums[i] > nums[j])) {
					numList.add(nums[j]);

				}
				resultMap.put(nums[i], numList);
			}
		}

		List<Integer> count = new ArrayList<Integer>();

		for (Map.Entry<Integer, List<Integer>> entrySet : resultMap.entrySet()) {
			if (entrySet.getValue() != null && !entrySet.getValue().isEmpty()) {
				
			}
		}
		
		OptionalInt max = count.stream().mapToInt(Integer::intValue).max();
		return max.getAsInt();

	}
	
	

	public static void main(String[] args) {

		//int[] nums = { 3,10,2,1,20 };
		
		int[] nums = { 10,9,2,5,3,7,101,18 };


		LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

		longestIncreasingSubsequence.lengthOfLIS(nums);

	}

}
