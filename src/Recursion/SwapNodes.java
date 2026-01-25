package Recursion;

public class SwapNodes {

	public ListNode swapPairs(ListNode head) {

		return helper(head);

	}

	public ListNode helper(ListNode head) {
		if (head == null || head.next == null) {
			return head;

		}
		ListNode ptr = head;
		int temp = ptr.val;
		ptr.val = ptr.next.val;
		ptr.next.val = temp;
		helper(ptr.next.next);

		return ptr;
	}

	public static void main(String[] args) {

		ListNode head = new ListNode(1, new ListNode(2));
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);



		SwapNodes swapNodes = new SwapNodes();
		ListNode result = swapNodes.swapPairs(head);
		
		while(result != null) {
			System.out.println(result.val);
			result = result.next;
		}
		
	}

}
