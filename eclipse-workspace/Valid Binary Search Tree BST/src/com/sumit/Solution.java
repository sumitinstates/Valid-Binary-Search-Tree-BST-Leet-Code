package com.sumit;

import javax.swing.tree.TreeNode;

public class Solution {
	
	//structure of tree node
	public class TreeNode{
		
		int val;
		
		TreeNode left;
		TreeNode right;
		TreeNode(){}
		TreeNode(int val){
			this.val=val;
		}
		TreeNode(int val, TreeNode left, TreeNode right){
			this.val=val;
			this.left=left;
			this.right =right;
		}
	}
	
	
	public static boolean isValidBST(TreeNode root) 
    {
        //calling recursive method.
        return isValid(root,null,null);
       
    }
       
	
    private static boolean isValid(TreeNode root, Integer min, Integer max)
    {
        
        if(root==null){
            return true;
        }
        
        if(min!=null && min>=root.val || max!=null && max<=root.val)
        {
            return false;
        }
        
        //we wanna check if both sub tree on left side and right side of root node
        return isValid(root.left, min, root.val) && isValid(root.right, root.val, max);
        
    }


}
