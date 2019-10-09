package com.nad.ds;

import java.util.Hashtable;

public class LinkedListDemo {

	private Node<Integer> head = null;

	public LinkedListDemo(Node head) {
		super();
		this.head = head;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((head == null) ? 0 : head.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof LinkedListDemo)) {
			return false;
		}
		LinkedListDemo other = (LinkedListDemo) obj;
		if (head == null) {
			if (other.head != null) {
				return false;
			}
		} else if (!head.equals(other.head)) {
			return false;
		}
		return true;
	}

	public  int findNthElementFromLastUsingPointers(int nthNode) {
		Node tempHead=this.head,tempNthNode=null;
		
		
		return 0;
	}

	public  boolean isCircular() {
		Node temp=this.head;
		int counter=1;
		boolean isCirular=false;
		Hashtable<Integer, Integer> listHash= new Hashtable<>();
		do {
			if(listHash.contains(temp.getData().hashCode())){
				isCirular=true;
			}
			listHash.put((Integer) temp.getData().hashCode(), counter++);
			temp=temp.getNextNode();
		}while(!isCirular || temp.getNextNode()!=null);
		return isCirular;
	}
	public boolean isCircularUsingFloyed() {
		Node slowPtr=head;
		Node fastPtr=head;
		
		while(fastPtr !=null && fastPtr.getNextNode() !=null) {
			fastPtr=fastPtr.getNextNode().getNextNode();
			slowPtr=slowPtr.getNextNode();
			if(fastPtr.getData() ==slowPtr.getData()) {
				return true;
			}
		}
		
		  return false;
	}
	public Node<Integer> detectLoopUsingHashTable() {
		Node<Integer> temp=this.head;
		boolean isCirular=false;
		int hash=0;
		Hashtable<Integer, Node<Integer>> listHash= new Hashtable<>();
		do {
			 hash=temp.hashCode();
			if(listHash.containsKey(hash)) {
				isCirular=true;
				break;
			}
			listHash.put(hash, temp);
			temp=temp.nextNode;
		}while(!isCirular || temp.getNextNode()!=null);
		if(isCirular) {
			return listHash.get(hash);
		}
		return temp;
	}
	public Node detectLoop() {
		Node slowPtr=head;
		Node fastPtr=head;
		
		while(fastPtr !=null && fastPtr.getNextNode() !=null) {
			fastPtr=fastPtr.getNextNode().getNextNode();
			slowPtr=slowPtr.getNextNode();
			if(fastPtr.getData() ==slowPtr.getData()) {
				break;
			}
		}
		fastPtr=head;
		while(fastPtr.data != slowPtr.data) {
			fastPtr=fastPtr.nextNode;
			slowPtr=slowPtr.nextNode;
		}
		return fastPtr;
	}
	public static void main(String[] args) {
		Node<Integer> n1 = new Node(10);
		Node<Integer> n2 = new Node(20);
		Node<Integer> n3 = new Node(30);
		Node<Integer> n4 = new Node(40);
		Node<Integer> n5 = new Node(50);
		Node<Integer> n6 = new Node(60);
		Node<Integer> n7 = new Node(70);
		Node<Integer> n8 = new Node(80);
		Node<Integer> n9 = new Node(90);
		Node<Integer> n10 = new Node(100);
		Node<Integer> n11 = new Node(110);
		

		LinkedListDemo head = new LinkedListDemo(n1);
		n1.setNextNode(n2);
		n2.setNextNode(n3);
		n3.setNextNode(n4);
		n4.setNextNode(n5);
		n5.setNextNode(n6);
		n6.setNextNode(n7);
		n7.setNextNode(n8);
		n8.setNextNode(n9);
		n9.setNextNode(n10);
		n10.setNextNode(n11);
		n11.setNextNode(n6);
		
		
		//System.out.println(head.findNthElementFromLastUsingPointers(2));
		//System.out.println(head.isCircularUsingFloyed());
		System.out.println(head.detectLoopUsingHashTable().data);
	}
}