package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PredictTheWinner {
	
	 	Map<String, List<Integer>> scoreMap = new HashMap<String,List<Integer>>();

	    String p1 = "player1Score";

	    String p2 = "player2Score";
	    
	   

	    public boolean predictTheWinner(int[] nums) {
	    	
	    	
	 	    
	 	    boolean isWinner = false;

	        if(nums.length == 0){
	            return true;
	        }
	        
	        predictRecursive(nums,true,false);
	        
	        if(scoreMap!=null) {
		        
		        if(scoreMap.get(p1).stream().mapToInt(Integer::intValue).sum()>
		         					scoreMap.get(p2).stream().mapToInt(Integer::intValue).sum()) {
		        	isWinner = true;
		        }
	        }

	        return isWinner;
	        
	    }
	    public boolean predictRecursive(int[] nums,boolean player1,boolean player2){
	        
	        if(nums.length ==0){
	            return true;
	        }
	        int i = 0;
	        
	        int j=nums.length-1;


	        while(i<=j){
	            if(player1){
	                if(nums[i]>nums[j]){
	                	
		                 
		                 if(scoreMap.containsKey(p1) && !scoreMap.containsValue(nums[i])) {
		                	 List<Integer> p1Score = scoreMap.get(p1);
		                	 p1Score.add(nums[i]);
		                	 scoreMap.put(p1, p1Score);
		                 } else {
		                	 List<Integer> player1Score = new ArrayList();
			                 player1Score.add(nums[i]);
		                	 scoreMap.put(p1, player1Score);
		                 }
		                 
		                 int[] modifiedArray = Arrays.copyOfRange(nums,i+1,nums.length);
		                 
		                 return predictRecursive(modifiedArray, false, true);
	                    
	                } else{
	                	
	                	  if(scoreMap.containsKey(p1)  && !scoreMap.containsValue(nums[i])) {
			                	 List<Integer> p1Score = scoreMap.get(p1);
			                	 p1Score.add(nums[j]);
			                	 scoreMap.put(p1, p1Score);
			                 } else {
			                	 List<Integer> player1Score = new ArrayList();
				                 player1Score.add(nums[j]);
			                	 scoreMap.put(p1, player1Score);

			                 }
	                	  
			                 
		                 
		                 int[] modifiedArray = Arrays.copyOfRange(nums,0,nums.length-1);
		                 
		                 return predictRecursive(modifiedArray, false, true);


		                 

	                }
	            } else if(player2){
	            	
	            	if(nums[i]>nums[j]){
	            	
	            		if(scoreMap.containsKey(p2) && !scoreMap.containsValue(nums[i])) {
		                	 List<Integer> p2Score = scoreMap.get(p2);
		                	 p2Score.add(nums[i]);
		                	 scoreMap.put(p2, p2Score);
		                 } else {
		                	 List<Integer> player2Score = new ArrayList();
			                 player2Score.add(nums[i]);
		                	 scoreMap.put(p2, player2Score);

		                 }
		                 
		                 
	            		 int[] modifiedArray = Arrays.copyOfRange(nums,i+1,nums.length-1);
		                 
		                 return predictRecursive(modifiedArray, true, false);


		            	
	
		               
	            	} else {
	            		

	            		if(scoreMap.containsKey(p2)) {
		                	 List<Integer> p2Score = scoreMap.get(p2);
		                	 p2Score.add(nums[j]);
		                	 scoreMap.put(p2, p2Score);
		                 } else {
		                	 List<Integer> player2Score = new ArrayList();
			                 player2Score.add(nums[j]);
		                	 scoreMap.put(p2, player2Score);

		                 }
		                 
		                 
	            		 int[] modifiedArray =  Arrays.copyOfRange(nums,0,nums.length-1);
		                 
		                 return predictRecursive(modifiedArray, true, false);

		            	
	
	            		
	            	}
	            }
	        }
			return false;	       
	    }
	    
	    public static void main(String[] args) {
	    	
	    	PredictTheWinner predictTheWinner = new PredictTheWinner();
	    	int[] nums = {9,5,233,7};
	    	
	    	System.out.println(predictTheWinner.predictTheWinner(nums));
	    	
	    	
	    }

}
