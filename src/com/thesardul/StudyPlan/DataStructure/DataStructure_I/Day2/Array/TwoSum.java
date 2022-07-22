package com.thesardul.StudyPlan.DataStructure.DataStructure_I.Day2.Array;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2,7,11,15};
        int result[] = twoSum(a, 9);
        for(int i : result)
            System.out.println(i);
    }

    private static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (hMap.containsKey(temp)) {
                int x = hMap.get(temp);
                return new int[] { i, x };
            } else {
                hMap.put(nums[i], i);
            }
        }
        return nums;
    }
}
