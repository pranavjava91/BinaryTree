package RegularExpression;


public class DetectCapital {
	
	 public boolean detectCapitalUse(String word) {
		 
		 	boolean detectCapital = false;

	       
	       
			if(word.equals(word.toUpperCase())) {
				detectCapital = true;
				return detectCapital;
			}
			
			if(word.equals(word.toLowerCase())) {
				detectCapital = true;
				return detectCapital;
			}
	       
	       if(!Character.isUpperCase(word.charAt(0)) ) {
    		   for(int j=1;j<word.length();j++) {
    			   if(Character.isUpperCase(word.charAt(j))) {
    				   detectCapital =  false;
    				   
    			   } 
    		   }
    	   } else {
    		   for(int j=1;j<word.length();j++) {
    			   if(Character.isLowerCase(word.charAt(j))) {
    				   detectCapital = true;
    			   } else {
    				   return false;
    			   }
    		   }
    	   }
	       
	       
 		 	
	       return detectCapital;
	        
	 }
	
	 public static void main(String[] args) {
		 	DetectCapital detectCapital = new DetectCapital();
		 	
	    	String word = "FlaG";
	    	
	    	
	    	System.out.println(detectCapital.detectCapitalUse(word));
	 }


}
