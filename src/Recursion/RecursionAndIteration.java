package Recursion;

public class RecursionAndIteration {
	
	 public static void main(String[] args) {
		 callMyselfRecursion(9);
		 callMyselfIteration(9);
		 
		    
		  }
		  /* The recursive Java method */
		  public static void callMyselfRecursion(long i) {
		    if (i < 0) {
		      return;
		    }
		    System.out.print(i);
		    i = i - 1;
		    callMyselfRecursion(i);
		  }
		  
		  public static void callMyselfIteration(long i) {
			  System.out.println();
			  for(int j=(int) i;j>=0;j--) {
				  System.out.print(j);
			  }
			  
		   }

}
