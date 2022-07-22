package com.thesardul.StudyPlan.DataStructure.DataStructure_I.Day1.Array;

public class MaximumSubArrayLargestSum {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }

    private static int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE, maxSumHere = 0;
        for(int i = 0; i < nums.length; i++){
            maxSumHere += nums[i];
            if(maxSum < maxSumHere)
                maxSum = maxSumHere;
            if(maxSumHere < 0)
                maxSumHere = 0;
        }
        return maxSum;
    }
}
