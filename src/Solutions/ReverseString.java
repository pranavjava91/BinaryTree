package Solutions;

public class ReverseString {
	 public void reverseString(char[] s) {
		   StringBuilder stringBuilder = new StringBuilder();
	        
	        for(int i = s.length-1;i>=0;i--){
	            stringBuilder.append( s[i] );
	           
	        }
	        stringBuilder.getChars(0, stringBuilder.length(), s, 0);


	       


	        
	  }
	 
	 public static void main(String[] args) {
		 	ReverseString reverString = new ReverseString();
		 	
	    	String s = "hello";
	 }

}
