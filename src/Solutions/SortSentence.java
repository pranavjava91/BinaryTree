package Solutions;

import java.util.Map;
import java.util.TreeMap;

public class SortSentence {
	 public String sortSentence(String s) {

	        Map<Integer,String> sentenceMap = new TreeMap<Integer,String>();

	        
	        StringBuilder stringBuilder = new StringBuilder();

	        char[] charArray = s.toCharArray();

	        int j=0;
	        for(int i=0;i<s.length();i++){
	            if(Character.isDigit(charArray[i])){
	            	
	                sentenceMap.put(Integer.parseInt(String.valueOf(charArray[i])), s.substring(j,i));
	                j = i+2;

	            }
	           
	        }

	        for(Map.Entry<Integer,String> entry: sentenceMap.entrySet()){
	            stringBuilder.append(entry.getValue()).append(' ');
	        } 

	        return stringBuilder.toString().trim();

	        
	    }
	 	public static void main(String[] args) {
			
			
			String s2 = "is2 sentence4 This1 a3";

			
			SortSentence sortSentence = new SortSentence();
			System.out.println(sortSentence.sortSentence(s2));
			
		}


}
