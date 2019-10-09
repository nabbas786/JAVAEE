package com.nad.ds;

import java.util.ArrayList;
import java.util.List;

public class TreeQuestions {

	public static List<Integer> rightSideView(TreeNode root) {
	    List<Integer> vals = new ArrayList<>();
	    
	    rightSideViewHelper(root, vals, 0);
	    
	    return vals;
	}

	public static void rightSideViewHelper(TreeNode root, List<Integer> levels, int level) {
	    if (root == null) {
	        return;
	    }
	    
	    if (level >= levels.size()) {
	        levels.add(root.data);
	    } else {
	        levels.set(level, root.data);
	    }
	    
	    rightSideViewHelper(root.left, levels, level + 1);
	    rightSideViewHelper(root.right, levels, level + 1);
	}
	 	static TreeNode prev;
	    public static boolean isValidBST(TreeNode root) {
	        
	        if(root==null )
	            return true;
	        boolean isLeftBST=isValidBST(root.left);
	        if(!isLeftBST)
	            return false;
	        if(prev!=null && prev.data>=root.data)
	            return false;
	        prev=root;
	        return isValidBST(root.right);
	        
	        
	    }
	 public static TreeNode findLCA(TreeNode root,int a,int b) {
		 while(true) {
			 if(root.data>a && root.data>b)
				 root=root.left;
			 else if(root.data< a && root.data<b)
				 root=root.right;
			 else
				 return root;
		 }
	 }
	 public static int getDistance(TreeNode root,int dest) {
		 if(root.data==dest)
			 return 0;
		 TreeNode node=root.left;
		 if(root.data<dest)
			 node=root.right;
		 return 1+getDistance(node, dest);
		 
	 }
	 public static int findDistanceBetweenNodes(TreeNode root, int a,int b) {
		 if(root==null)return 0;
		 TreeNode lca=findLCA(root, a, b);
		 return getDistance(lca, a)+getDistance(lca, b);
	 }
	public static void main(String[] args) {
		TreeNode root=new TreeNode(5);
		TreeNode r1=new TreeNode(2);
		TreeNode l2=new TreeNode(3);
		TreeNode r2=new TreeNode(4);
		TreeNode l3=new TreeNode(1);
		TreeNode l4=new TreeNode(6);
		TreeNode l5=new TreeNode(7);
		TreeNode l6=new TreeNode(8);
		root.setLeft(l2);
		root.setRight(l4);
		l2.setRight(r2);
		l2.setLeft(r1);
		r1.setLeft(l3);
		l4.setRight(l5);
		l5.setRight(l6);
		//rightSideView(root);
		//isValidBST(root);
		//TreeNode lca=findLCA(root, 1, 6);
		
		System.out.println(findDistanceBetweenNodes(root, 1, 4));
		
	}
}
