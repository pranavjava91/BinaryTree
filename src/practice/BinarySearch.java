package practice;

public class BinarySearch {
	
	public int implement(int[] nums, int target) {
		
		int left =0;
		
		int right = nums.length;
		
		int mid = 0;
		
		
		while(left<=right) {
			mid =(left +right)/2;
			if(nums[mid] == target) {
				return mid;
			}
			
			if(nums[mid]<target) {
				left = mid+1;
			}
			if(nums[mid]>target) {
				right=mid-1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] nums = {20,30,40,50,60};
 		BinarySearch binarySearch = new BinarySearch();
		System.out.println(binarySearch.implement(nums, 30));
	}

}
