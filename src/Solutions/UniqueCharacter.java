package Solutions;
import java.util.Map;
import java.util.HashMap;



public class UniqueCharacter {
	
	    public int firstUniqChar(String s) {


	         int count =0;         
	         Map<Character,Integer> countMap = new HashMap<>();

	         for(int i=0;i<s.length();i++){
	            char ch = s.charAt(i);
	           

	            if(countMap.containsKey(ch)){
	                 countMap.put(ch,countMap.get(ch)+1);
	            } else{
	                countMap.put(ch,1);
	            }
	         }

	        for(int i =0;i<s.length();i++){
	            char ch = s.charAt(i);
	            if(countMap.get(ch)==1){
	                return i;
	            }
	        }


	        return -1;
	        
	     }

	    
	
	    
	    public static void main(String[] args) {
			
			
			String s2 = "loveleetcode";

			
			UniqueCharacter uniqueCharacter = new UniqueCharacter();
			System.out.println(uniqueCharacter.firstUniqChar(s2));
			
		}

}
