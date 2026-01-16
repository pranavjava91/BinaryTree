package Solutions;

public class DuplicateCharacter {
	
	public String findDuplicates(String s) {
		
		StringBuilder stringBuilder = new StringBuilder();
		
		char[] chars = s.toCharArray();
				
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+1;j<s.length();j++) {
				StringBuilder charSequence = new StringBuilder();
				 charSequence.append(chars[j]);
				if(chars[i] == chars[j] && (!stringBuilder.isEmpty() &&
						!stringBuilder.toString().contains(charSequence))){
					stringBuilder.append(chars[i]);
				} else if(chars[i] == chars[j] && stringBuilder.isEmpty()) {
					stringBuilder.append(chars[i]);

				} 
			}
		}
		
		return stringBuilder.toString();
		
	}
	
	public static void main(String[] args) {
		
		//String s = "abcdeb";
		
		//String s1 = "abcdabc";
		
		String s2 = "pwwkew";

		
		DuplicateCharacter duplicateCharacter = new DuplicateCharacter();
		System.out.println(duplicateCharacter.findDuplicates(s2));
		
	}

}
