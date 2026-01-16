package Solutions;

import java.util.Arrays;

public class BuySellStock {
	
	  public int maxProfit(int[] prices) {
		  int min = Integer.MAX_VALUE;
		  int maxProfit = 0;

		for(int i=0;i<prices.length;i++) {
			if(prices[i]<min) {
				min = prices[i];
		    	//System.out.println(min);

				
			}
			
			int currentProfit = prices[i]-min;
	    	System.out.println(currentProfit);

			if(currentProfit>maxProfit) {
				maxProfit = currentProfit;

			}
		}
		  
		return maxProfit;
	        
	  }
	  
	  public static void main(String[] args) {
		  
		    int[] nums = {7,1,5,3,6,4};
		    BuySellStock b  = new BuySellStock();
	    	int result = b.maxProfit(nums);
		  
	  }

}
