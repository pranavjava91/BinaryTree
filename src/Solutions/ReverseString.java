package Solutions;

import java.util.Arrays;
import java.util.Stack;

public class ReverseString {
	public void reverseString(char[] s) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = s.length - 1; i >= 0; i--) {
			stringBuilder.append(s[i]);

		}
		stringBuilder.getChars(0, stringBuilder.length(), s, 0);

	}

	public void reverseStringStack(char[] s) {

		Stack<Character> charStack = new Stack<Character>();
		for (int i = 0; i < s.length; i++) {
			charStack.push(s[i]);
		}

		for (int i = 0; i < s.length; i++) {
			s[i] = charStack.pop();
		}

	}

	public void reverseStringRecursion(char[] s) {
		
		int start = 0;
		int end = s.length-1;
		
		helper(s,start,end);
		
		
	}

	private void helper(char[] s, int start, int end) {//h,e,l,l,o
		if(start>=end) {
			return;
		}
		
		char temp = s[start];
		s[start] = s[end];
		s[end] = temp;
		
		helper(s,start+1,end-1);
		
		
		
	}

	public static void main(String[] args) {
		ReverseString reverString = new ReverseString();

		String s = "hannah";

		reverString.reverseStringStack(s.toCharArray());
		reverString.reverseStringRecursion(s.toCharArray());
	}

}
