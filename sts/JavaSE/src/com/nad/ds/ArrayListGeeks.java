package com.nad.ds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListGeeks {

	// Function to insert element into list
    public static void insert(ArrayList<Integer> list, int x)
    {
        list.add(x);
        
    }
    
    // Function to sort list in Increasing order
    public static void IncOrder(ArrayList<Integer> list)
    {
    	list.sort(Integer :: compareTo);
    }
    
    // Function to search element in the lise
    // val : element to be searched
    public static void Search(ArrayList<Integer> list, int val)
    {
        
        
        int flag = -1;
        for(int i=0;i<list.size();i++) {
        	if(list.get(i)==val) {
        		flag=i;
        		break;
        	}
        }
        if(flag == -1){
            System.out.println("-1");
        }
        else {
        	System.out.println(flag);
        }
        
    }
    
    // Function to sort list in decreasing order
    public static void DecOrder(ArrayList<Integer> list)
    {
    	Collections.reverseOrder(Integer :: compareTo);
    }
}
