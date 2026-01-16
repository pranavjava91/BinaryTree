package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree {
	
		public List<Integer> inorderTraversalWithoutRecursion(TreeNode root) {
			
			Stack<TreeNode> inorderStack = new Stack<TreeNode>();
			List<Integer> inorderList = new ArrayList<Integer>();
			
			while(true) {
				if(root != null) {
					inorderStack.push(root);
					root = root.left;
				} else {
					if(inorderStack.isEmpty()) {
						break;
					}
					root = inorderStack.pop();
					inorderList.add(root.val);
					root = root.right;
				}
			}
			return inorderList;
		}
		
      
	
	 	public List<Integer> inorderTraversalWithRecursion(TreeNode root) {

	        List<Integer> result = new ArrayList<Integer>();
	        helper(root,result);
	        return result;
	        
	    }

	    public void helper(TreeNode root, List<Integer> result){
	        if(root == null){
	            return;
	        }

	        helper(root.left, result);
	        result.add(root.val);
	        helper(root.right,result);
	    }
	    
	    public static void main(String[] args) {
	    	BinaryTree binaryTree = new BinaryTree();
	    	TreeNode root = new TreeNode(1);
	    	
	    	root.left = new TreeNode(2);
	    	
	    	root.right = new TreeNode(3);
	    	
	    	root.left.left = new TreeNode(4);
	    	root.left.right = new TreeNode(5);
	    	
	    	root.left.right.left = new TreeNode(6);
	    	root.left.right.right = new TreeNode(7);

	    	root.left.right.left.left = null;
	    	root.left.right.left.right = null;

	    	
	    	root.right.right = new TreeNode(8);
	    	root.right.right.left = new TreeNode(9);
	    	root.right.right.left.right = null;
	    	
	    	System.out.println(binaryTree.inorderTraversalWithRecursion(root));
	    	System.out.println(binaryTree.inorderTraversalWithoutRecursion(root));

	    		
		
	    }
	    
	  
}
