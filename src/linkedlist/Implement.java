package linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Implement {
	
	public static void main(String[] args) {
		
		Implement implement = new Implement();
		
		
		ListNode node1 = new ListNode(4);
		
		ListNode node2 = new ListNode(3);
		
		ListNode node3 = new ListNode(2);
		
		ListNode head = implement.insertAtBeginning(node1, 15);

		head.next = node1;
		
		node1.next = node2;
		
		node2.next = node3;
		
		node3.next = null;
		
		
		head = implement.insertAtEnd(head, 20);
		
		
		ListNode middleNode = implement.InsertInMiddle(head, 10,3);
		
		//head = implement.deleteFromBeginning(head);
				
		//head = implement.deleteFromEnd(head);
		
		//head = implement.deleteFromMiddle(head,3);
		
//		  ListNode ptr = head;
//		  
//		  while(ptr!=null) { 
//			  System.out.println(ptr.val); 
//			  ptr = ptr.next; 
//	      }
		  implement.printInReverseUsingRecursion(head);
		
	}
	
	public void printInReverseUsingRecursion(ListNode head) {
		
		
	    if(head.next == null) {
	    	return;
	    }
	    
	    printInReverseUsingRecursion(head.next);
	    
	    System.out.println(head.val);
		
		
	
	}
	
	public void customePrintInReverse(ListNode head) {
		
		   ListNode ptr = head;

	        boolean result = false;

	        Stack<Integer> reverseStack = new Stack<Integer>();

	        List<Integer> intList = new ArrayList<Integer>();

	        while(ptr != null){
	            reverseStack.push(ptr.val);
	        }

	        intList.addAll(reverseStack);

	        for(int i=intList.size();i>=0;i--){
	        	if(intList.get(i) == reverseStack.pop()) {
	        		result = true;
	        	}
	            
	            System.out.println(intList.get(i));

	        }
	        
	      
				
		
	}
	
	
	public void printInReverseStack(ListNode head) {
		
		// print in reverse
		
				Stack<Integer> reverseStack = new Stack<Integer>();
				
				ListNode ptr = head;
				
				
				while(ptr!=null) {
					reverseStack.push(ptr.val);
					ptr = ptr.next;
				}
				
				while(!reverseStack.isEmpty()) {
				    System.out.println(reverseStack.pop()); 
				}
				
		
	}
	
	
	public ListNode insertAtBeginning(ListNode head,int val) {
		
		ListNode newNode = new ListNode(val);
		
		newNode.next = head;
		
		head = newNode;
		
		return head;
		
	}
	
	public ListNode deleteFromBeginning(ListNode head) {
		
		head = head.next;
		
		
		
		return head;
		
	}
	
	public ListNode deleteFromEnd(ListNode head) {
		
		
		ListNode ptr = head;
		
		while(ptr.next.next != null) {
			ptr = ptr.next;
		}
		
		ptr.next = null;
		
		
		
		return head;
		
	}
	
   public ListNode deleteFromMiddle(ListNode head,int position) {
		
		
		ListNode ptr = head;
		
		for(int i=0;i<position-1;i++) {
			ptr = ptr.next;
		}
		
		ptr.next = ptr.next.next;
		
		
		
		
		return head;
		
	}
	
	public ListNode insertAtEnd(ListNode head,int val) {
		
		  // Create a node to insert
	    ListNode newNode = new ListNode(val);

	    // Goto the end of the list
	    ListNode ptr = head;
	    while (ptr.next != null) {
	      ptr = ptr.next;
	    }

	    // Assign the newNode at the end of the list
	    ptr.next = newNode;	
		
		return head;
		
		
		
	}
	
	public ListNode InsertInMiddle(ListNode head, int val, int position) {
		
		ListNode newNode = new ListNode(val);
		
		ListNode ptr = head;
		
		for(int i=0;i<position;i++) {
			ptr = ptr.next;
		}
		
		
		newNode.next = ptr.next;
		
		ptr.next = newNode;

		
		return head;
		
		
	}

}
