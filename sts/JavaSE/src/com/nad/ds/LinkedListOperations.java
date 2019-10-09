package com.nad.ds;

import com.nad.ds.PalendromList.ListNode;

public class LinkedListOperations {

	public static Node reverse(Node head) {
		if (head == null || head.nextNode == null)
			return head;

		Node remaining = reverse(head.getNextNode());
		head.nextNode.nextNode = head;
		head.nextNode = null;
		return remaining;
	}

	// 1 2 3 4 5 6 7
	// 2 1 4 3 6 5 7
	public static Node rotateRight(Node head, int k) {
		if (head == null || head.nextNode==null)
			return head;
		Node tail=head;
		int len=0;
		while(tail!=null) {
			tail=tail.nextNode;
			len++;
		}
		k=k%len;
		Node firstNode=head;
		while(k!=0)
		{
			firstNode=firstNode.nextNode;
			k--;
		}
		Node secondNode=head;
		while(firstNode.nextNode!=null) {
			firstNode=firstNode.nextNode;
			secondNode=secondNode.nextNode;
			
		}
		firstNode.nextNode=head;
		Node newHead=secondNode.nextNode;
		secondNode.nextNode=null;
		return newHead;
		
	}

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);

		n1.nextNode = n2;
		n2.nextNode = n3;
		n3.nextNode = n4;
		n4.nextNode = n5;
		n5.nextNode = n6;
		n6.nextNode = n7;
		n7.nextNode = null;
		Node newNode = rotateRight(n1, 2);
		while (newNode != null) {
			System.out.println(newNode.data);
			newNode = newNode.nextNode;
		}
		// Node reverse=reverse(n1);
	}
}
