package Solutions;

public class LongestPalindromicSubstring {
	
	public String longestPalindrome(String str) {
		
		String result = "";

        //At every index, check for longest palindrome substring
        for(int i=0; i<str.length(); i++){

            //odd length
            String oddString = palindromeHelper(str, i, i);
            if(oddString.length() > result.length()){
            	result = oddString;
            }

            //even length
			
			  String evenString = palindromeHelper(str, i, i+1); 
			  if(evenString.length() > result.length()){ 
				  result = evenString; 
			  }
			  
			 

        }

        return result;


	       
	}
	
	public String palindromeHelper(String str, int left, int right){

        int start = -1;
        int end = -1;

        while(left>=0 && right<str.length() 
        		&& str.charAt(left) == str.charAt(right)){
        	
            start = left;
            end = right;
            
            left--;
            right++;
            
        }

        if(start == -1) {
        	return "";
        }
        
        String oddEvenString =  str.substring(left+1, right);

        return oddEvenString;

    }
	
	public static void main(String[] args) {
		LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();
		System.out.println(longestPalindromicSubstring.longestPalindrome("RACECAR"));
	}


}
