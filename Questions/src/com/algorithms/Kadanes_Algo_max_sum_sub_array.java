package com.algorithms;

/*
 * 
Problem Statement: Maximum Subarray Sum (Kadane's Algorithm)
Given:
An array of integers (which may include both positive and negative numbers).

Task:
Find the maximum sum of any contiguous subarray.

📥 Input:
An array of integers, e.g., [-2, 1, -3, 4, -1, 2, 1, -5, 4]

📤 Output:
The maximum sum of any contiguous subarray.

For the above input, the output is 6 (subarray [4, -1, 2, 1])

 */
public class Kadanes_Algo_max_sum_sub_array {
	public static void main(String[] args) {
		System.out.println(printMaxSumSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

	public static int printMaxSumSubArray(int[] arr) {

		if (arr.length <= 1)
			return arr.length == 1 ? arr[0] : 0;

		int maxSum = arr[0];
		int currSum = arr[0];
		int start = 0, end = 0, tempStart = 0;
		for (int i = 1; i < arr.length; i++) {
//			currSum = Math.max(arr[i], currSum + arr[i]);
//			maxSum = Math.max(maxSum, currSum);

			// or
			if (arr[i] > currSum + arr[i]) {
				tempStart = i;
			} 
			currSum = Math.max(arr[i], currSum + arr[i]);
			if (currSum > maxSum) {
				start = tempStart;
				end = i;
			}
			maxSum = Math.max(maxSum, currSum);
		}
		System.out.println(start + "  " + end);
		// Print start and end
        System.out.println("Start Index: " + start + ", End Index: " + end);
        System.out.print("Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(", ");
        }
		System.out.println("]");

		return maxSum;
	}
}
