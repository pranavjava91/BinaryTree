package Solutions;

public class LeftAndRightSum {
	
	public int[] leftRightDifference(int[] nums) {
		
		int[] leftSum = new int[nums.length];
		
		int[] rightSum = new int[nums.length];
		
		int[] difference = new int[nums.length];
		
		leftSum[0] = 0;
		
		rightSum[nums.length-1] = 0;
		
		
		
		
		for(int i=1;i<nums.length;i++) {
			
			leftSum[i] = leftSum[i-1] + nums[i-1];
			
		}
		
		
		for(int j=nums.length-1;j>=1;j--) {
			rightSum[j-1] = rightSum[j] + nums[j];
			
		}
		
		for(int k=0;k<difference.length;k++) {
			difference[k] = Math.abs(leftSum[k]-rightSum[k]);
		}
		
		
		
		return difference;
		
		
	}
	
	public static void main(String[] args) {
		
		int[] nums = {10,4,8,3}; //0,10,14,22 and 15,11,3,0
		
		LeftAndRightSum leftAndRightSum = new LeftAndRightSum();
		
		System.out.println(leftAndRightSum.leftRightDifference(nums));
		
	}

}
