package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Palindrome {
	
	public boolean isPalindrome(ListNode head) {
		
					ListNode ptr = head;

			        boolean result = false;

			        Stack<Integer> reverseStack = new Stack<Integer>();

			        List<Integer> intList = new ArrayList<Integer>();

			        while(ptr != null){
			            reverseStack.push(ptr.val);
			            ptr = ptr.next;
			        }

			        intList.addAll(reverseStack);

			        for(int i=0;i<=intList.size()-1;i++){
			        	if(!reverseStack.isEmpty() && intList.get(i) == reverseStack.pop()) {
			        		result = true;
			        	} else {
			        		result = false;
			        	}
			            
			            System.out.println(intList.get(i));

			        }
			        
			       return result;
		    }		
			
	public static void main(String[] args) {
		
		Palindrome palindrome = new Palindrome();
		

		
		ListNode head = new ListNode(1,new ListNode(2));
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
    	
    	
    	



		
		System.out.print(palindrome.isPalindrome(head));
		
	}

}
