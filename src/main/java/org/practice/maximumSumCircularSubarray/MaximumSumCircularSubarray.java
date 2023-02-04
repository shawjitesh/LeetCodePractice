package org.practice.maximumSumCircularSubarray;

public class MaximumSumCircularSubarray {

    public int maxSubarraySumCircular(int[] nums) {

        int maxSum = Integer.MIN_VALUE, n = nums.length;

        for(int i = 0; i < n; i++) {
            int sum = nums[i];
            if(sum > maxSum) maxSum = sum;
            for(int j = (i + 1) % n, k = 1; k < n; j = (j + 1) % n) {
                sum += nums[j];
                if(sum > maxSum) maxSum = sum;
                k++;
            }
        }

        return maxSum;
    }
}
