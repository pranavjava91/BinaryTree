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
		
		if(low>=high) { // if lower index greater than or equal to or is past or crosses higher index return,  low-5,high-4 or low-5,high-5
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
		
		// now my pivot is at correct index, sort the two halves recursively
		// all the elements less than pivot will be on the left had side
		// all the elements greater than pivot will be on the right had side
		// we are putting the pivot at the correct position
		// if low > end returns or start > high returns 

		
		sort(nums,low,end); // nums,low,high - actual call nums, 0,4 , end- high , end changes from low to end --, from 0 to changed end
		sort(nums,start,high);// nums,5,7, start - low, start changes from low to start++, from changed start to last 
		
		
	}

	public static void main(String[] args) {
		int[] arr = { 20, 2, 7, 12, 15, 1, 6, 8 };
		QuickSort quickSort = new QuickSort();
		quickSort.sort(arr,0,arr.length-1); // arr,low,high
		
		for(int res:arr) {
			System.out.println(res);
		}

	}

}
