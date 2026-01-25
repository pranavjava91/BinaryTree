package Sorting;

public class BubbleSort {

	public int[] bubbleSort(int[] nums) {

		 for (int i = 0; i <nums.length-1; i++) { //iterate each element in the array
			for (int j = 0; j < nums.length-i-1; j++) {//iterate over each element and compare adjacent elements 
				if (nums[j] > nums[j + 1]) {
					int temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

		return nums;

	}

	public static void main(String[] args) {

		int[] nums = { 20, 90, 30, 60, 10 };

		BubbleSort bubbleSort = new BubbleSort();
		int[] result = bubbleSort.bubbleSort(nums);
		for (int num : result) {
			System.out.println(num);
		}
	}

}
