package GreedyApproach;

public class JumpGame {
	
	public boolean canJump(int[] nums) {
		
		int lastIndex = nums.length-1;
		int maxReach = nums[0];
		
		for(int i=0;i<=maxReach;i++) { //loop until maxReach
			if(maxReach>=lastIndex) {
				return true;
			} else {
				maxReach = Math.max(maxReach, i+nums[i]);
				
			}
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		
		JumpGame jumpGame = new JumpGame();
		
		int[] nums = {3,2,1,0,4};
		
		System.out.println(jumpGame.canJump(nums));
		
		
	}

}
