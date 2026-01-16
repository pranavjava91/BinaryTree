package Solutions;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {


			ListNode dummy = new ListNode();
			ListNode ptr = dummy;
			
			while(list1!=null && list2!=null) {
				if(list1.val<=list2.val) {
					ptr.next = list1;
					list1 = list1.next;
				} else {
					ptr.next = list2;
					list2= list2.next;
					
				}
				
				ptr = ptr.next;
			}
			
			if(list1 != null) {
				ptr.next = list1;
			}
			
			if(list2 != null) {
				ptr.next = list2;
			}
			
			return dummy.next;
    }
	
	 public static void main(String[] args) {
		   MergeTwoLists mergeTwoLists = new MergeTwoLists();
	    	ListNode node1 = new ListNode(1,new ListNode(2));
	    	ListNode node2 = new ListNode(2,new ListNode(3));

	    	
	    	
	    	
	    	
	    	System.out.println(mergeTwoLists.mergeTwoLists(node1, node2));
	    	
	 }

}
