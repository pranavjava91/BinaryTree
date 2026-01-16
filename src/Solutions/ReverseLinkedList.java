package Solutions;

import java.util.Arrays;

public class ReverseLinkedList {
	
	public ListNode reverseList(ListNode head) {
		
		if(head==null) {
			return head;
		}
		
		ListNode previous = null;
		ListNode current = head;
		ListNode next = current.next;
		
		while(current !=null) {
			current.next = previous;
			previous = current;
			current = next;
			
			if(next!=null) {
				next = current.next;
				
			}
		}
		head = previous;
		return head;
		
	}
	
	 public static void main(String[] args) {
	    	ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
	    	ListNode node1 = new ListNode(1,new ListNode(2));
	    	
	    	
	    	
	    	
	    	System.out.println(reverseLinkedList.reverseList(node1));
	    	
	 }

}
