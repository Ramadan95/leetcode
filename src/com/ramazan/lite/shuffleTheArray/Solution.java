package com.ramazan.lite.shuffleTheArray;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[n * 2];
        int a = 0;
        int b = n;
        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0)
                res[i] = nums[a++];
            else
                res[i] = nums[b++];
        }
        return res;
    }
}