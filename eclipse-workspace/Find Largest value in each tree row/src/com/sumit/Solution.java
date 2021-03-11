package com.sumit;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	
  //structure of tree node
  public class TreeNode{
			
			int val;
			TreeNode left;
			TreeNode right;
			TreeNode(){}
			TreeNode(int val)
			{
				this.val=val;
			}
			
			TreeNode(int val, TreeNode left, TreeNode right)
			{
				this.val=val;
				this.left=left;
				this.right =right;
			}
   }
			
	/*
	 * Compare the size of list with level and if it is equal, add the current node at that 
	 * level and keep on proceed. So now after one sub tree when it comes to same level back
	 * and finds that if there is another node to be added for that level in list, we find
	 * the max value between current node to be added at the level and value that is already
	 * there in list for that level and update the vale at the level with max value.
	 * 
	 * 
	 */
   public List<Integer> largestValues(TreeNode root) 
   {
        
        List<Integer> res = new ArrayList<>();
        
        findLargestValueInEachRow(res, 0, root);
        return res;
        
    }
    
    private void findLargestValueInEachRow(List<Integer>res, int level, TreeNode root){
        
    	if (root==null)
        {
            return;
        }
        
        if(res.size()==level)
        {
            res.add(root.val);
        }
        else
        {  //updating the value for level
           res.set(level,Math.max(res.get(level), root.val));
        }
        
        findLargestValueInEachRow(res,level+1,root.left);
        findLargestValueInEachRow(res,level+1,root.right);
        
    }

}
