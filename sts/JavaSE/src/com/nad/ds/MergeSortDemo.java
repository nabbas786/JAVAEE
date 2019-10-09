package com.nad.ds;

public class MergeSortDemo {

	Node strartNode;
	
	public MergeSortDemo() {

		Node node1=new Node(20);
		Node node2=new Node(34);
		Node node3=new Node(10);
		Node node4=new Node(25);
		Node node5=new Node(31);
		Node node6=new Node(42);
		Node node7=new Node(9);
		Node node8=new Node(2);
		Node node9=new Node(29);
		Node node10=new Node(39);
		
		node1.setNextNode(node2);
		node2.setNextNode(node3);
		node3.setNextNode(node4);
		node4.setNextNode(node5);
		node5.setNextNode(node6);
		
		node6.setNextNode(node7);
		node7.setNextNode(node8);
		node8.setNextNode(node9);
		node9.setNextNode(null);
		//node10.setNextNode(null);
		strartNode=node1;
	}
	private Node mergeSortLinkedList(Node startNode) {
		if(startNode==null || startNode.getNextNode()==null) {
			return startNode;
		}
		Node middle =findMiddle(startNode);
		Node middleNext=middle.getNextNode();
		middle.setNextNode(null);
		
		Node left=mergeSortLinkedList(startNode);
		Node right=mergeSortLinkedList(middleNext);
		
		return mergeRecursivly(left, right);
	}
	
	private Node mergeRecursivly(Node left,Node right) {
		if(left==null)
			return right;
		if(right==null)
			return left;
		Node temp=null;
		if ((int) left.getData() < (int) right.getData()) {
			temp=left;
			temp.setNextNode(mergeRecursivly(left.getNextNode(),right));
		}else {
			temp=right;
			temp.setNextNode(mergeRecursivly(right.getNextNode(), left));
		}
		return temp;
	}
	private Node findMiddle(Node startNode) {
		if(startNode==null || startNode.getNextNode()==null) {
			return startNode;
		}
		Node ptr1=startNode;
		Node ptr2=startNode.getNextNode();
		
		while(ptr2!=null && ptr2.getNextNode()!=null) {
			ptr1=ptr1.getNextNode();
			ptr2=ptr2.getNextNode().getNextNode();
		}
		return ptr1;
	}
	public static void main(String[] args) {
		MergeSortDemo merge=new MergeSortDemo();
		Node sorted=merge.mergeSortLinkedList(merge.strartNode);
		while(sorted.getNextNode()!=null) {
			System.out.print(sorted.getData()+" ");
			sorted=sorted.getNextNode();
		}
	}
}
