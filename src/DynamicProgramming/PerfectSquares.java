package DynamicProgramming;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class PerfectSquares {
	
	public int numSquaresMath(int n) {

		// Lagrange's Four Square theorem : every positive integer can be written as the sum of at most four squares
		       // answer to this question can be 1 or 2 or 3 or 4 only.
			   
			   
		        if(n == 0) return 0;
		        
				// case 1:
		        if(isSqrt(n)) return 1;
		        
				   // case 2 :If answer is 2 => one factor has to be (int)square_root and remaining other number has to be a perfect square
		        for(int i=1; i<=Math.sqrt(n); i++){
		            if(isSqrt(n-(i*i))) return 2;
		        }
		        
				 // case 4: a positive integer can be expressed as the sum of three squares if and only if it is not of the form 4^k(8m+7) for some int k and m see "not of" in above line
				 
		        // in order to pass 28 as 4
		        while(n%4 ==0)
		            n=n/4;
		        
		        if(n%8 == 7){
		            return 4;    // handling 4^k
		        }
		        
				 // case 3
		        return 3;
		    }
		    
		    private boolean isSqrt(int n){
		        int sqrt = (int)Math.sqrt(n);
		        
		        return n-(sqrt*sqrt)==0;
		    }

	public int numSquaresBFS(int n) {
		Queue<Integer> queue = new LinkedList<>();
		Set<Integer> reviewedSet = new HashSet<>();

		if (n > 0)
			queue.offer(n);
		int level = 0;
		while (!queue.isEmpty()) {
			level++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				int val = queue.poll();
				if (!reviewedSet.add(val))
					continue;

				for (int j = 1; j <= Math.sqrt(val); j++) {
					if (val - (j * j) == 0)
						return level;
					queue.offer(val - (j * j));
				}
			}
		}

		return level;
	}

	public int numSquaresRecursion(int n) {
		if (n < 4)
			return n;

		int ans = n;

		for (int i = 1; i * i <= n; i++) {
			int square = i * i;
			ans = Math.min(ans, 1 + numSquaresRecursion(n - square));
		}

		return ans;
	}

	public int numSquaresMemoization(int n) {
		int[] memo = new int[n + 1];
		return helper(n, memo);
	}

	public int helper(int n, int[] memo) {
		if (n < 4)
			return n;

		if (memo[n] != 0)
			return memo[n];

		int ans = n;

		for (int i = 1; i * i <= n; i++) {
			int square = i * i;
			ans = Math.min(ans, 1 + helper(n - square, memo));
		}

		return memo[n] = ans;
	}
	
	

	public int numSquaresDynamicProgramming(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;

		for (int i = 1; i <= n; i++) {
			dp[i] = i;

			for (int j = 1; j * j <= i; j++) {
				int square = j * j;
				dp[i] = Math.min(dp[i], 1 + dp[i - square]);
			}
		}

		return dp[n];
	}

	public static void main(String[] args) {

		int n = 4;

		PerfectSquares perfectSquares = new PerfectSquares();
		System.out.println(perfectSquares.numSquaresRecursion(n));

		System.out.println(perfectSquares.numSquaresMemoization(n));
		System.out.println(perfectSquares.numSquaresDynamicProgramming(n));

	}

}
