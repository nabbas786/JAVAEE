package com.nad.ds;

import java.math.BigInteger;
import java.util.Queue;

public class QueueGeeks {

	 // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k){
        q.add(k);
        
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
    	int count=0;
    	for(int n : q) {
    		if(n==k) {
    			count++;
    		}
    	}
		return count;
        
        // Your code here
        
    }

	
    static void checkString(String s)
    {
        int v=0;
        int c=0;
        
       for(int i=0;i<s.length();i++) {
    	   if(Character.isWhitespace(s.charAt(i))) {
    		   continue;
    	   }
    	   switch (s.charAt(i)) {
		case 'a':
			v++;
			break;
		case 'e' :
			v++;
			break;
		case 'i':
			v++;
			break;
		case 'o' :
			v++;
			break;
		case 'u':
			v++;
			break;
		case ' ':
			break;
		default:
			c++;
			break;
		}
       }
    }
    
}
