package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	
	public int lengthOfLongestSubstring(String s) {
		
		  int left = 0;

	        int maxLength = 0;
	        
	       int p =  Integer.parseInt(s);

	        Set<Character> characterSet = new HashSet<Character>();
	        
	        char[] chars = s.toCharArray();
	        
	        for(int right =0;right<s.length();right++){	  
	                while(characterSet.contains(s.charAt(right))){
	                    characterSet.remove(s.charAt(left));
	                    left++;
	                }
	                characterSet.add(s.charAt(right));
	                maxLength = Math.max(maxLength,right-left+1);
	               
	        }

			return maxLength;
			
	   }

	
	public static void main(String[] args) {
		
		
		String s2 = "pwwkew";

		
		LongestSubstring longestSubstring = new LongestSubstring();
		System.out.println(longestSubstring.lengthOfLongestSubstring(s2));
		
	}

}
