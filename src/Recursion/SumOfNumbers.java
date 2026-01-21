package Recursion;

public class SumOfNumbers {
	
	 	  public static void main(String[] args) {
		    long sumOfAllNumbers = sumOfAllNumbers(9);
		    System.out.println(sumOfAllNumbers);
		  }

		  /* A recursive Java example to sum all natural numbers up to a given long. */
		  public static long sumOfAllNumbers(long number) {
		  /* Stop the recursive Java program at zero */
		    if (number != 0) {
		    	
		     long result = 	number + sumOfAllNumbers(number - 1);
		      return result;
		     
		    } else {
		      return number;
		    }
		  }

}
