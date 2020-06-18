package com.ramazan.lite.runningSumOf1dArray;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[]{3,1,2,10,1})));
    }

    public static int[] runningSum(int[] nums) {
        int temp = 0;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + temp;
            temp = nums[i];
        }
        return nums;
    }
}
