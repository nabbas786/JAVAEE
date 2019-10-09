package com.nad.ds;

public class TestExample {

	public static void main(String[] args) {
		countChars("cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpu", "dniciuehstodlqxhhcydvccfpbbpczqdiczfwhsgdbvrgewfyajbahsicalrxhavovgxdwkinrcmwpmpxurkuxtrfdpencvkvxvs");

	}
	/*
	 * cgudllrbrjlgvxuheeuwpewiylhnthzprofdxysmsgwkcztglzedalvcgostfavcmxpcvyhzpqhffojqqytooathdjfxyezuhbpu
	 * dniciuehstodlqxhhcydvccfpbbpczqdiczfwhsgdbvrgewfyajbahsicalrxhavovgxdwkinrcmwpmpxurkuxtrfdpencvkvxvs
	 */
    static int coutChars(String s1, String s2)
    {
        int len=0;
        int count=0;
        if(s1.length()<=s2.length()) {
        	len=s1.length();
        	count=s2.length()-s1.length();
        }else {
        	len=s2.length();
        	count=s1.length()-s2.length();
        }
       
        for(int i=0;i<len;i++){
			if (s1.length() > i && s2.length() > i) {
				if (s1.charAt(i) != s2.charAt(i)) {
					count++;
				}
			}
        }
		return count;
       
    }
    static int countChars(String s1,String s2) {
    	int[] arr = new int[26];
    	int sum = 0;
    	int len2 = s2.length();
    	int len1 = s1.length();

    	for (int i = 0; i < len1; i++){
    	arr[ s1.charAt(i) - 'a']++;
    	}

    	for (int j = 0; j < len2; j++){
    	arr[ s2.charAt(j) - 'a']--;
    	}

    	for (int v = 0; v <26; v++){
    	sum += Math.abs(arr[v]); 
    	}

    	return sum;
    }
}
