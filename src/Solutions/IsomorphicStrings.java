package Solutions;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
	
	 public boolean isIsomorphic(String s, String t) {

	        Map<Character,Character> isomorphicMap = new HashMap<>();

	        boolean isIsomorphic = false;
	        
	        if(s.equals(t)) {
	        	return true;
	        }

	        for(int i=0;i<s.length();i++){
	             char cs = s.charAt(i); // foo egg key
	             char ct = t.charAt(i); // bar add value
	             
	            if(!isomorphicMap.containsKey(cs)){
	               
	                isomorphicMap.put(cs,ct);
	            } else{
	            	if(isomorphicMap.containsValue(ct)) {
	            		return true;
	            	}
	               
	                return false;
	            }
	            
	        }

	            return false;

	    }
	 
	 public static void main(String[] args) {
		    IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
	    	
		    String s = "egg";
		    String t = "add";
	    	
	    	
	    	
	    	System.out.println(isomorphicStrings.isIsomorphic(s,t));
	    	
	 }

}
