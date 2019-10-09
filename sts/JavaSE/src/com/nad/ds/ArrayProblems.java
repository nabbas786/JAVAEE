package com.nad.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.IntStream;

public class ArrayProblems {

	public static int[] moveZerosToLast(int nums[]) {
		if (nums == null || nums.length == 0)
			return nums;
		int count = 0;
		for (int num : nums) {
			if (num != 0) {
				nums[count++] = num;
			}
		}
		while (count < nums.length) {
			nums[count++] = 0;
		}
		return nums;
	}

	public static int[] findTwoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					break;
				}
			}
		}
		return result;
	}

	public static int findMaxSumOfKthArray(int[] root, int split) {
		int sum = 0;
		for (int i = 0; i <= root.length - split; i++) {
			int temp = i;
			int tempSum = 0;
			for (int j = 0; j < split; j++) {
				tempSum += root[temp++];
			}
			sum = Math.max(sum, tempSum);
		}
		return sum;
	}

	// Sliding Window Maximum (Maximum of all subarrays of size k)
	/*
	 * Input : arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6} k = 3 Output : 3 3 4 5 5 5 6
	 * 
	 * Input : arr[] = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13} k = 4 Output : 10 10 10
	 * 15 15 90 90
	 */
	public static void findMaxELementFromSUbArray(int[] root, int k) {
		if (root.length < k) {
			System.out.println("Invalid size");
		}
		for (int i = 0; i <= root.length - k; i++) {
			int temp = i;
			int tempNum = 0;
			for (int j = 0; j < k; j++) {
				tempNum = Math.max(tempNum, root[temp++]);
			}
			System.out.print(tempNum + " ");
		}
	}

	/*
	 * Given an array of positive numbers and a positive number �S�, find the length
	 * of the smallest subarray whose sum is greater than or equal to �S�. Return 0,
	 * if no such subarray exists. Input: [2, 1, 5, 2, 3, 2], S=7 Output: 2
	 * Explanation: The smallest subarray with a sum great than or equal to '7' is
	 * [5, 2]. Example 2:
	 * 
	 * Input: [2, 1, 5, 2, 8], S=7 Output: 1 Explanation: The smallest subarray with
	 * a sum greater than or equal to '7' is [8].
	 * 
	 */
	public static void findSmallestSubArrayWhoseSumIsGreaterThanOrEqualTok(int[] root, int k) {
		int i = 1;
		for (int j = 0; j < root.length - i; j++) {
			int sum = 0;
			int[] subArray = new int[i];
			for (int a = 0; a <= i; a++) {
				subArray[a] = root[i++];
				sum += root[i++];
			}
		}
	}
	
	public static int shortestSubarray(int[] A, int K) {
		int n = A.length;
		int minLen = n + 1;
		int[] preSum = new int[n+1];
		preSum[0] = 0;
		for (int i = 0; i < n; i++) {
			preSum[i+1] = preSum[i] + A[i];
		}
		Deque<Integer> q = new LinkedList<>();
		for (int i = 0; i < n + 1; i++) {
			while (!q.isEmpty() && preSum[i] <= preSum[q.getLast()]) {
				q.pollLast();
			}

			while (!q.isEmpty() && preSum[i] - preSum[q.getFirst()] >= K) {
				int curLen = i - q.pollFirst();
				minLen = Math.min(minLen, curLen);
			}
			q.addLast(i);
		}
		return minLen == n + 1 ? -1 : minLen;
	}


	/*
	 * Input root="barmanfoothefooman" l={"bar","foo"} output [0,12]
	 */

	public List<Integer> findTheStartingIndeces(String root, String[] l) {
		ArrayList<Integer> returnList = new ArrayList<>();

		if (root == null || root.length() <= 0 || l.length <= 0)
			return returnList;
		int len = l[0].length();
		HashMap<String, Integer> words = new HashMap<>();
		Arrays.stream(l).forEach(w -> words.put(w, words.containsKey(w) ? words.get(w) + 1 : 1));

		return returnList;
	}

	/*
	 * input 1,2,5,1,2,3,5,6,5,4,2,6,4,3,2,2 output 1 2 3 4 5 6
	 */
	public static int[] removeDuplicateFromArray(int[] root) {
		if (root.length == 0) {
			return root;
		}
		int j = 0;
		Arrays.sort(root);
		int temp[] = new int[root.length];
		for (int i = 0; i < root.length - 1; i++) {
			if (root[i] != root[i + 1]) {
				temp[j++] = root[i];
			}
		}
		temp[j++] = root[root.length - 1];
		int res[] = new int[j];
		for (int i = 0; i < j; i++) {
			res[i] = temp[i];
		}
		return res;

	}

	public static int[] reverseArray(int[] root) {
		if (root.length == 0 || root.length == 1 || root.length == 2)
			return root;

		int start = 0, end = root.length - 1;
		int temp = 0;
		while (start < end) {
			temp = root[start];
			root[start] = root[end];
			root[end] = temp;
			start++;
			end--;
		}
		return root;
	}

	public static void findMissingNumber(int[] n) {
		int[] temp = new int[n.length];
		for (int i : n) {
			temp[i] = 1;
		}
		for (int i = 1; i < temp.length; i++) {
			if (temp[i] == 0) {
				System.out.println(i);
			}
		}
	}

	public static int square(int n) {
		return square(n, n);
	}

	public static int square(int n, int multi) {
		if (multi == 1)
			return n;
		if (multi % 2 == 0) {
			return square(n << 1, multi / 2);
		}
		return square(n << 1, multi / 2) + n;
	}

	public static int sumWithoutAdditionOperator(int a, int b) {
		if (b == 0)
			return a;
		if (a == 0)
			return b;
		else if (b > 0)
			return sumWithoutAdditionOperator(++a, --b);
		else
			return sumWithoutAdditionOperator(--a, ++b);
	}

	public static int[] findTwoSumOptimized(int[] nums, int k) {
		int[] result = new int[2];
		Set<Integer> comps = new HashSet<>();
		for (int n : nums) {
			int comp = k - n;
			if (comps.contains(comp)) {

			}
			comps.add(comp);
		}
		return result;
	}

	public static int[] sumArray(int[] nums) {
		int carry = 1;
		int[] res = new int[nums.length];
		for (int i = nums.length - 1; i >= 0; i--) {
			int sum = nums[i] + carry;
			res[i] = sum % 10;
			carry = sum / 10;
		}
		if (carry != 0) {
			int[] temp = new int[res.length + 1];
			temp[0] = carry;
			for (int i = 0; i < res.length; i++)
				temp[i + 1] = res[i];
			return temp;
		}
		return res;

	}

	static int[] sortit(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = i + 1;

		}
		return arr;
	}

	public static int[] sortInLeanearTime(int[] nums) {
		int zeros = 0, ones = 0, twos = 0;
		for (int n : nums) {
			switch (n) {
			case 0:
				zeros++;
				break;
			case 1:
				ones++;
				break;
			case 2:
				twos++;
				break;

			default:
				break;
			}
		}
		for(int i=0;i<nums.length;i++) {
			if(i<=zeros)
				nums[i]=0;
			else if(i>zeros&& i<=ones)
				nums[i]=1;
			else
				nums[i]=2;
		}
		return nums;
	}
	public static int findNumberOfWays(int n) {
		if(n==0 || n==1) return 1;
		return findNumberOfWays(n-1)+findNumberOfWays(n-2);
	}
	
	//Brute force solutino
	public static int [] productOfArray(int[] nums) {
		int [] result=new int[nums.length];
		int j=0;
		for(int i=0;i<nums.length;) {
			int temp=1;
			if(i==j)
				continue;
			temp*=nums[j];
			if(j>=nums.length-1) {
				result[i]=temp;
				i++;
			}
			j++;
		}
		return result;
	}
	public static int [] productOfArrayOptimized(int[] nums) {
		int [] result=new int[nums.length];
		int globalProduct=1;
		for(int i=0;i<nums.length;i++) {
			globalProduct*=nums[i];
		}
		for(int i=0;i<nums.length;i++)
			result[i]=globalProduct/nums[i];
		return result;
	}
	public static int [] productOfArrayUsingMemo(int[] nums) {
		int len=nums.length;
		if(len<=2) return nums;
		int [] result=new int[len];
		int product=1;
		for(int i=0;i<len;i++) {
			result[i]=product;
			product*=nums[i];
		}
		product=1;
		for(int i=len-1;i>=0;i--) {
			result[i]*=product;
			product*=nums[i];
		}
		return result;
	}
	public static int countDigitOne(int n) {
        int cur=1, q=n, res=0, pos;
        while (q>0){
            pos = q%10;
            q /= 10;
            res += q*cur;
            if (pos==1) res += n%cur+1;
            else if (pos>1) res += cur;
            cur *= 10;
        }
        return res;
    }

	public static int[] twoSum(int [] nums,int target) {
		
		Map<Integer, Integer> res=new HashMap<>();
		int[] arr=new int[2];
		for (int i = 0; i < nums.length-1; i++) {
			Integer val=res.get(target-nums[i]);
			if(val==null) {
				res.put(nums[i], i);
			}
			else {
				arr[0]=val;
				arr[1]=i;
				break;
			}
		}
		return arr;
	}
	static int findLargestContigusSum(int [] nums) {
		int max = nums[0];
        int calculator = 0;
        for(int i = 0 ; i < nums.length ; i++){
            calculator += nums[i];
            if(calculator <= 0){
                max = Math.max(max,calculator);
                calculator = 0;
                continue;
            }
            if(max < calculator) max = calculator;
        }
        return max;
	}
	public static void main(String[] args) {
		// System.out.println(findMaxSumOfKthArray(new int[] {1, 2, 3, 1, 4, 5, 2, 3,
		// 6},3));
		// findMaxELementFromSUbArray(new int[] { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 },
		// 4);
		// int[] result=removeDuplicateFromArray(new int[]
		// {1,2,5,1,2,3,5,6,5,4,2,6,4,3,2,2});
		// int []result=reverseArray(new int[] {1,2,5,1,2,3,5,6,5,4,2,6,4,3,2,2});
		// Arrays.stream(result).forEach(i->System.out.print(i+" "));
		// Arrays.stream(findTwoSum(new int[] {3,2,3},
		// 6)).forEach(i->System.out.print(i+" "));
		/*
		 * Arrays.stream(moveZerosToLast(new int[]
		 * {0,0,0,0,1,3,0,4,0,3})).forEach(i->System.out.print(i+" "));;
		 * findMissingNumber(new int[] {1, 1, 2, 3, 5, 5, 7, 9, 9, 9});
		 * System.out.println(sumWithoutAdditionOperator(23,45));
		 * System.out.println(square(11));
		 */
		/*
		 * sortit(new int[] { 8, 5, 10, 7, 9, 4, 15, 12, 90, 13 });
		 * sortInLeanearTime(new int[] { 2,1,0,1,1,1,0,0,1,2,1,0,1,0,1,0,1,0,2});
		 */
		//Arrays.stream(productOfArrayUsingMemo(new int[] {1,2,3,4,5})).forEach(a->System.out.print(a+" "));
		/*
		 * System.out.println(countDigitOne(23145)); ArrayList<Node> n=new
		 * ArrayList<Node>(); n.add(null); System.out.println(n);
		 */
		//int [] res=twoSum(new int[] {3,5,6,7,4}, 12);
		//System.out.println(res[0]+" "+res[1]);
		//System.out.println(findLargestContigusSum(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		System.out.println(shortestSubarray(new int[] {12,9,2,7,5,14,13}, 18));
	}
}