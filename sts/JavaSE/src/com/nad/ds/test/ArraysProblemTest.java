package com.nad.ds.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.doNothing;

import java.io.PrintStream;

import org.hamcrest.core.IsAnything;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import com.nad.ds.ArrayProblems;

public class ArraysProblemTest {

	int []nums=null;
	int [] expected=null;
	@Before
	public void setUp() {
		
		nums=new int[] {1,2,5,1,2,3,5,6,5,4,2,6,4,3,2,2};
		expected=new int[] {1,2,3,4,5,6};
	}
	
	@Test
	public void testTwoSum() {
		int []result=ArrayProblems.removeDuplicateFromArray(nums);
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void reverseArrayTest() {
		assertArrayEquals(new int[] {6,5,4,3}, ArrayProblems.reverseArray(new int[] {3,4,5,6}));
	}
	
	@Test
	public void testFindMaxELementFromSUbArray() {
		doNothing().when(Mockito.mock(ArrayProblems.class));
		ArrayProblems.findMaxELementFromSUbArray(new int[] {3,4,5,6}, isA(Integer.class));
	}
	@After
	public void tearDown() {
		nums=null;
		expected=null;
	}
}
