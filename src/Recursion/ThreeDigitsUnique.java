package Recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeDigitsUnique {
	
	 public int totalNumbers(int[] digits) {
	        
		 	Set<Integer> numSet = new HashSet<Integer>();
		 	String[] stringArray = convertToString(digits);
		 	
		 	StringBuilder stringBuilder = new StringBuilder();
		 	
		 	// 1,2,3,4

	        for(int i=0;i<stringArray.length;i++){ //1,2,3,4
	        	
	        	if(digits[i] != 0) {
		        	for(int j=0;j<stringArray.length;j++) { //2,3,4
		        		
		        		if(i!=j) { 
		        			
		        			for(int k=0;k<stringArray.length;k++) {
		        				
		        				if(i!=j && j!=k && i!=k) {
		        				
		        					stringBuilder.append(stringArray[i]).append(stringArray[j]).append(stringArray[k]); //2
		        				
		        				}
		        				
		        			}
		        			
			  
		        		}
		        	}
	        	}
	        }
	        
	        String[] result = null;
	        if(!stringBuilder.isEmpty()) {
	        
	        	 result = stringBuilder.toString().split("(?<=\\G...)");
	        } else {
	        	return -1;
	        }
	        
	        
	        
	        
	        
	        return convertToSet(result).size();
	        
	    }
	 
	 	public String[] convertToString(int[] digits) {
	 		
	 		Arrays.sort(digits);
		 	
		 	
		 	String numString =  Arrays.toString(digits);
		 	String[] numsArray = numString.substring(1,numString.length()-1).split(", ");
		 	
		 	return numsArray;
		 	
	 		
	 	}
	 	
	 	public Set<Integer> convertToSet(String[] result) {
		 	Set<Integer> numSet = new HashSet<Integer>();

	 		  
	        for(int i=0;i<result.length;i++) {
	        	int oddEvenResult = Integer.parseInt(result[i]);
	        	if(oddEvenResult%2==0) {
	        		numSet.add(oddEvenResult);
	        	}
	        }
	        
	        return numSet;
	 		
	 	}
	 
	 	public static void main(String[] args) {
			
			
			int[] nums = {0,0,0};

			
			ThreeDigitsUnique threeDigitsUnique = new ThreeDigitsUnique();
			System.out.println(threeDigitsUnique.totalNumbers(nums));
			
		}

}
