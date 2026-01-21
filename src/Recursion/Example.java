package Recursion;

public class Example {
	

		  public static void main(String[] args) {
		    boolean flag = palindromeCheck("sitonapanotis");
		    System.out.println(flag);
		    flag = palindromeCheck("nien");
		    System.out.println(flag);
		    flag = palindromeCheck("amanaplanacanalpanama");
		    System.out.println(flag);

		  }
		  /* Recursive Java example to check for palindromes */
		  public static boolean palindromeCheck(String s){
		    if(s.length() == 0 || s.length() == 1) {
		      return true;
		    }
		    if(s.charAt(0) == s.charAt(s.length()-1)) {
		      boolean pc = palindromeCheck(s.substring(1, s.length()-1));
		      return pc;
		    }
		    return false;
		  }
		

}
