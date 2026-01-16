package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Consecutives {
	
	 public int findMaxConsecutiveOnes(int[] nums) {
	        int maxLength = 0;
	        
	        int count =0;
	        
	        List<Integer> countList = new ArrayList<Integer>();

	        // 1 1 0 1 1 1
	        for(int i=0;i<nums.length;i++){
	            if(nums[i] ==1){
	               count++; //1 
	            } else{
	            	 
	                count = 0;
	            }
	            countList.add(count);
	            
	            
	        }
	        
	        // 2 3
	        
	        for(Integer countInteger:countList) {
	        	maxLength = Math.max(maxLength,countInteger);
	        }
	        return maxLength;
	    }
	 
	 public static void main(String[] args) {
			
			
			int[] nums = {1,1,0,1,1,1} ;

			
			Consecutives consecutives = new Consecutives();
			System.out.println(consecutives.findMaxConsecutiveOnes(nums));
			
		}


}
