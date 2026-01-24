package backtracking;

import java.util.ArrayList;
import java.util.List;

public class permutations {
	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> resultList = new ArrayList<>();

		backtrack(resultList, new ArrayList<>(), nums);

		return resultList;

	}

	private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) { 

		if (tempList.size() == nums.length) {
			resultList.add(new ArrayList<>(tempList));
			return;
		}

		for (int number : nums) { //123
			if (tempList.contains(number))// logically check if it comes back to 1 and branches out to 3 instead of 2, 
											//this happens if you try to solve the program from the example and try to get the first few cases instead of trying to understand the recursion before getting the first few cases right
				continue;

			tempList.add(number); // adds a number
			backtrack(resultList, tempList, nums); // recursive backtracking
			tempList.remove(tempList.size() - 1); //removes a number from the end

		}

	}

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3 };
		permutations permutations = new permutations();
		List<List<Integer>> resultList = permutations.permute(nums);
		int counter = 0;
		for (List<Integer> list : resultList) {
			for (Integer num : list) {
				if(counter++ % 3 == 0){
					System.out.println();
				}
				System.out.print(num);
			}

		}
	}

}
