package Solutions;

public class BinarySearch {
	
	public int binarySearch(int[] nums, int target) {
	
		int mid;
		
		int left = 0;
		int right = nums.length-1;
		
		while(left<=right) {
			mid = (left+right)/2;
			
			if(nums[mid] == target) {
				return mid;
			}
			if(nums[mid]<target) {
				left = mid + 1;
			} else {
				right = mid-1;
			}
		
			
		}
		return -1;
				
				
	}
	
	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		BinarySearch binarySearch = new BinarySearch();
		int result = binarySearch.binarySearch(nums, 5);
		int result1 = binarySearch.binarySearch(nums, 3);

		int result2 = binarySearch.binarySearch(nums, 0);

		
		
		System.out.print(result);
		System.out.print(result1);

		System.out.print(result2);

		
		
	}

}
