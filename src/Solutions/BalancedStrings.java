package Solutions;

public class BalancedStrings {
	public int balancedStringSplit(String s) {

		int result = 0;

		int left = 0;

		int right = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'L') {
				left++;
			}
			if (s.charAt(i) == 'R') {
				right++;
			}

		}
		return right;

	}
	
	public static void main(String[] args) {
		BalancedStrings balancedStrings = new BalancedStrings();
		System.out.println(balancedStrings.balancedStringSplit("RLRRLLRLRL"));
	}

	
	

}
