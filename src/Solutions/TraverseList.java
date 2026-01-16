package Solutions;

public class TraverseList {
	
	public int traverse(ListNode head) {
		
		int count = 0;
		
		while(head.next != null){
			count++;
			
		}
		
		return count;
		
	}

	 public static void main(String[] args) {
		 
		    TraverseList traverseList = new TraverseList();
	    	ListNode head = new ListNode(1,new ListNode(2));
	        head.next = new ListNode(20);
	        head.next.next = new ListNode(30);
	        head.next.next.next = new ListNode(40);
	        head.next.next.next.next = new ListNode(50);
	    	
	    	System.out.println(traverseList.traverse(head));
	    	
	 }
}
