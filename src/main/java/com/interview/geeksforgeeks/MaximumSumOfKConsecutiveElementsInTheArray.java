package com.interview.geeksforgeeks;

//
//Input  : arr[] = {100, 200, 300, 400}, k = 2
//Output : 700
//
//Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
//Output : 39
//We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.
//
//Input  : arr[] = {2, 3}, k = 3
//Output : Invalid
//There is no subarray of size 3 as size of whole array is 2.
//


//Java code O(n*k) solution for finding maximum sum of
//a subarray of size k
public class MaximumSumOfKConsecutiveElementsInTheArray {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
        
	}

	private static int maxSum(int[] arr, int n, int k) {
		int max_sum = Integer.MIN_VALUE;
		for ( int i=0; i<n-k+1; i++) {
			int current_sum=0;
			for ( int j=0; j<k; j++) {
				current_sum = current_sum + arr[i+j];
			}
			max_sum = Math.max(current_sum, max_sum);
		}
		return max_sum;
	}

}
