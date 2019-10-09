package com.nad.ds;

/*An ABC notation in a tree is defined as folllows: 
1. "0" means travel left 
2. "1" means travel right 
3. "Undefined" means hit the root 
4. "Not Found" means not present in tree 

Given a BST insertion order, {5,2,8,3,6,9,1} find the ABC notation for 6, 1, 10, 2
 which is "10","00","NotFound", "0"
 
 */
public class BSTNodeSearch {

	
	
	public String bstSearch(TreeNode root,int num) {
		if(root==null)
			return "NotFound";
		if(root.getData()==num)
			return "Undefined";
		String str=bst(root,num);
		return str;
	}
	
	public String bst(TreeNode node,int num) {
		
		if(node==null)
			return "Not Found";
		if(node.getData()==num)
			return "found";
		
		if(node.getData()>num) {
			String str=bst(node.getLeft(),num);
			if(str.equals("NotFound")) {
				return str;
			}else if(str.equals("found")){
				return "0";
			}else {
				return "0"+str;
			}
		}
		if(node.getData()<num) {
			String str=bst(node.getRight(),num);
			if(str.equals("NotFound")) {
				return str;
			}else if(str.equals("found")){
				return "1";
			}else {
				return "1"+str;
			}
		}
		return null;
	}
	
}
