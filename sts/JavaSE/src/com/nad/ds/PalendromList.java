package com.nad.ds;

import java.util.Stack;

public class PalendromList {

	public boolean isPalindrome(ListNode head) {
        ListNode last=head,mid=head;
        Stack<Integer> st=new Stack<Integer>();
        while(last !=null){
            st.push(mid.val);
            mid=mid.next;
            last=last.next.next;
        }
        while(mid.next!=null){
            if(mid.val !=st.pop())
                return false;
        }
        return true;
    }
	
	
	// Definition for singly-linked list.
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
	 
}
