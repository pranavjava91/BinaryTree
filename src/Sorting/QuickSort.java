package Sorting;

public class QuickSort {

	// 1. choose a pivot 2. partition the array 3. recursively sort subarrays

	public int[] quickSort(int[] arr) {

		int pivot = arr[arr.length-1];

		int i = -1;
		int j = 0;

		while (j < arr.length - 1) {

			if (arr[j] < pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				
			}
			j++;
		}

		return arr;

	}
	
	public void sort(int[] nums, int low, int high) {
		
		if(low>=high) {
			return;
		}
		
		int start = low; //0
		int end = high; //7
		int mid = start +(end-start)/2; //3
		int pivot = nums[mid]; //12
		
		while(start<=end) {
			while(nums[start]<pivot) { //20<12 -false , 2<12 -true, 7<12 - true, 12<12 - false
				start++; //1 2 3
			}
			while(nums[end]>pivot) {//8>12 - false, 6>12 - false, 1>12 - false
				end--;
			}
			if(start<=end) {
				int temp = nums[start];
				nums[start] = nums[end];
				nums[end] = temp;
				start++;
				end--;
			}
			
		}
		
		sort(nums,low,end);
		sort(nums,start,high);
		
		// now my pivot is at correct index, sort the two halves recursively
		
	}

	public static void main(String[] args) {
		int[] arr = { 20, 2, 7, 12, 15, 1, 6, 8 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr,0,arr.length-1);
		
		for(int res:arr) {
			System.out.println(res);
		}

	}

}
