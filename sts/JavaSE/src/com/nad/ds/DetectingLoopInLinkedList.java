package com.nad.ds;

public class DetectingLoopInLinkedList {

	private Node root;
	
	public static void main(String[] args) {
		DetectingLoopInLinkedList detectLoopInLinkedList = new DetectingLoopInLinkedList();
		Node n1 = new Node(10);
		  Node n2 = new Node(20);
		  Node n3 = new Node(30);
		  Node n4 = new Node(40);
		  Node n5 = new Node(50);
		  Node n6 = new Node(60);
		  Node n7 = new Node(70);
		  Node n8 = new Node(80);
		 
		  detectLoopInLinkedList.root = n1;
		 
		  n1.setNextNode(n2);
		  n2.setNextNode(n3);
		  n3.setNextNode(n4);
		  n4.setNextNode(n5);
		  n5.setNextNode(n6);
		  n6.setNextNode(n7);
		  n7.setNextNode(n8);
		  n8.setNextNode(null);
		  
		  System.out.println(detectLoop(detectLoopInLinkedList.root));
	}
	
	public static boolean detectLoop(Node root) {
		Node slowPointer=root;
		Node fastPointerNode=root;
		while (fastPointerNode!=null || fastPointerNode.getNextNode()!=null) {
			slowPointer=root.getNextNode();
			fastPointerNode=root.getNextNode().getNextNode();
			if(slowPointer==fastPointerNode) {
				return true;
			}
		}
		return false;
	}
}
