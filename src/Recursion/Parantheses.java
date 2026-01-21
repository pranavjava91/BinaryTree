package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Parantheses {
	
	Map<String,List<Integer>> memoizedMap = new HashMap<String,List<Integer>>();

	public List<Integer> diffWaysToCompute(String expression) {
		List<Integer> results = new ArrayList<>();
		

		// Base case: if the string is empty, return an empty list
		if (expression.length() == 0)
			return results;

		// Base case: if the string is a single character, treat it as a number and
		// return it
		if (expression.length() == 1) {
			results.add(Integer.parseInt(expression));
			memoizedMap.put(expression, results);
			return results;
		}
		
		if(memoizedMap.containsKey(expression)) {
			return memoizedMap.get(expression);
		}

		// If the string has only two characters and the first character is a digit,
		// parse it as a number
		if (expression.length() == 2 && Character.isDigit(expression.charAt(0))) {
			results.add(Integer.parseInt(expression));
			memoizedMap.put(expression, results);
			return results;
		}

		// Recursive case: iterate through each character //2*3-4*5
		for (int i = 0; i < expression.length(); i++) {
			char currentChar = expression.charAt(i);

			// Skip if the current character is a digit
			if (Character.isDigit(currentChar))
				continue; // continues with next iteration in the loop

			// Split the expression into left and right parts
			List<Integer> leftResults = diffWaysToCompute(expression.substring(0, i));
			List<Integer> rightResults = diffWaysToCompute(expression.substring(i + 1));

			// Combine results from left and right parts
			for (int leftValue : leftResults) {
				for (int rightValue : rightResults) {
					int computedResult = 0;

					// Perform the operation based on the current character
					switch (currentChar) {
					case '+':
						computedResult = leftValue + rightValue;
						break;
					case '-':
						computedResult = leftValue - rightValue;
						break;
					case '*':
						computedResult = leftValue * rightValue;
						break;
					}

					results.add(computedResult);
				}
			}
		}

		return results;
	}

	public void diffWaysToComputeIterative(String expression) {

		for (int i = 0; i < expression.length(); i++) {
			char currentChar = expression.charAt(i);
			// Skip if the current character is a digit
			if (Character.isDigit(currentChar))
				continue; // continues with next iteration in the loop

		}

	}

	public static void main(String[] args) {
		Parantheses parantheses = new Parantheses();
		System.out.println(parantheses.diffWaysToCompute("2*3-4*5"));
	    parantheses.diffWaysToComputeIterative("2*3-4*5");

	}

}