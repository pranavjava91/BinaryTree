package Solutions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	
	 public int singleNumber(int[] nums) {
	
		 int result = 0;
	
	     Map<Integer,Integer> numsMap = new HashMap<Integer,Integer>();
	      for(int i =0;i<nums.length;i++){
	         if(numsMap.containsKey(nums[i])){
	             numsMap.put(nums[i], numsMap.get(nums[i])+1);
	         } else{
	             numsMap.put(nums[i],1);
	         }
	      }
	     for(Map.Entry<Integer,Integer> entry: numsMap.entrySet()){
	         if(entry.getValue() ==1);
	         return entry.getKey();
	     }
	     return -1;
	 }
	 
	 public static void main(String[] args) {
	    	int[] nums = {4,1,2,1,2};
	    	SingleNumber singleNumber  = new SingleNumber();
	    	System.out.println(singleNumber.singleNumber(nums));
	 }

}
