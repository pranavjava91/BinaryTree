package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FullBinaryTree {
	

	    private Map<Integer, List<TreeNode>> memo = new HashMap<>();

	    public List<TreeNode> allPossibleFBT(int n) {
	        if (n % 2 == 0) {
	            return new ArrayList<TreeNode>();
	        }

	        if (n == 1) {
	            return Arrays.asList(new TreeNode());
	        }

	        if (memo.containsKey(n)) {
	            return memo.get(n);
	        }

	        List<TreeNode> res = new ArrayList<TreeNode>();
	        for (int i = 1; i < n; i = i+2) {
	            List<TreeNode> left = allPossibleFBT(i);
	            List<TreeNode> right = allPossibleFBT(n - i - 1);

	            for (TreeNode leftSubTree : left) {
	                for (TreeNode rightSubTree : right) {
	                    TreeNode root = new TreeNode(0, leftSubTree, rightSubTree);
	                    res.add(root);
	                }
	            }
	        }

	        memo.put(n, res);
	        return res;
	    }
	
	 
	  public static void main(String[] args) {
		  
	    	FullBinaryTree fullBinaryTree = new FullBinaryTree();
	    	
	    	int n = 5;
	    	
	    	List<TreeNode> treeNodes = fullBinaryTree.allPossibleFBT(n);
	    	
	    	for(TreeNode treeNode:treeNodes) {
	    		System.out.println(treeNode.val);

	    	}
	    	
		
	    }


}
