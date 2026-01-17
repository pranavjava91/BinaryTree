package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Truncate {
	
	 public String truncateSentence(String s, int k) {
		 
		 	String result = null;
	        String[] stringSet = s.split("\\s+");
	        List<String> stringList = new ArrayList<String>();
	        
	        for(int i=0;i<k;i++) {
	        	stringList.add(stringSet[i]);
	        	
	        }
	        
	        result = stringList.toString().replaceAll(", "," ").replaceAll("\\]", "")
	        								.replaceAll("\\[", "");
	        
	        return result;
	        
	        
	    }
	 
	 public static void main(String[] args) {
		    Truncate truncate = new Truncate();
		 	
	    	String s = "Hello how are you Contestant";
	    	
	    	int k = 4;
	    	
	    	System.out.println(truncate.truncateSentence(s, k));
	 }

}
