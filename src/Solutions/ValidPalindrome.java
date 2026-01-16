package Solutions;

public class ValidPalindrome {
	
	 public boolean isPalindrome(String s) {

	       String optimized =  s.replaceAll("[^a-z0-9A-Z]", "").toLowerCase();

	       boolean isPalindrome = true;

	       int j=optimized.length()-1;
	       int i=0;

	    	 while(i<=j) {  
		         if(optimized.charAt(i) != optimized.charAt(j)){
		            return false;
		         } else{
		        	i++; 
		            j--;
		         }
	    	 }
	       

	       return isPalindrome;
	        
	    }
	 
	 	public static void main(String[] args) {
			ValidPalindrome validPalindrome = new ValidPalindrome();
			System.out.println(validPalindrome.isPalindrome("0P"));
		}


}
