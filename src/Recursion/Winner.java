package Recursion;

public class Winner {
	
	 public boolean predictTheWinner(int[] nums) {
         return recursive(nums,0,nums.length-1)>=0;
     
	 }
	 public int recursive(int[] nums,int start,int end){
	     if(start==end){
	         return nums[start];
	     }
	     
	     int left = nums[start] - recursive(nums,start+1,end);
	     int right= nums[end] -recursive(nums,start,end-1);
	
	     return Math.max(left,right);
	     
	 }
	 
	 public static void main(String[] args) {
	    	
	    	Winner winner = new Winner();
	    	int[] nums = {1,5,2};
	    	
	    	System.out.println(winner.predictTheWinner(nums));
	    	
	    	
	 }

}
