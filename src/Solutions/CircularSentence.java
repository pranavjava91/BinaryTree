package Solutions;


public class CircularSentence {
	public boolean isCircularSentence(String sentence) {

		char[] sentenceCharacters = sentence.toCharArray();

		boolean isCircular = true;

		String[] circularStrings = sentence.split("\\s+");
		
		if(sentence.charAt(0) != sentence.charAt(sentence.length()-1)) {
			return false;
				
			
		}
		

	
		for (int i = 0; i < sentence.length(); i++) {
			if ((Character.isWhitespace(sentenceCharacters[i])) && (sentence.charAt(i - 1) != sentence.charAt(i + 1))
					&&   (sentence.charAt(i - 1) != sentence.charAt(i + 1))) {
				isCircular = false;

			}
			

		}

		if (!isCircular) {
			for (String s : circularStrings) {
				if (s.charAt(0) != s.charAt(s.length() - 1)) {
					return false;
				}
			}
		}

		return isCircular;

	}

	public static void main(String[] args) {
		CircularSentence circularSentence = new CircularSentence();
		boolean result = circularSentence.isCircularSentence("Leetcode eisc cool");
		System.out.println(result);
	}

}
