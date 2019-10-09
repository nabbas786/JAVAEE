package com.nad.ds;

public class LinkedListProblems {

	
	 public static  Node addTwoNumbers(Node l1, Node l2) {
	        
	        int carry=0;
	        Node result=new Node(0);
	        while(l1.getNextNode() !=null && l2.getNextNode() !=null){
	        	int num=(Integer)l1.getData()+(Integer)l2.getData()+carry;
        		carry=num/10;
	            Node temp=new Node(num%10);
	            l1=l1.getNextNode();
	            l2=l2.getNextNode();
	            result.setNextNode(temp);
	            result=result.getNextNode();
	        }
			return result.getNextNode();
	    }
	 public static Node<Integer> reverseByK(Node<Integer> head,int k){
		 Node<Integer> prev=null;
		 Node<Integer> curr=head;
		 Node<Integer> next=null;
		 
		 int count=0;
		 while(count<k) {
			 next=curr.nextNode;
			 curr.nextNode=prev;
			 prev=curr;
			 curr=next;
			 count++;
		 }
		 if(next!=null)
			 head.nextNode=reverseByK(next, k);
		 
		 return prev;
	 }
	 public static void main(String[] args) {
		   Node<Integer> node1=new Node<Integer>(11);
			Node<Integer> node2=new Node<Integer>(2);
			Node<Integer> node3=new Node<Integer>(3);
			Node<Integer> node4=new Node<Integer>(4);
			Node<Integer> node5=new Node<Integer>(5);
			Node<Integer> node6=new Node<Integer>(6);
			node1.setNextNode(node2);
			node2.setNextNode(node3);
			node3.setNextNode(node4);
			node4.setNextNode(node5);
			node5.setNextNode(node6);
			node6.setNextNode(null);
			Node<Integer> head=reverseByK(node1, 2);
	}
}
