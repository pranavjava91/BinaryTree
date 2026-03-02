package practice;

public class InterviewBit {

	int calculate(int a, int b) {
		try {
			return a - b;
		} catch (Exception e) {
			return a + b;
		} finally {
			return a * b;
		}
	}
}

 class Driver {
	public static void main(String args[]) {
		InterviewBit obj1 = new InterviewBit();
		int result = obj1.calculate(2, 3);
		System.out.println("Result: " + result);
	}
}