package Solutions;

import java.util.Arrays;

public class MoveZeroes {

	public int[] solution(int[] nums) {

		int[] resultArray = new int[nums.length];

		int j = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				resultArray[j] = nums[i];
				j++;
			}
		}

		nums = resultArray;

		return nums;

	}

	public static void main(String[] args) {
		// int[] nums = {1,0,3,4,0,6,7};
		int[] nums = { 0, 1, 3, 0, 12 };
		MoveZeroes moveZeroes = new MoveZeroes();
		int[] result = moveZeroes.solution(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
