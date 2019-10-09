package com.nad.ds;

public class MiscDSProblems {

	
	public static int findMaxStairCases(int blocks){

			if(blocks<=0)
				return 0;
			int stairCase=0;
			int stepCount=1;
			while(blocks>0){
				if(blocks<stairCase+1)
					break;
				stairCase++;
				blocks-=stepCount;
				stepCount++;
			}
			return stairCase;

	}
	public static void main(String[] args) {
		System.out.println(findMaxStairCases(2));
	}
}